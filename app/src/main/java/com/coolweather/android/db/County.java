package com.coolweather.android.db;

public class County extends DataSupport{
    private int id;

    private String weatherId;

    private String countyName;

    private int cityId;

    public int getId() {
        return id;

    }
    public void setId() {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName() {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;

    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

}
