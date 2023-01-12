package com.kstatharas.essentials.controllers;

import com.kstatharas.essentials.models.Employee;
import com.kstatharas.essentials.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private final StaffService _staffService;

    public StaffRestController(StaffService _staffService) {
        this._staffService = _staffService;
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return _staffService.getAllEmployees();
    }
}
