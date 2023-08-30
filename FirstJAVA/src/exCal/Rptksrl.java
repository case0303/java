package exCal;

import java.util.Scanner;

public class Rptksrl {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" 정수 입력 >>");
        int num01 = scan.nextInt();
        System.out.print(" 연산 입력 >>");
        String x = scan.next();
        System.out.print(" 정수 입력 >>");
        int num02 = scan.nextInt();
        System.out.println("==============");
        int sum = 0;
        
        switch(x) {
        case "*":  sum = num01 * num02;
        System.out.println(num01 + "*" + num02 + "=" + sum);
        break;
        case "+" : sum = num01 + num02;
        System.out.println(num01 + "+" + num02 + "=" + sum);
        break;
        case "-" : sum = num01 - num02;
        System.out.println(num01 + "-" + num02 + "=" + sum);
        break;
        case "/" : sum = num01 / num02;
        System.out.println(num01 + "/" + num02 + "=" + sum);
        break;
        default :
        	System.out.println("제대로 입력하셈");
        	break;
        
        }
        
        
//        if (x.equals("*")) {
//            sum = num01 * num02;
//            System.out.println(num01 + "*" + num02 + "=" + sum);
//        } else if (x.equals("+")) {
//            sum = num01 + num02;
//            System.out.println(num01 + "+" + num02 + "=" + sum);
//        } else if (x.equals("-")) {
//            sum = num01 - num02;
//            System.out.println(num01 + "-" + num02 + "=" + sum);
//        } else if (x.equals("/")) {
//            sum = num01 / num02;
//            System.out.println(num01 + "/" + num02 + "=" + sum);
//        } else {
//            System.out.println("잘못된 연산자 입력");
//        }

        scan.close();
    }
}