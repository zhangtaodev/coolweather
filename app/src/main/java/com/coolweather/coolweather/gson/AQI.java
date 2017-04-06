package com.coolweather.coolweather.gson;

/**
 * Created by bill on 2017/4/6.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
