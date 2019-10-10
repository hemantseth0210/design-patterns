package com.sethjava.isp;

public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document document) {
        //
    }

    /*
    OldFashionedPrinter is forced to implement the unwanted methods/functionalities.
    That is why Interface Segregation Principle can be useful. We break the interface
    into Printer, Scanner etc and add it to the implementation class as per the need.
     */
    @Override
    public void fax(Document document) {

    }

    @Override
    public void scan(Document document) {

    }
}
