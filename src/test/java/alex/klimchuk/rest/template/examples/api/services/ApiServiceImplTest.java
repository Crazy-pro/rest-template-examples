package alex.klimchuk.rest.template.examples.api.services;

import alex.klimchuk.rest.template.examples.api.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Copyright Alex Klimchuk (c) 2023.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() {

    }

    @Test
    public void testGetUsers() {
        List<User> users = apiService.getUsers(3);

        assertEquals(4, users.size());
    }

}
