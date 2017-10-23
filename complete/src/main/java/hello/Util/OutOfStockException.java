package hello.Util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.I_AM_A_TEAPOT, reason="This item is out of stock")
public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
