package com.sainnt.geekbrains.homework10.repository;

import com.sainnt.geekbrains.homework10.entity.User;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public class UserRepository extends AbstractRepository<User> {
    public UserRepository() {
        initiateData();
    }

    @Override
    protected String getEntityName() {
        return "User";
    }

    private void initiateData() {
        Stream.of(
                        new User( "Datch"),
                        new User( "Mika"),
                        new User("Adel"))
                .forEach(this::save);
    }
}
