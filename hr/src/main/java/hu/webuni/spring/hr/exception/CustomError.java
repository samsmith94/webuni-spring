package hu.webuni.spring.hr.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.FieldError;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
public class CustomError {

    private String message;
    private int errorCode;
    //private List<FieldError> fieldErrors;

}
