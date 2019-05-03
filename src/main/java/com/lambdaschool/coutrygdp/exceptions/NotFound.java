package com.lambdaschool.coutrygdp.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFound extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotFound(String message)
    {
        super(message);
    }
}






