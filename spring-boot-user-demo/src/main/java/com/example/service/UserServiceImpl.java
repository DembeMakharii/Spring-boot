package com.example.service;
import com.example.repo.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    private final FakeRepoInterface fakeRepo;
    private long userId = 1L; 
    

    @Autowired
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(String name, String surname) {
        fakeRepo.insertUser(userId, name, surname);
        String message = name + " added";
        System.out.println(message);
        return message;
    }
    
    @Override
    public String removeUser(long id) {
        
        
        return fakeRepo.deleteUser(id) + "removed";
    }
    
    @Override
    public String getUser(long id) {
       return "Hello" + fakeRepo.findUserById(id);
    }
}