package org.example.Model;

public class Product {

    private int id;

    private String productName;

    private double unitPrice;

    private int unitInStock;

    private int category_id;

    public Product() {
    }

    public Product(int id, String productName, double unitPrice, int unitInStock, int category_id) {
        this.id = id;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.category_id = category_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public void info(){
        System.out.println(this.getId() + " " + this.getProductName() + " " + this.getCategory_id() + " " + this.getUnitPrice() + "" + this.getUnitInStock());
    }
}
