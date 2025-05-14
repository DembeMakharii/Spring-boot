package com.example.repo;

import  com.example.model.User;
import org.springframework.stereotype.Repository;


@Repository
public class FakeRepo implements FakeRepoInterface {
    User[] users = new User[10];
    int userCount = 0;

    @Override
    public String insertUser(long id, String name, String surname) {
        if (userCount < users.length) {
            users[userCount++] = new User(id, name, surname);
            return "User added successfully";
            
        }
        return "User array is full";
    }

    @Override
    public String findUserById(long id) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId() == id) {
                return "User found: " + users[i].getName() + " " + users[i].getSurname();
            }
        }
        return "User not found";
    }

    @Override
    public String deleteUser(long id) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId() == id) {
                users[i] = null;
                // Shift remaining users to fill the gap
                for (int j = i; j < userCount - 1; j++) {
                    users[j] = users[j + 1];
                }
                users[--userCount] = null; // Clear the last position
                return "User deleted successfully";
            }
        }
        return "User not found";
    }


}
