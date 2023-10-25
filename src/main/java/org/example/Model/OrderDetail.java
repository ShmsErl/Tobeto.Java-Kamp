package org.example.Model;

public class OrderDetail {


    private int id;
    private int orderShipss;

    public OrderDetail() {
    }

    public OrderDetail(int id, int orderShipss) {
        this.id = id;
        this.orderShipss = orderShipss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderShipss() {
        return orderShipss;
    }

    public void setOrderShipss(int orderShipss) {
        this.orderShipss = orderShipss;
    }
}
