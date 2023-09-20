package fit.edu.iuh.vn.labweek2.services;

import fit.edu.iuh.vn.labweek2.enums.EmployeeStatus;
import fit.edu.iuh.vn.labweek2.models.Employee;
import fit.edu.iuh.vn.labweek2.models.Order;
import fit.edu.iuh.vn.labweek2.reponsitories.EmployeeReponsitory;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public class EmployeeServices {
    private EmployeeReponsitory repository;
    public EmployeeServices() {
        repository = new EmployeeReponsitory();
    }
    public void insertEmp(Employee employee) {
        repository.insertEmp(employee);
    }
    public Optional<Employee> findById(long id) {
        return repository.findbyId(id);
    }
    public boolean delete(long id) {
        Optional<Employee> op = findById(id);
        if (op.isPresent()) {
            Employee employee = op.get();
            employee.setStatus(EmployeeStatus.TERMINATED);
            return true;
        }
        return false;
    }
    public boolean activeEmp(long id) {
        Optional<Employee> op = findById(id);
        if (op.isPresent()) {
            Employee employee = op.get();
            employee.setStatus(EmployeeStatus.ACTIVE);
            return true;
        }
        return false;
    }

    public List<Employee> getAll() {
        return null;
    }
}
