package com.example.service;
import com.example.repo.FakeRepoInterface;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final FakeRepoInterface fakeRepo;
    private final long userId = 1; 
    
    public UserServiceImpl(FakeRepoInterface fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public String addUser(String name, String surname) {
        fakeRepo.insertUser(userId, name, surname);
        return name + " added";  
    }
    
    @Override
    public String removeUser(long id) {
        return fakeRepo.deleteUser(userId) + " removed";  // Added space before "removed"
    }
    
    @Override
    public String getUser(long id) {
       return "Hello " + fakeRepo.findUserById(userId);  // Added space after "Hello"
    }
}