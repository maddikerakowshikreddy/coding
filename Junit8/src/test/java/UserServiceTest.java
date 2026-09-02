import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class UserServiceTest {

	@Test
    void testGetName() {

        
        User m = mock(User.class);

        
        when(m.getUserName(10))
                .thenReturn("Kowshik");

        
        Service service = new Service(m);

        
        String result = service.getName(10);

        
        assertEquals("Kowshik", result);

        
        verify(m).getUserName(10);
    }
}
