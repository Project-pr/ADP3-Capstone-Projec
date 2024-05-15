package za.ac.cput.domain;

public class Attendance {

    private int attendanceId;
    private int employeeId;
    private Date date;
    private String timeIn;
    private String timeOut;

    // Constructors
    public Attendance() {
    }

    public Attendance(int attendanceId, int employeeId, Date date, String timeIn, String timeOut) {
        this.attendanceId = attendanceId;
        this.employeeId = employeeId;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    // Getters and Setters
    public int getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    // toString method for printing object details
    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", employeeId=" + employeeId +

                ", date=" + date +
                ", timeIn='" + timeIn + '\'' +
                ", timeOut='" + timeOut + '\'' +
                '}';
    }



}
