package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Family {
    private List<Human> humans;

    public void addHuman(Human human) {
        if (this.humans == null) {
            this.humans = new ArrayList<>();
            this.humans.add(human);
        } else {
            this.humans.add(human);
        }
    }
}
