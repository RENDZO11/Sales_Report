/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sales_report;

/**
 *
 * @author rendz
 */
public class Product implements IProduct{
     private String[] names;   // single-dimensional array
    private int[][] sales;    // two-dimensional array [product][month]

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    private int productTotal(int p) {
        int t = 0;
        for (int v : sales[p]) t += v;
        return t;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++) total += productTotal(p);
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int entries = sales.length * sales[0].length;
        return (double) GetTotalProductsSold() / entries;
    }

    @Override
    public String GetMostPopularProduct() {
        int best = 0;
        for (int p = 1; p < sales.length; p++) {
            if (productTotal(p) > productTotal(best)) best = p;
        }
        return names[best] + " (" + productTotal(best) + ")";
    }
}


