package com.kstatharas.essentials.data;

import com.kstatharas.essentials.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Employee,String> {

}
