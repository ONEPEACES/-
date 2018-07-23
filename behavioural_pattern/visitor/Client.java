package behavioural_pattern.visitor;

public class Client {
    public static void main(String[] args) {
        //双重分派机制
        Department faDepartment = new FADepartment();
        Department hrDepartment = new HRDepartment();
        EmployeeList list = new EmployeeList();

        Employee fte1, fte2, fte3, pte1, pte2;

        fte1 = new FulltimeEmployee("张无忌", 3200.00, 45);
        fte2 = new FulltimeEmployee("杨过", 2000.00, 40);
        fte3 = new FulltimeEmployee("段誉", 2400.00, 38);
        pte1 = new ParttimeEmployee("洪七公", 80.00, 20);
        pte2 = new ParttimeEmployee("郭靖", 60.00, 18);

        list.addEmployee(fte1).addEmployee(fte2).addEmployee(fte3).addEmployee(pte1).addEmployee(pte2);

        list.accept(faDepartment);
        list.accept(hrDepartment);
    }
}
