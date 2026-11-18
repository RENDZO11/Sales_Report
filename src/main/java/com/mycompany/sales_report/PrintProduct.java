/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sales_report;

import java.text.DecimalFormat;

/**
 *
 * @author rendz
 */
public class PrintProduct {
      private IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void PrintHeader() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(50));
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
        System.out.println("AVERAGE PRODUCT SALES: " + new DecimalFormat("0.##").format(product.GetAverageProductSold()));
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}

