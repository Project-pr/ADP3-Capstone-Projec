package za.ac.cput.domain;
/*
* Employee.java
* Author: Mxolisi Ndovela (217094740)
* Date: 14 March 2024
 */



import java.math.BigDecimal;
import java.time.LocalDate;

public class employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String contactInformation;
    private String address;
    private Long departmentId;
    private Long positionId;
    private LocalDate dateHired;
    private BigDecimal salary;

    private employee() {
        // Private constructor for builder pattern
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getAddress() {
        return address;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    // Builder pattern for flexible object creation
    public static class Builder {
        private Long employeeId;
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private String gender;
        private String contactInformation;
        private String address;
        private Long departmentId;
        private Long positionId;
        private LocalDate dateHired;
        private BigDecimal salary;

        public Builder(Long employeeId, String firstName, String lastName) {
            this.employeeId = employeeId;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder contactInformation(String contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder departmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder positionId(Long positionId) {
            this.positionId = positionId;
            return this;
        }

        public Builder dateHired(LocalDate dateHired) {
            this.dateHired = dateHired;
            return this;
        }

        public Builder salary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public employee build() {
            employee employee = new employee();
            employee.employeeId = this.employeeId;
            employee.firstName = this.firstName;
            employee.lastName = this.lastName;
            employee.dateOfBirth = this.dateOfBirth;
            employee.gender = this.gender;
            employee.contactInformation = this.contactInformation;
            employee.address = this.address;
            employee.departmentId = this.departmentId;
            employee.positionId = this.positionId;
            employee.dateHired = this.dateHired;
            employee.salary = this.salary;
            return employee;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", contactInformation='" + contactInformation + '\'' +
                ", address='" + address + '\'' +
                ", departmentId=" + departmentId +
                ", positionId=" + positionId +
                ", dateHired=" + dateHired +
                ", salary=" + salary +
                '}';
    }
}
