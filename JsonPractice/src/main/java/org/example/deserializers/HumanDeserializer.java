package org.example.deserializers;

import com.google.gson.*;
import org.example.Car;
import org.example.Human;

import java.lang.reflect.Type;

public class HumanDeserializer implements JsonDeserializer<Human> {
    @Override
    public Human deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Human human = new Human();
        human.setName(jsonObject.get("name").getAsString());
        human.setAge(jsonObject.get("age").getAsInt());
        human.setCar(context.deserialize(jsonObject.get("car"), Car.class));
        return human;
    }
}
