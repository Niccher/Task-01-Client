package com.inc.niccher.task2;

/**
 * Created by niccher on 10/06/19.
 */

class Mod_E {
    String eType,eCounty,eCountySub,eArea,ePrice,eDesc,eImg,eKey,cewner,eTime;

    public Mod_E() {
    }

    public Mod_E(String eType, String eCounty, String eCountySub, String eArea, String ePrice, String eDesc, String eImg, String eKey, String cewner, String eTime) {
        this.eType = eType;
        this.eCounty = eCounty;
        this.eCountySub = eCountySub;
        this.eArea = eArea;
        this.ePrice = ePrice;
        this.eDesc = eDesc;
        this.eImg = eImg;
        this.eKey = eKey;
        this.cewner = cewner;
        this.eTime = eTime;
    }

    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType;
    }

    public String geteCounty() {
        return eCounty;
    }

    public void seteCounty(String eCounty) {
        this.eCounty = eCounty;
    }

    public String geteCountySub() {
        return eCountySub;
    }

    public void seteCountySub(String eCountySub) {
        this.eCountySub = eCountySub;
    }

    public String geteArea() {
        return eArea;
    }

    public void seteArea(String eArea) {
        this.eArea = eArea;
    }

    public String getePrice() {
        return ePrice;
    }

    public void setePrice(String ePrice) {
        this.ePrice = ePrice;
    }

    public String geteDesc() {
        return eDesc;
    }

    public void seteDesc(String eDesc) {
        this.eDesc = eDesc;
    }

    public String geteImg() {
        return eImg;
    }

    public void seteImg(String eImg) {
        this.eImg = eImg;
    }

    public String geteKey() {
        return eKey;
    }

    public void seteKey(String eKey) {
        this.eKey = eKey;
    }

    public String getCewner() {
        return cewner;
    }

    public void setCewner(String cewner) {
        this.cewner = cewner;
    }

    public String geteTime() {
        return eTime;
    }

    public void seteTime(String eTime) {
        this.eTime = eTime;
    }
}