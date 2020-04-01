package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 5;
	double e=.1;
	double a = 0;
	double sum = 0;

	for ( int i = 0; i<=n; i++) {
		a = 1/Math.pow(2,i)+1/Math.pow(3,i);

	    if ( Math.abs(a)>=e ) sum +=a;


    }
        System.out.println(sum);

    }
}
