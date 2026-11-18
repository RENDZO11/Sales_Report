/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.sales_report;

import com.mycompany.sales_report.Product;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductTest {
    private final String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    private final int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        assertEquals(153, new Product(names, sales).GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        assertEquals(17.0, new Product(names, sales).GetAverageProductSold(), 0.001);
    }
}
