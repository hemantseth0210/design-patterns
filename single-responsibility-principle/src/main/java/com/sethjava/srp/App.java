package com.sethjava.srp;

public class App
{
    public static void main( String[] args ) throws Exception {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I went to market after the work");
        System.out.println(journal);

        Persistence persistence = new Persistence();
        String fileName = "c:\\temp\\journal.txt";
        persistence.saveToFile(journal, fileName, true);

        Runtime.getRuntime().exec("notepad.exe " + fileName);
    }
}
