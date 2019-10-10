package com.sethjava.ocp;

import java.util.List;
import java.util.stream.Stream;

// Every time if there is a change in filter criteria we need to change this class. Imagine if the product can be
// filtered by 100 criteria this would become problem because we are making change in the already tested class.
// According to OpenClosed Principle a class should be only open for extension and closed for modification. This code
// clearly breaking that principle.
public class ProductFilter {

    // 1st change by client after the production release
    Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(p -> p.getColor().equals(color));
    }

    // 2nd change by client after the production release
    Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(p -> p.getSize().equals(size));
    }

    // 3rd change by client after the production release
    Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size){
        return products.stream().filter(p -> p.getColor().equals(color) && p.getSize().equals(size));
    }
}
