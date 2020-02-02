package com.sethjava.designpatterns;

public class Main {

    public static void main(String[] args) {
	    HtmlBuilder builder = new HtmlBuilder("ul");
	    builder.addChild("li", "Hello")
                .addChild("li", "World");
        System.out.println(builder);
    }
}
