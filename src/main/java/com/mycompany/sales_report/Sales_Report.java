/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sales_report;

import java.util.Scanner;

/**
 *
 * @author rendz
 */
public class Sales_Report {

    public static void main(String[] args) {
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int months = 3;
        int[][] sales = new int[names.length][months];
        Scanner in = new Scanner(System.in);

        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < months; m++) {
                System.out.print("Enter number of sales for month " + (m + 1) + " for " + names[p] + " mattress: ");
                sales[p][m] = in.nextInt();
            }
            System.out.println();
        }

        IProduct product = new Product(names, sales);
        PrintProduct printer = new PrintProduct(product);
        printer.PrintHeader();
        printer.PrintTotalProductSales();
        printer.PrintAverageProductSales();
        printer.PrintMostPopularProduct();
    }
}
 