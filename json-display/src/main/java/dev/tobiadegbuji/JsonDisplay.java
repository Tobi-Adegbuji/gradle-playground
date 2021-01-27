package dev.tobiadegbuji;

import com.google.gson.Gson;

public class JsonDisplay {
    public static String showJSON(Object o){
        Gson gson = new Gson().newBuilder().create();
        return gson.toJson(o);
    }
}
