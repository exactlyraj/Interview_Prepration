package ratelimit;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimit2 {
    public static void main(String args[]){
        for (int i = 0; i < 5; i++) {
            String user = "Abhinav";
            boolean status = ratelimit(user);
            System.out.println("User is able to access url " + status);
        }
    }

    static int maxcount = 3;
    static int maxmilli = 10;
    static Map<String, Deque<Long>> mp = new ConcurrentHashMap<>();

    public static boolean ratelimit(String user) {
        Long currentTime = System.currentTimeMillis();
        mp.putIfAbsent(user, new ArrayDeque<>());
        Deque<Long> req = mp.get(user);
        synchronized (req) {
            while (!req.isEmpty() && (currentTime - req.peekFirst() > maxmilli)) {
                req.pollFirst();
            }

            if (req.size() < maxcount) {
                req.addLast(currentTime);
                return true;
            } else {
                return false;
            }
        }
    }

}