package hu.webuni.spring.hr.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class EmployeeDTO {

    @JsonIgnore
    Long id;

    @NotEmpty
    String name;

    @NotEmpty
    String rank;

    @Positive
    @NotNull
    int salary;

    @NotNull
    @PastOrPresent
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    LocalDateTime firstWorkingDay;
}
