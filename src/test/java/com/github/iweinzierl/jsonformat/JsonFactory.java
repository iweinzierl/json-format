package com.github.iweinzierl.jsonformat;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class JsonFactory {

    public static JsonObject createObjectSimple() {
        JsonObject obj = new JsonObject();
        obj.addProperty("prop1", "value1");
        obj.addProperty("prop2", 2);
        obj.addProperty("prop3", true);

        return obj;
    }

    public static JsonObject createObjectWithObject() {
        JsonObject obj2 = new JsonObject();
        obj2.addProperty("prop21", "value21");
        obj2.addProperty("prop22", 22);

        JsonObject obj = new JsonObject();
        obj.addProperty("prop1", "value1");
        obj.add("prop2", obj2);

        return obj;
    }

    public static JsonObject createObjectWithObjectArray() {
        JsonObject obj2 = new JsonObject();
        obj2.addProperty("prop21", "value21");
        obj2.addProperty("prop22", 22);

        JsonObject obj3 = new JsonObject();
        obj3.addProperty("prop31", "value31");
        obj3.addProperty("prop32", 32);

        JsonArray arr = new JsonArray();
        arr.add(obj2);
        arr.add(obj3);

        JsonObject obj = new JsonObject();
        obj.addProperty("prop1", "value1");
        obj.add("prop2", arr);

        return obj;
    }

    public static JsonArray createArraySimple() {
        JsonArray arr = new JsonArray();
        arr.add(new JsonPrimitive("value1"));
        arr.add(new JsonPrimitive("value2"));
        arr.add(new JsonPrimitive("value3"));

        return arr;
    }

    public static JsonArray createArrayWithObjects() {
        JsonObject obj1 = new JsonObject();
        obj1.addProperty("prop11", "value11");
        obj1.addProperty("prop12", 12);

        JsonObject obj2 = new JsonObject();
        obj2.addProperty("prop21", "value21");
        obj2.addProperty("prop22", 22);

        JsonArray arr = new JsonArray();
        arr.add(obj1);
        arr.add(obj2);

        return arr;
    }
}
