package com.jake.mljLemonade.models;

public class UserInfo {
    private String regQty;
    private String strQty;
    private String solution;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String creditCard;
    private String expiration;
    private String csv;

    public UserInfo(String regQty, String strQty, String firstName, String lastName, String address, String city, String state, String zip, String creditCard, String expiration, String csv) {
        this.regQty = regQty;
        this.strQty = strQty;
        int val1 = Integer.parseInt(regQty);
        int val2 = Integer.parseInt(strQty);
        this.solution = String.valueOf((val1*2) + (val2*3));
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.creditCard = creditCard;
        this.expiration = expiration;
        this.csv = csv;


    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getRegQty() {
        return regQty;
    }

    public void setRegQty(String regQty) {
        this.regQty = regQty;
    }

    public String getStrQty() {
        return strQty;
    }

    public void setStrQty(String strQty) {
        this.strQty = strQty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getCsv() {
        return csv;
    }

    public void setCsv(String csv) {
        this.csv = csv;
    }
}
