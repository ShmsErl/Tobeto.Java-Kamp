package org.example.Model;

public class Order {

    private int id;

    private int userId;
    private String orderDate;

    private String requiredDate;

    public Order() {
    }

    public Order(int id, int userId, String orderDate, String requiredDate) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }
    public void info(){
        System.out.println(this.getId() + " " + this.getUserId() + " " + this.getOrderDate() + " " + this.getRequiredDate());
    }
}
