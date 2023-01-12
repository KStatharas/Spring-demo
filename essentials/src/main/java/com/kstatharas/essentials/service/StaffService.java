package com.kstatharas.essentials.service;

import com.kstatharas.essentials.data.StaffRepository;
import com.kstatharas.essentials.models.Employee;
import com.kstatharas.essentials.models.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Employee> getAllEmployees(){return staffRepository.findAll();}
}
