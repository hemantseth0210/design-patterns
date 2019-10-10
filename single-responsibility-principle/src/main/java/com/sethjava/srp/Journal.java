package com.sethjava.srp;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text){
        entries.add("" + (++count) + " : " + text);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
/*
    Adding the below methods in Journal class going to break the Single Responsibility Principle.
    According to the SRP a class should handle only one responsibility. Adding persistence related
    method in Journal class is increasing it's responsibility beyond the journal tasks. So we should
    move persistence related methods to a new class. As we created Persistence class.

    public void save(String fileName) throws FileNotFoundException {
        try(PrintStream out = new PrintStream(fileName)){
            out.println(toString());
        }
    }
    public void load(String fileName){}
    public void load(URL url){}
 */
}
