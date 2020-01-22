package com.sethjava.strategy;

import com.sethjava.strategy.publishing.OutputFormat;
import com.sethjava.strategy.publishing.TextProcessor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TextProcessor textProcessor = new TextProcessor(OutputFormat.MARKDOWN);
        textProcessor.appendList(Arrays.asList("liberte", "egalite", "fraternite"));
        System.out.println(textProcessor);

        textProcessor.clear();
        textProcessor.setOutputFormat(OutputFormat.HTML);
        textProcessor.appendList(Arrays.asList("inheritence", "encapsulation", "polymorphism"));
        System.out.println(textProcessor);
    }
}
