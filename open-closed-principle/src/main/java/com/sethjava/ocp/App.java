package com.sethjava.ocp;


import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Product apple = new Product("Apple", Color.RED, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.YUGE);

        List<Product> products = Arrays.asList(apple, tree, house);

        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green products (old): ");
        productFilter.filterByColor(products, Color.GREEN)
                .forEach(p -> System.out.println(" - " + p.getName() + " is green"));

        BetterFilter betterFilter = new BetterFilter();
        System.out.println("Green products (new): ");
        betterFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.println(" - " + p.getName() + " is green"));

        System.out.println("Yuge Blue products (new): ");
        betterFilter.filter(products,
                new AndSpecification<>(
                        new ColorSpecification(Color.BLUE),
                        new SizeSpecification(Size.YUGE)
                )).forEach(p -> System.out.println(" - " + p.getName() + " is yuge and blue"));
    }
}
