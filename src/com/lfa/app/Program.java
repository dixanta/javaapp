package com.lfa.app;

import com.lfa.app.entity.Employee;
import java.util.Scanner;

public class Program{

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        Employee emp=new Employee();
        System.out.println("Enter Id:");
        emp.setId(input.nextInt());

        System.out.println("Enter Name:");
        emp.setName(input.next());

        System.out.println(emp.getName());
    }
}