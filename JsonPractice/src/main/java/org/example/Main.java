package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.deserializers.CarDeserializer;
import org.example.deserializers.HumanDeserializer;
import org.example.serializers.CarSerializer;
import org.example.serializers.HumanSerializer;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car("BMW", "z4", 45000);
        Car mercedes = new Car("Mercedes", "E-Klasse", 90000);

        Human vasya = new Human("Vasya", 22, "m", bmw);
        Human petya = new Human("Petya", 31, "m", mercedes);

        Family family = new Family();
        family.addHuman(vasya);
        family.addHuman(petya);

        System.out.println(family);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(family);

        System.out.println(json);

        Family family2 = gson.fromJson(json, Family.class);
        System.out.println(family2);

        //------------------------------------------------------------------

        Gson gson2 = new GsonBuilder()
                .registerTypeAdapter(Car.class, new CarSerializer())
                .registerTypeAdapter(Car.class, new CarDeserializer())
                .registerTypeAdapter(Human.class, new HumanSerializer())
                .registerTypeAdapter(Human.class, new HumanDeserializer())
                .setPrettyPrinting().create();

        String json2 = gson2.toJson(family2);

        System.out.println(json2);

        Family newFamily = gson2.fromJson(json2, Family.class);
        System.out.println(newFamily);
    }
}
