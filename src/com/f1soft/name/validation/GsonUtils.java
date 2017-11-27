package com.f1soft.name.validation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import java.util.List;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author asmita.shrestha
 */
public class GsonUtils {

    private static Gson gson = new GsonBuilder().serializeNulls().create();

    private GsonUtils() {
    }

    public static <T> String toJsonString(T obj) {
        return gson.toJson(obj);
    }

    public static <T> JSONObject toJsonObj(T obj) throws JSONException {
        return new JSONObject(gson.toJson(obj));
    }

    public static <T> String toJsonList(List<T> objCol) {
        return gson.toJson(objCol);
    }

    public static <T> JSONArray toJsonArray(List<T> objCol) throws JSONException {
        return new JSONArray(gson.toJson(objCol));
    }

    public static <T> T fromJsonToObj(String jsonString, Class<T> obj) {
        return gson.fromJson(jsonString, obj);
    }

    public static <T> List<T> fromJsonToList(String jsonString, Type t) {
        return gson.fromJson(jsonString, t);
    }
}
