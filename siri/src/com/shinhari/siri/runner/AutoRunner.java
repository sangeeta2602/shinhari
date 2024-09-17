package com.shinhari.siri.runner;

import com.shinhari.siri.boot.Auto;

public class AutoRunner {
    public static void main(String [] args) {
    	Auto ref = new Auto();
    	ref.setPrice(200);
    int amount=	ref.getPrice();
    	System.out.println(amount);
    }
}
