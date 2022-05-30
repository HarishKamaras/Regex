package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {
    public static void firstName() {

        String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = scanner.next();
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();

        if(result == true){
            System.out.println("First Name is valid");
        }

        else
            System.out.println("First Name is Invalid");
    }
    public static void lastName() {

        String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Last Name:");
        String lastName = scanner.next();

        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();

        if(result == true)
            System.out.println("Last Name is Valid");
        else
            System.out.println("Last Name is Invalid");
    }
    public static void email(){
        String emailPattern= "[a-zA-Z0-9]+[.+-]{0,1}[0-9a-zA-Z]*@[a-z0-9]+[.][a-z]{2,4}[.a-z]{0,4}";
        System.out.println("Enter your Email:");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        Pattern pattern2=Pattern.compile(emailPattern);
        Matcher matcher2=pattern2.matcher(email);
        boolean result2=matcher2.matches();

        if(result2== true){
            System.out.println("true");
        }else{
            System.out.println("Email is not valid");
        }}
    public static void mobileNumber() {
        Scanner scanner = new Scanner(System.in);
        String MobileNumberPattern = "(91-)?[0-9]{10}";
        System.out.println("Enter the phone number");
        String phoneNumber = scanner.next();

        Pattern pattern3 = Pattern.compile(MobileNumberPattern);
        Matcher matcher3 = pattern3.matcher(phoneNumber);
        Boolean result3 = matcher3.matches();

        if (result3 == true) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile number is invalid");
        }
    }
    public static void passwordRule1(){
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern="[a-zA-Z0-9~!@#$]{8,}";
        System.out.println("Enter the Password");
        String passWord=scanner.next();

        Pattern pattern4=Pattern.compile(PasswordPattern);
        Matcher matcher4=pattern4.matcher(passWord);
        Boolean result4=matcher4.matches();

        if(result4==true){
            System.out.println("Password is valid");
        }else{
            System.out.println("Invaild, please enter minimum 8 character");
        }

    }
    public static void passwordRule2(){
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern="^(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
        System.out.println("Enter the Password");
        String passWord=scanner.next();

        Pattern pattern4=Pattern.compile(PasswordPattern);
        Matcher matcher4=pattern4.matcher(passWord);
        Boolean result4=matcher4.matches();

        if(result4==true){
            System.out.println("Password is valid");
        }else{
            System.out.println("Invaild, please enter one upper case and minimum 8 character");
        }
    }
    public static void passwordRule3() {
        Scanner scanner = new Scanner(System.in);
        String PasswordPattern = "^(?=.*[0-9])(?=.*[A-Z])[a-zA-Z0-9@#$%^&+]{8,}$";
        System.out.println("Enter the Password");
        String passWord = scanner.next();

        Pattern pattern4 = Pattern.compile(PasswordPattern);
        Matcher matcher4 = pattern4.matcher(passWord);
        Boolean result4 = matcher4.matches();

        if (result4 == true) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Invaild, please enter one number and minimum 8 character");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Regex : ");
       // firstName();//UC1
        //lastName();//UC2
        //email();//UC3
        //mobileNumber();//UC4
        passwordRule1();//UC5
        passwordRule2();//UC6
        passwordRule3();//UC7
    }
}
