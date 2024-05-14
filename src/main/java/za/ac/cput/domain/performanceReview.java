/*
 * performanceReview.java
 * Author: Anathi Mhlom (220006695)
 * 13 May 2024
 */

package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

public class performanceReview {
    private Long reviewId;
    private Long employeeId;
    private Long reviewerId;
    private Date date;
    private double performanceRating;
    private String feedback;

    private performanceReview() {
    }

    private performanceReview(Builder builder) {
        this.reviewId = builder.reviewId;
        this.employeeId = builder.employeeId;
        this.reviewerId = builder.reviewerId;
        this.date = builder.date;
        this.performanceRating = builder.performanceRating;
        this.feedback = builder.feedback;
    }

    // Getters
    public Long getReviewId() {
        return reviewId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public Date getDate() {
        return date;
    }

    public double getPerformanceRating() {
        return performanceRating;
    }

    public String getFeedback() {
        return feedback;
    }

    // Builder class
    public static class Builder {
        private final Long reviewId;
        private final Long employeeId;
        private final Long reviewerId;
        private Date date;
        private double performanceRating;
        private String feedback;

        public Builder(Long reviewId, Long employeeId, Long reviewerId) {
            this.reviewId = reviewId;
            this.employeeId = employeeId;
            this.reviewerId = reviewerId;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder performanceRating(double performanceRating) {
            this.performanceRating = performanceRating;
            return this;
        }

        public Builder feedback(String feedback) {
            this.feedback = feedback;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return reviewId == builder.reviewId && employeeId == builder.employeeId && reviewerId == builder.reviewerId && Double.compare(performanceRating, builder.performanceRating) == 0 && Objects.equals(date, builder.date) && Objects.equals(feedback, builder.feedback);
        }

        @Override
        public int hashCode() {
            return Objects.hash(reviewId, employeeId, reviewerId, date, performanceRating, feedback);
        }

        // Build method to construct the PerformanceReview object
        public performanceReview build() {
            performanceReview performanceReview = new performanceReview();
            performanceReview.reviewId = this.reviewId;
            performanceReview.employeeId = this.employeeId;
            performanceReview.reviewerId = this.reviewerId;
            performanceReview.date = this.date;
            performanceReview.performanceRating = this.performanceRating;
            performanceReview.feedback = this.feedback;
            return new performanceReview(this);
        }

        @Override
        public String toString() {
            return "Performance Review{" +
                    "reviewId=" + reviewId +
                    ", employeeId=" + employeeId +
                    ", reviewerId=" + reviewerId +
                    ", date=" + date +
                    ", performanceRating=" + performanceRating +
                    ", feedback='" + feedback + '\'' +
                    '}';
        }
    }
}
