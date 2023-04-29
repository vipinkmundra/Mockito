package guru.springframework.spring6restmvc.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;


//Three ways to handle the Exception
//1. By Using Excepton Handler in the same class
//2. By Using Generic or centterliased the Exception Handler through ExceptionController (@ControllerAdvice annotation)
//3. By using Response Status Annotation

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "value not found")
public class NotFoundException extends RuntimeException{
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundException(Throwable cause) {
        super(cause);
    }

    public NotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
