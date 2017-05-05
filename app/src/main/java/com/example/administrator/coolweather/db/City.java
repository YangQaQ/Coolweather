package com.example.administrator.coolweather.db;

/**
 * Created by Administrator on 2017/5/5.
 */

public class City extends DataSupport {
    private int id;
    private  String CityName;
    private int CityCode;
    public int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return CityName;
    }
    public  void setCityName(String CityName){
        this.CityName=CityName;
    }
    public  int getCityCode(){
        return  CityCode;
    }
    public  void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
