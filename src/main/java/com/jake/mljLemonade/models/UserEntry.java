package com.jake.mljLemonade.models;

public class UserEntry {
    private String regQty;
    private String strQty;
    private String solution;

    public UserEntry(String regQty, String strQty) {
        this.regQty = regQty;
        this.strQty = strQty;

        int val1 = Integer.parseInt(regQty);
        int val2 = Integer.parseInt(strQty);

        this.solution = String.valueOf((val1*2) + (val2*3));

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

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}