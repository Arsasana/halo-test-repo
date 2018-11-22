package com.halo;

public class HaloInternal {
    static int callCount;

    public HaloInternal(){
        callCount = 0;
    }

    public static int getCallCount(){
        return callCount;
    }

    public static void someFn(){
        callCount++;
        System.out.println("Function called. New called count: " + callCount);
    }
}
