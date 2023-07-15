package com.example.awscicd.exampletest;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class UserDao {

    public List<User> getUsers() {
        return Stream.of(
                        new User(1, "Mary", 19, 320000),
                        new User(2, "John", 40, 21000),
                        new User(3, "Mike", 15, 10000),
                        new User(4, "linda", 21, 90000))
                .collect(Collectors.toList());
    }
}
