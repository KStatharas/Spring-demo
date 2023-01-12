package com.kstatharas.essentials.controllers;

import com.kstatharas.essentials.models.Employee;
import com.kstatharas.essentials.models.Room;
import com.kstatharas.essentials.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/staff")
public class StaffController {
    private final StaffService _staffService;

    public StaffController(StaffService _staffService) {
        this._staffService = _staffService;
    }

    @GetMapping
    public String GetEmployees(Model model){
        model.addAttribute("staff", _staffService.getAllEmployees());
        return "staff";
    }
}
