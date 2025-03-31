package userdetails;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    @Test
    public void testCreateUser(){
        User user = new User("Naga", "password14");

    }
    @Test
    public void testGetUserName(){
        User user = new User("Naga","password14");
        String expected ="Naga";
        String actual = user.getUsername();
        assertEquals(expected,actual);

    }
    @Test
    public void testGetPassword(){
        User user = new User("Naga", "password14");
        String expected  ="password14";
        String actual = user.getPassword();
        assertEquals(expected,actual);
    }
    @Test
    public void testChangeUseName(){
        User user = new User("Naga", "password14");
        String expected = "NagaRaju";
        user.setUsername("NagaRaju");
        String actual = user.getUsername();
        assertEquals(expected,actual);

    }
    @Test
    public void testChangePassword(){
        User user = new User("Naga", "password14");
        String expected = "password123";
        user.setPassword("password123");
        String actual = user.getPassword();
        assertEquals(expected,actual);

    }


}
