/*
 * department.java
 * Author: Anathi Mhlom (220006695)
 * 14 May 2024
 */
package za.ac.cput.domain;

import java.util.Objects;

public class department {
    private Long departmentId;
    private String departmentName;
    private Long managerId;
    private String description;

    private department() {
    }

    private department(Builder builder) {
        this.departmentId = builder.departmentId;
        this.departmentName = builder.departmentName;
        this.managerId = builder.managerId;
        this.description = builder.description;
    }

    // Getters
    public Long getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Long getManagerId() {
        return managerId;
    }

    public String getDescription() {
        return description;
    }

    // Builder class
    public static class Builder {
        private final Long departmentId;
        private String departmentName;
        private final Long managerId;
        private String description;

        public Builder(Long departmentId, Long managerId) {
            this.departmentId = departmentId;
            this.managerId = managerId;
        }

        public Builder departmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(departmentId, builder.departmentId) && Objects.equals(departmentName, builder.departmentName) && Objects.equals(managerId, builder.managerId) && Objects.equals(description, builder.description);
        }

        @Override
        public int hashCode() {
            return Objects.hash(departmentId, departmentName, managerId, description);
        }

        // Build method to construct the Department object
        public department build() {
            department department = new department();
            department.departmentId = this.departmentId;
            department.departmentName = this.departmentName;
            department.managerId = this.managerId;
            department.description = this.description;
            return new department(this);
        }

        @Override
        public String toString() {
            return "Department{" +
                    "departmentId=" + departmentId +
                    ", departmentName='" + departmentName + '\'' +
                    ", managerId=" + managerId +
                    ", description='" + description + '\'' +
                    '}';
        }
    }
}
