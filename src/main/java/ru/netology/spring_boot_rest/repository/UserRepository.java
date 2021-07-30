package ru.netology.spring_boot_rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.spring_boot_rest.entity.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> result = new ArrayList<>();

        if (user.equals("Bob") && password.equals("pass")) {
            result.add(Authorities.READ);
            return result;
        }

        return result;
    }
}
