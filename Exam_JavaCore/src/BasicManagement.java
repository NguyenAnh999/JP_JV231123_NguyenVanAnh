import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicManagement {
    public static void main(String[] args) {
        List<Department> departmentList = new ArrayList<>();

        List<Employee> employeetList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" *********************************MENU*******************************\n" +
                    " 1. Quản lý phòngban\n" +
                    " 2. Quản lý nhân viên\n" +
                    " 3. Thoát chương trình\n");
            System.out.println("mời bạn nhập lệnh");
            int x = Integer.parseInt(scanner.nextLine());

            switch (x) {
                case 1:
                    boolean check = true;
                    do {
                        System.out.println("**********************DEPARTMENT-MENU************************\n" +
                                " 1. Thêmmớiphòngban\n" +
                                " 2. Hiển thị thông tin tất cả phòng ban\n" +
                                " 3. Sửa tên phòng ban\n" +
                                " 4. Xóa phòngban\n" +
                                " 5. Tìm kiếm phòngban\n" +
                                " 0. Quay lại");
                        System.out.println("mời bạn nhập lệnh");
                        int x1 = Integer.parseInt(scanner.nextLine());
                        switch (x1) {
                            case 1:
                                System.out.println("mời bạn nhập số lượng phòng ban muốn thêm");
                                int x3 = Integer.parseInt(scanner.nextLine());
                                for (int i = 0; i < x3; i++) {
                                    Department department = new Department();
                                    department.inputData(scanner, departmentList);
                                    departmentList.add(department);
                                }
                                break;
                            case 2:
                                for (Department department : departmentList) {
                                    System.out.println(department.toString());
                                }
                            case 3:
                                System.out.println("danh sách phòng ban");
                                for (int i = 0; i < departmentList.size(); i++) {
                                    int stt = i + 1;
                                    System.out.println("phòng ban số" + stt);
                                    System.out.println(departmentList);
                                }
                                System.out.println("mời bạn chọn phòng ban muốn sửa tên");
                                int stt = Integer.parseInt(scanner.nextLine());
                                System.out.println("mời bạn nhập tên mới");
                                String newName = scanner.nextLine();
                                departmentList.get(stt).setDepartmentName(newName);
                                break;
                            case 4:
                                System.out.println("danh sách phòng ban");
                                for (int i = 0; i < departmentList.size(); i++) {
                                    int sttDelete = i + 1;
                                    System.out.println("phòng ban số" + sttDelete);
                                    System.out.println(departmentList);
                                }
                                System.out.println("mời bạn chọn phòng ban muốn xóa");
                                int sttDelete = Integer.parseInt(scanner.nextLine());

                                if (sttDelete > departmentList.size() - 1) {
                                    System.err.println("lệnh bạn nhập không đúng");
                                    break;
                                }
                                departmentList.remove(sttDelete);
                                break;
                            case 5:
                                System.out.println("mời bạn nhập vào tên phong ban muốn tìm");
                                String searchName = scanner.nextLine();
                                for (Department department : departmentList) {
                                    if (department.getDepartmentName().contains(searchName)) {
                                        System.out.println(department.toString());
                                    }
                                }
                                break;
                            case 0:
                                check = false;
                                break;
                            default:
                                System.err.println("lệnh bạn nhập không đúng");
                                break;
                        }

                    } while (check);
                    break;
                case 2:

                    boolean checkCase2 = true;
                    do {
                        System.out.println(" *************************EMPLOYEE-MENU**************************\n" +
                                " 1. Thêm mớinhânviên\n" +
                                " 2. Hiển thị thông tin tất cả nhân viên\n" +
                                " 3. Xemchi tiết thông tin nhân viên\n" +
                                " 4. Thay đổi thông tin nhân viên\n" +
                                " 5. Xóa nhân viên\n" +
                                " 6. Hiển thị danh sách nhân viên theo phòng ban [10 điểm]\n" +
                                " 7. Sắp xếp danh sách nhânviên theo tên\n" +
                                " 0. Quay lại");
                        System.out.println("mời bạn nhập lệnh");
                        int x2 = Integer.parseInt(scanner.nextLine());

                        switch (x2) {
                            case 1:
                                System.out.println("mời bạn nhập số lượng nhân viên muốn thêm");
                                int x3 = Integer.parseInt(scanner.nextLine());
                                for (int i = 0; i < x3; i++) {
                                    Employee employee = new Employee();
                                    employee.inputData(scanner, employeetList, departmentList);
                                    employeetList.add(employee);
                                }
                            case 2:
                                int n = 1;
                                for (Employee employee : employeetList) {

                                    System.out.println("nhân viên thứ:" + n);
                                    System.out.println(employee.getEmployeeName());
                                    n++;
                                }
                                n = 1;
                                break;
                            case 3:
                                n = 1;
                                for (Employee employee : employeetList) {
                                    System.out.println("nhân viên thứ:" + n);
                                    System.out.println(employee.getemployeeId());
                                    System.out.println(employee.getEmployeeName());
                                    n++;
                                }


                                System.out.println("mời bạn nhập id của nhân viên muốn kiểm tra");
                                int idCheck = Integer.parseInt(scanner.nextLine());
                                for (Employee employee : employeetList) {
                                    if (idCheck == employee.getemployeeId()) {
                                        System.out.println(employee.toString());
                                    }
                                }
                                for (Employee employee : employeetList) {
                                    if (idCheck != employee.getemployeeId()) {
                                        System.err.println("mã nhan viên bạn nhập không chính xác");
                                    }
                                }

                                break;

                            case 4:

                                n = 1;
                                for (Employee employee : employeetList) {
                                    System.out.println("nhân viên thứ:" + n);
                                    System.out.println(employee.getEmployeeName());
                                    System.out.println(employee.getemployeeId());
                                    n++;
                                }
                                System.out.println("mời bạn nhập vào id nhân viên muốn sửa");
                                int editId = Integer.parseInt(scanner.nextLine());
                                for (Employee employee : employeetList) {
                                    if (editId == employee.getemployeeId()) {
                                        boolean stop = true;
                                        do {
                                            System.out.println(employee.toString());
                                            ;
                                            System.out.println("mời bạn chọn mục muốn sửa");
                                            System.out.println("1: tên");
                                            System.out.println("2: email");
                                            System.out.println("3: địa chỉ");
                                            System.out.println("4: giới tính");
                                            System.out.println("5: lương cơ bản");
                                            System.out.println("6: phụ cấp");
                                            System.out.println("7: hệ số lương");
                                            System.out.println("8: mã phòng làm việc");
                                            System.out.println("0: hoàn thanh");
                                            int editStt = Integer.parseInt(scanner.nextLine());
                                            switch (editStt) {
                                                case 1:
                                                    System.out.println("mời banh nhập vào tên mới cho nhân viên");
                                                    String name = scanner.nextLine();
                                                    employee.setEmployeeName(name);
                                                    break;
                                                case 2:
                                                    System.out.println("mời bạn nhập vào địa chỉ email");
                                                    employee.setEmail(scanner.nextLine());
                                                    break;
                                                case 3:
                                                    System.out.println("mời bạn nhập vào địa chỉ mới");
                                                    employee.setAddress(scanner.nextLine());
                                                    break;
                                                case 4:
                                                    System.out.println("mời bạn chọn giới tính");
                                                    System.out.println("1:nam");
                                                    System.out.println("2:nữ");
                                                    int genderCheck = Integer.parseInt(scanner.nextLine());
                                                    if (genderCheck == 1) {
                                                        employee.setGender(true);
                                                    } else {
                                                        employee.setGender(false);
                                                    }
                                                    break;
                                                case 5:
                                                    System.out.println("mời bạn nhập lương cơ bản mới");
                                                    employee.setBasicSalary(Integer.parseInt(scanner.nextLine()));
                                                    break;
                                                case 6:
                                                    System.out.println("mời bạn nhập vào phụ cấp mới");
                                                    employee.setAllowanceSalary(Float.parseFloat(scanner.nextLine()));
                                                    break;

                                                case 7:
                                                    System.out.println("mời bạn nhập vào hệ số lương mới");
                                                    employee.setRate(Float.parseFloat(scanner.nextLine()));
                                                    break;
                                                case 8:
                                                    for (Department department : departmentList) {
                                                        System.out.println(department.toString());
                                                    }
                                                    System.out.println("mời bạn chọn id phòng ban và nhập vào ");
                                                    employee.setDepartmentId(Integer.parseInt(scanner.nextLine()));

                                                    break;
                                                case 0:
                                                    stop=false;
                                                    break;
                                            }


                                        } while (stop);
                                    }
                                }

                                break;
                            case 5:
                                n = 1;
                                for (Employee employee : employeetList) {
                                    System.out.println("nhân viên thứ:" + n);
                                    System.out.println(employee.getEmployeeName());
                                    System.out.println(employee.getemployeeId());
                                    n++;
                                }
                                System.out.println("mờ bạn nhập vào Id của nhân viên muốn xóa");
                                int deleteID = Integer.parseInt(scanner.nextLine());
                                for (Employee employee : employeetList) {
                                    if (employee.getemployeeId() == deleteID) {
                                        employeetList.remove(employee);
                                    }
                                }
                                for (Employee employee : employeetList) {
                                    if (employee.getemployeeId() != deleteID) {
                                        System.err.println("id bạn nhập không đúng");
                                    }
                                }
                                break;
                            case 6:
                                for (Department department : departmentList) {
                                    System.out.println("danh sách nhân viên phòng,ban: " + department.getDepartmentName());
                                    for (Employee employee : employeetList) {
                                        if (employee.getDepartmentId() == department.getDepartmentId()) {
                                            System.out.println("-" + employee.getEmployeeName());
                                        }
                                    }
                                }
                                break;
                            case 7:
                                n=1;
                                employeetList.sort((o1, o2) -> o1.getEmployeeName().compareTo(o2.getEmployeeName()));
                                for (Employee employee : employeetList) {
                                    System.out.println("nhaan vien thu: "+n);
                                    System.out.println(employee.getEmployeeName());
                                    n++;
                                }
                                break;
                            case 0:
                                checkCase2 = false;
                                break;

                            default:
                                System.err.println("lệnh bạn nhập không đúng");
                                break;
                        }
                    } while (checkCase2);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.err.println("bạn chọn sai");
                    break;
            }
        } while (true);
    }
}
