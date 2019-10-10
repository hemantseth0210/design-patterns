package com.sethjava.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {

    public void saveToFile(Journal journal, String fileName, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(fileName).exists()){
            try(PrintStream out = new PrintStream(fileName)){
                out.println(journal.toString());
            }
        }
    }

    public Journal load(String fileName){
        return null;
    }
    public Journal load(URL url){
        return null;
    }
}
