package com.coolweather.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by bill on 2017/4/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Updata updata;

    public class Updata {
        @SerializedName("loc")
        public String updataTime;
    }
}
