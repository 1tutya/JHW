package org.example.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.example.Car;

import java.lang.reflect.Type;

public class CarDeserializer implements JsonDeserializer<Car> {
    @Override
    public Car deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context) throws JsonParseException {
        Car car = new Car();
        String data = jsonElement.getAsString();
        String carMark = data.substring(0, data.indexOf(" ")).trim();
        String model = data.substring(data.indexOf(" ") + 1, data.lastIndexOf(" ")).trim();
        int mileage = Integer.parseInt(data.substring(data.lastIndexOf(" ")+1));
        car.setMileage(mileage);
        car.setModel(model);
        car.setCarMark(carMark);
        return car;
    }
}
