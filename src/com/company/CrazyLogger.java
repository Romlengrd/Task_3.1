package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.lang.StringBuilder;
import java.time.format.DateTimeFormatter;

public class CrazyLogger {

    int nowD = LocalDate.now().getDayOfMonth();
    int nowM = LocalDate.now().getMonthValue();
    int nowY = LocalDate.now().getYear();
    int nowH = LocalTime.now().getHour();
    int nowMin = LocalTime.now().getMinute();
    String[] log = new String[15];

    public String construct (String ss)
    {
        StringBuilder s = new StringBuilder();
        s.append(nowD+"-");
        s.append(nowM+"-");
        s.append(nowY+":");
        s.append(nowH+"-");
        s.append(nowMin+"-");
        s.append(ss);
        for (int i=0; i<10;i++){
            if(log[i]==null) log[i]=s.toString();
            break;
        }
        return s.toString();
    }

    public int capacity () {
        int count = 0;
        for (int i=0; i<10;i++){
            if(log[i]==null) count++;
        }
        return count;
    }

    public void search (String f) {
        for (int i=0; i<10;i++){
            if (log[i]!=null) {
                if (log[i].contains(f)) System.out.println(log[i]);
            }
        }
    }


}
