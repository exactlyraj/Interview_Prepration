package ratelimit;

import java.util.*;
import java.util.concurrent.*;

public class RateLimiter {
    // Store user -> list of request timestamps
    private final Map<String, Deque<Long>> userRequests = new ConcurrentHashMap<>();
    private final int MAX_REQUESTS = 3;
    private final long TIME_WINDOW_MS = 10;

    public boolean rateLimiting(String user) {
        long now = System.currentTimeMillis();

        // Get or create deque for this user
        userRequests.putIfAbsent(user, new ArrayDeque<>());
        Deque<Long> requests = userRequests.get(user);

        synchronized (requests) {
            // Remove timestamps older than the window
            while (!requests.isEmpty() && (now - requests.peekFirst()) > TIME_WINDOW_MS) {
                requests.pollFirst();
            }

            if (requests.size() < MAX_REQUESTS) {
                // Allow request
                requests.addLast(now);
                return true;
            } else {
                // Deny request
                return false;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RateLimiter limiter = new RateLimiter();
        String user = "Abhinav";

        for (int i = 1; i <= 5; i++) {
            boolean allowed = limiter.rateLimiting(user);
            System.out.println("Request " + i + " allowed? " + allowed);
            Thread.sleep(2); // simulate small delay
        }
    }
}

