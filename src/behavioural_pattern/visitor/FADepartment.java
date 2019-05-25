package behavioural_pattern.visitor;

public class FADepartment extends Department {

    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weeklyWage = employee.getWeeklyWage();
        if (workTime > 40) {
            weeklyWage = weeklyWage + (workTime - 40) * 100;
        }else if(workTime < 40){
            weeklyWage = weeklyWage - (40 - workTime) * 80;
            if(weeklyWage < 0){
                weeklyWage = 0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "实际工资：" + weeklyWage + "元");
    }

    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
    }
}
