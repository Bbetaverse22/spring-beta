package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    //Display all employees with email address
    List<Employee> findEmployeesByEmail(String email);
    // Display all employees with first name ' ' + and last name ' ' also shows all employees with an email address
    List<Employee> findEmployeesByFirstNameAndAndLastNameOrEmail(String firstname, String lastname, String email);
    // Display all employees with first name ' '
    List<Employee> findEmployeesByFirstNameIsNot(String firstName);
    // Display all employees last name starts with ' '
    List<Employee> findEmployeesByLastNameStartingWith(String str); // Display all employees last name starts with ' '
    // Display all employees with salaries higher than ' '
    List<Employee> findEmployeesBySalaryGreaterThan(BigInteger salary);
    // Display all employees with salaries less than ' '
    List<Employee> findEmployeesBySalaryLessThan(BigInteger salary);
    // Display all employees hired between '' and ''
    List<Employee> findEmployeesByHireDateBetween(LocalDate startDate, LocalDate endDate);
    // Display all employee salary is greater than and equal to ' ' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(BigInteger salary);
    // Display all employees top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryLessThan(BigInteger salary);
    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();
    @Query("SELECT e FROM Employee e WHERE e.email = 'sdubber7@t-online.de'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'sdubber7@t-online.de'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Employee getEmployeeDetail(String email,int salary);





}
