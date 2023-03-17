package com.hillel.pinkovskiy.homeworks.homework19;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public List<Product> getBooksAbove250(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public List<Product> getDiscountedBooks(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(Product::isDiscount)
                .peek(product -> product.setPrice(product.getPrice() * 0.9))
                .collect(Collectors.toList());
    }
    public Product getCheapestBook(List<Product> productList) throws Exception {
        return productList.stream()
                .filter(product -> product.getType().equals("Book"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElseThrow(() -> new Exception("Продукт [категорія:Book] не знайдено"));
    }

    public List<Product> getLastThreeProducts(List<Product> productList) {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
    public double getTotalCostOfBooks(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getType().equals("Book"))
                .filter(product -> product.getPrice() <= 75)
                .filter(product -> product.getDateAdded().getYear() == LocalDate.now().getYear())
                .mapToDouble(Product::getPrice)
                .sum();
    }
    public Map<String, List<Product>> groupProductsByType(List<Product> productList) {
        return productList.stream()
                .collect(Collectors.groupingBy(Product::getType));
    }
}
