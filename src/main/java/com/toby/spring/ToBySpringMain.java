package com.toby.spring;

import com.toby.spring.user.dao.UserDao;
import com.toby.spring.user.domain.User;

import java.sql.SQLException;

public class ToBySpringMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new UserDao();

        User user = new User();
        user.setId("wontaejo");
        user.setName("조원태");
        user.setPassword("wo12345!");

        dao.add(user);

        System.out.println(user.getId() + " : 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " : 조회 성공");

    }
}
