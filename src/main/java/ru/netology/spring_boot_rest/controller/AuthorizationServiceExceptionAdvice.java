package ru.netology.spring_boot_rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.netology.spring_boot_rest.exceptions.InvalidCredentials;
import ru.netology.spring_boot_rest.exceptions.UnauthorizedUser;

@ControllerAdvice
public class AuthorizationServiceExceptionAdvice {
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handle(InvalidCredentials e) {
return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handle(UnauthorizedUser e) {
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getLocalizedMessage(), HttpStatus.UNAUTHORIZED);
    }
}
