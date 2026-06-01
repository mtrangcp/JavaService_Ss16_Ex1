package com.btvn.ss16ex1.controller;

import com.btvn.ss16ex1.model.Employee;
import com.btvn.ss16ex1.model.response.ApiDataResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public ApiDataResponse<List<Employee>> getAllEmployees() {
        List<Employee> employees = Arrays.asList(
                new Employee(1L, "Nguyen Van A", 15000000.0),
                new Employee(2L, "Tran Thi B", 18000000.0),
                new Employee(3L, "Le Van C", 12000000.0)
        );

        return ApiDataResponse.<List<Employee>>builder()
                .status(HttpStatus.OK.value())
                .message("Lấy danh sách nhân viên thành công!")
                .data(employees)
                .error(null)
                .httpStatus(HttpStatus.OK)
                .build();
    }

}
