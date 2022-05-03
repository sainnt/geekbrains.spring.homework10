package com.sainnt.geekbrains.homework10.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class User extends Entity {
    private String name;

    public User(long id, String name) {
        super(id);
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
