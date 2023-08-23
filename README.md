# nested-if-.java
nested if example programme on 3 subject marks


//Java programm to demonstrate if else 
//else.java
//Ch.Henry
//23-08-2023

import java.io.*;
import java.util.*;
public class ElseIf {
    public static void main(String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter marks of 3 subjects");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int total =s1+s2+s3;
        float avg = total/3;
        System.out.println("The total marks of the student"+total);
        if(avg>=75)
        {
            
            if(avg>=95)
                {
                    System.out.println("student average is "+avg+"your average is top 5 percent");
                }
            else if(avg>=90)
            {
                System.out.println("student average is "+avg+"your average is top 10 percent");
            }
             System.out.println("Student average is "+avg+"student passed with disticton");
        }
        else if(avg>=60&&avg<75)
        {
         System.out.println("Student average is "+avg+"student passed with first class");
        }
        else
        {
            System.out.println("Student is failed");
        }
    }
}
