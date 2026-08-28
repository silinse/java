package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @Test
    void getUserNameReturnsName(){

        // UserRepository repository = mock(UserRepository.class);

        User john = new User("John");

        when(repository.findById(5)).thenReturn(john);

        // UserService service = new UserService(repository);

        String userName = service.getUserName(5);

        assertEquals("John", userName);
        verify(repository).findById(5);

    }
}

