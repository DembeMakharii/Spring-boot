package com.example.spring_boot_user_demo;

import com.example.repo.FakeRepoInterface;
import com.example.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTests {

    @Mock
    private FakeRepoInterface fakeRepo;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    void testAddUser() {
        // Given
        String name = "Dembe";
        String surname = "Makhari";
        long userId = 1;
        
        // When
        String result = userService.addUser(name, surname);
        
        // Then
        assertEquals("Dembe added", result);
        verify(fakeRepo, times(1)).insertUser(userId, name, surname);
    }

    @Test
    void testRemoveUser() {
        // Given
        long userId = 1;
        String expectedName = "Dembe Makhari";
        when(fakeRepo.deleteUser(userId)).thenReturn(expectedName);
        
        // When
        String result = userService.removeUser(userId);
        
        // Then
        assertEquals("Dembe Makhari removed", result);
        verify(fakeRepo, times(1)).deleteUser(userId);
    }

    @Test
    void testGetUser() {
        // Given
        long userId = 1;
        String expectedName = "Dembe Makhari";
        when(fakeRepo.findUserById(userId)).thenReturn(expectedName);
        
        // When
        String result = userService.getUser(userId);
        
        // Then
        assertEquals("Hello Dembe Makhari", result);  // Fixed expected result
        verify(fakeRepo, times(1)).findUserById(userId);
    }
}