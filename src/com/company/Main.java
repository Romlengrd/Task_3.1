package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Здесь не ввенден while для записи всего лога, т.к. все равно работу программы*/
        CrazyLogger c = new CrazyLogger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сообщение лога (емкость лога 15 записей), свободно " + c.capacity());
        String ss= sc.next();
        System.out.println(c.construct(ss));
        System.out.println("Введите строку для поиска");
        String f = sc.next();
        c.search(f);
        sc.close();
    }
}
