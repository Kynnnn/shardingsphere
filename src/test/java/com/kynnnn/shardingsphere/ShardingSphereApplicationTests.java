package com.kynnnn.shardingsphere;


import com.kynnnn.shardingsphere.dao.UserDao;
import com.kynnnn.shardingsphere.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingSphereApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void addUser() {
        User user = new User();
        user.setName("张三");
        user.setAge(21);
        userDao.insert(user);

        user.setName("李四");
        user.setAge(22);
        userDao.insert(user);

    }

}
