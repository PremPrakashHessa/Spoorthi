package com.anuj.spoorthi.customexceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CardNotFoundException  extends RuntimeException{
    public CardNotFoundException(String message){
        super(message);
    }
}
