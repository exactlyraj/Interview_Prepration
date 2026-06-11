package hackerRankQueries;

import java.net.StandardSocketOptions;
import java.util.List;

public class DayOfProgrammer {
    public static void main(String args[]){
        String date = dayOfProgrammer(2100);
        System.out.println(date);
    }

    public static String dayOfProgrammer(int year) {
        // Write your code here
        String date="";
        if(year == 1918){
            date = "26.09."+year;
        }else if(year<1918 & year%4==0){
            date = "12.09."+year;
        }else if(year<1918 & year%4!=0){
            date = "13.09."+year;
        }else if((year%400==0) || (year>1918 && year%4==0 && year%100!=0)){
            date = "12.09."+year;
        }else{
            date = "13.09."+year;
        }
        return date;
    }



}

