package com.cpprhtn;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=5, j=0;

        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);

        i=5;
        j=0;

        j = ++i;
        System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
    }
}