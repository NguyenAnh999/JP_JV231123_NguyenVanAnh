import java.util.List;
import java.util.Scanner;

public class Department {
    private int departmentId;
    private String departmentName;

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Department() {
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void inputData(Scanner scanner, List<Department> list){
       // departmentId=list.size();

        departmentId= (int) (Math.random() * 252342534 * Math.random());
        System.out.println("mời banh nhập vào tên phòng ban");
       String name =  scanner.nextLine();
         departmentName=name;
        boolean check = false;

 do {
     while (departmentName.isEmpty()){
         System.out.println("bạn không đuọc để trống tên phòng ban");
         System.out.println("mời banh nhập vào tên phòng ban");
         name =  scanner.nextLine();
         departmentName=name;
     }

     for (Department department : list) {
         if (department.getDepartmentName().equals(departmentName)){
             check=true;
         }
     }
     if (check){
         System.out.println("tên của bạn đã đuọc sử dụng");
         System.out.println("mời banh nhập vào tên phòng ban");
         name =  scanner.nextLine();
         departmentName=name;
     }else {
         check=false;
     }
 }while (check);
    }

    @Override
    public String toString() {
        return "{" +
                "ID=" + departmentId +
                ", Tên phòng ban='" + departmentName + '\'' +
                '}';
    }
}
