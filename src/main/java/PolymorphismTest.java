import java.io.Serializable;

public class PolymorphismTest {

    public static void main(String[] args) {

    }
}

/* 文件名 : Employee.java */
class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number) {
        System.out.println("Employee 构造函数");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck() {
        System.out.println("邮寄支票给： " + this.name
                + " " + this.address);
    }
    public String toString() {
        return name + " " + address + " " + number;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public int getNumber() {
        return number;
    }
}

/* 文件名 : Salary.java */
class Salary extends Employee
{
    private double salary; // 全年工资
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck() {
        System.out.println("Salary 类的 mailCheck 方法 ");
        System.out.println("邮寄支票给：" + getName()
                + " ，工资为：" + salary);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    public double computePay() {
        System.out.println("计算工资，付给：" + getName());
        return salary/52;
    }
}