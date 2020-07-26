package com.untitled.cardetails;
import java.io.Serializable;
import java.util.Date;

public class Engine implements Serializable{
    private static final long serialVersionUID=1L;

    private int enumb;
    private String emodel;
    private String epower;
    private Date mfgDate;

    public Engine() {
    }

    public Engine(int enumb, String emodel, String epower, Date mfgDate) {
        this.enumb = enumb;
        this.emodel = emodel;
        this.epower = epower;
        this.mfgDate = mfgDate;
    }

    public int getEnumb() {
        return enumb;
    }

    public void setEnumb(int enumb) {
        this.enumb = enumb;
    }

    public String getEmodel() {
        return emodel;
    }

    public void setEmodel(String emodel) {
        this.emodel = emodel;
    }

    public String getEpower() {
        return epower;
    }

    public void setEpower(String epower) {
        this.epower = epower;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "E_Number=" + enumb +
                ", E_Model='" + emodel + '\'' +
                ", E_Power='" + epower + '\'' +
                ", E_MfgDate=" + mfgDate +
                '}';
    }
}

