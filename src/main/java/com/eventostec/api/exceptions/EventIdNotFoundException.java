package com.eventostec.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EventIdNotFoundException extends RuntimeException {
    public EventIdNotFoundException(String message) {
        super(message);
    }
}
