package com.swaggerex4.swaggerex4;

public class Order {

    private String customername;
    private int phonenumber;
    private String emailid;
    private String productname;
    private String city;
    private int price;

public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }
    
    
    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }
  public String getCity() {
        return city;
    }

    public void setCity(String quantity) {
        this.city = city;
    }
   public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}