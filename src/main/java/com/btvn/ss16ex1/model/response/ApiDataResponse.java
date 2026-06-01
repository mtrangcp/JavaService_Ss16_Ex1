package com.btvn.ss16ex1.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ApiDataResponse<T> {
    private int status;
    private String message;
    private T data;
    private Object error;
    private HttpStatus httpStatus;
}
