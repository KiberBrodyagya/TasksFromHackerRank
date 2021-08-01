package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
    static void Java_Output_Formatting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        boolean b = true;
        for(int i = 0; i < 3; i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            d(s1, x);
        }
        System.out.println("================================");
    }
    static void d(String s1, int x){
        if(s1.length() < 15){
            for (int i = s1.length(); i < 15; i++)
                s1 += " ";
        }
        if (x < 10){
            s1 += "00";
            System.out.println(s1 + x);
        }else if (x >= 10 & x < 100){
            s1 += "0";
            System.out.println(s1 + x);
        }else if (x >= 100){
            System.out.println(s1 + x);
        }
    }
    static void Java_Stdin_and_Stdout_II(){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextFloat();
        String s = scan.nextLine();
        if(scan.hasNext())
            s += scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    static void Java_Stdin_and_Stdout() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if (N % 2 != 0)
            System.out.println("Weird");
        else if (N % 2 == 0 && N > 2 && N < 5)
            System.out.println("Not Weird");
        else if (N % 2 == 0 && N > 6 && N <= 20)
            System.out.println("Weird");
        else if (N % 2 == 0 && N > 20)
            System.out.println("Not Weird");
    }
}
