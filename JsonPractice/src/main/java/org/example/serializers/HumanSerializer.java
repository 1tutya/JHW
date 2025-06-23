package org.example.serializers;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import org.example.Human;

import java.lang.reflect.Type;

public class HumanSerializer implements JsonSerializer<Human> {

    @Override
    public JsonElement serialize(Human human, Type type, JsonSerializationContext context) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", human.getName());
        jsonObject.addProperty("age", human.getAge());
        jsonObject.add("car", context.serialize(human.getCar()));
        return jsonObject;
    }
}
