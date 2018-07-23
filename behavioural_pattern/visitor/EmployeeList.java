package behavioural_pattern.visitor;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> list = new ArrayList<>();

    public EmployeeList addEmployee(Employee employee) {
        this.list.add(employee);
        return this;
    }

    /**
     * 遍历集合元素访问每一个对象
     *
     * @param
     * @return
     */
    public void accept(Department handler) {
        for (Object o : list) {
            ((Employee) o).accept(handler);
        }
    }
}
