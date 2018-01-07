package my.own.linkaggregator.service;

import my.own.linkaggregator.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static my.own.linkaggregator.TestData.USER_1;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
public class UserServiceImplTest {
    @Autowired
    UserService userService;

    @Test
    public void addUser() {
        User newUser = User.builder().username("new-user").password("password").build();
        newUser = userService.add(newUser);
        assertEquals(3L, newUser.getId().longValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addUserWithNotNullId() {
        User newUser = User.builder().id(3L).username("new-user").password("password").build();
        userService.add(newUser);
    }

    @Test
    public void getUser() {
        User user = userService.get(USER_1.getId());
        assertEquals(USER_1, user);
    }
}