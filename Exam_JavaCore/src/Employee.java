import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Employee {

    private int employeeId;
    private String employeeName;
    private String email;
    private String phoneNumber;
    private String address;

    private boolean gender;

    private Date birthday;
    private float basicSalary;
    private float allowanceSalary;
    private float rate;
    private int departmentId;

    public Employee(int employeeId, String employeeName, String email, String phoneNumber, String address, boolean gender, Date birthday, float basicSalary, float allowanceSalary, float rate, int departmentId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.basicSalary = basicSalary;
        this.allowanceSalary = allowanceSalary;
        this.rate = rate;
        this.departmentId = departmentId;
    }

    public Employee() {
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getemployeeId() {
        return employeeId;
    }

    public void setTemployeeId(int temployeeId) {
        this.employeeId = temployeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getAllowanceSalary() {
        return allowanceSalary;
    }

    public void setAllowanceSalary(float allowanceSalary) {
        this.allowanceSalary = allowanceSalary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void inputData(Scanner scanner, List<Employee> list,List<Department> list2) {
        employeeId = (int) (Math.random() * 252342534 * Math.random());


        System.out.println("mời banh nhập vào tên nhân viên");
        String name = scanner.nextLine();
        employeeName = name;

        System.out.println("mời bạn nhập vào địa chỉ email");
        email = scanner.nextLine();
        System.out.println("mời bạn nhập vào số điện thoại");

        phoneNumber = scanner.nextLine();
        System.out.println("mời bạn chọn giới tính");
        System.out.println("1:nam");
        System.out.println("2:nữ");
        int genderCheck = Integer.parseInt(scanner.nextLine());
        if (genderCheck == 1) {
            gender = true;
        } else {
            gender = false;
        }

        System.out.println("mời bạn nhập vào địa chỉ thường trú");
        address = scanner.nextLine();

        System.out.println("mời bạn nhập vào lương cơ bản");
        basicSalary  = Float.parseFloat(scanner.nextLine());



        System.out.println("mời bạn nhập vào phụ cấp");
        allowanceSalary = Float.parseFloat(scanner.nextLine());



        System.out.println("mời bạn nhập vào hệsốlương");
        rate = Float.parseFloat(scanner.nextLine());
        for (Department department : list2) {
            System.out.println(department.toString());
        }
        System.out.println("mời bạn chọn id phòng ban và nhập vào ");
        departmentId= Integer.parseInt(scanner.nextLine());
    }


    @Override
    public String toString() {
        return "{" +
                "Id=" + employeeId +
                ", Tên nhân viên='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", số điện thoại='" + phoneNumber + '\'' +
                ", địa chỉ='" + address + '\'' +
                ", giới tính=" + (gender ? "nam" : "nữ") +
                ", sinh nhật=" + birthday +
                ", lương cơ bản=" + basicSalary +
                ", phụ cấp=" + allowanceSalary +
                ", hệ số lương=" + rate +
                ", mã phòng ban làm việc=" + departmentId +
                '}';
    }

    public float calTotalSalary() {
        return basicSalary * rate + allowanceSalary;
    }
}
