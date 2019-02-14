package com.halo;

public class Main {

    public static void main(String[] args) {
	    System.out.println("hello world");
        System.out.println(HaloInternal.getCallCount());
        HaloInternal.someFn();
        System.out.println(HaloInternal.getCallCount());
        HaloInternal.someFn();
        System.out.println(HaloInternal.getCallCount());
    }
}
