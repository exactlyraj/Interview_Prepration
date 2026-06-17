package ratelimit;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ConcurrentHashMap;

public class TestRateLimit {
    public static void main (String args[]){
        for(int i =0; i<15;i++) {
            boolean status = rateLimitter("Abhinav");
            System.out.println("User is able to access url "+ status);
        }
    }
    private static int maxcount = 3;
    private static int timeinmillis = 10;
    private static ConcurrentHashMap<String, Deque<Long>> chm = new ConcurrentHashMap<>();


    public static boolean rateLimitter(String user){
         Long currentTime = System.currentTimeMillis();
         chm.putIfAbsent(user, new ArrayDeque<>());
         Deque<Long> req = chm.get(user);
         synchronized (req){
             while(!req.isEmpty() && (currentTime - req.peekFirst()>timeinmillis)){
                 req.pollFirst();
             }
             if(req.size() < maxcount){
                 req.addLast(currentTime);
                 return true;
             }else{
                 return false;
             }

         }
    }
}
