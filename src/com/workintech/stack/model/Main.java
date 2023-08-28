package com.workintech.stack.model;

import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Text text1=new Text("Was it a car or a cat I saw ?");
        Text text2=new Text("hello");
        Text text3=new Text("Racecar");
        Text text4=new Text("I did, did I?");

        Stack<Text> stack=new Stack<>();
        stack.push(text1);
        stack.push(text2);
        stack.push(text3);
        stack.push(text4);
        /*System.out.println(text4.isPalindom());
        System.out.println(text3.isPalindom());
        System.out.println(text2.isPalindom());
        System.out.println(text1.isPalindom());
*/
        System.out.println("Stact.first is palindome ? : "   + stack.pop().isPalindom());
        System.out.println("Stact.first is palindome ? : "   + stack.pop().isPalindom());
        System.out.println("Stact.first is palindome ? : "   + stack.pop().isPalindom());
        System.out.println("Stact.first is palindome ? : "   + stack.pop().isPalindom());



    }
}
