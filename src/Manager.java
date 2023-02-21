public class Manager extends Employee{
    private int num_of_emp;

    public Manager(String name, String department, int salary) {
        super(name, department, salary);

        this.num_of_emp = num_of_emp;

    }
    public void raiseSalary(int amount) {
        System.out.println("Hike Rate : " + amount + "TL  ");

    }

    @Override
    public void showInfos() {
        System.out.println("Personal name : " + this.getName());
        System.out.println("Personal departman : " + this.getDepartment());
        System.out.println("Personal salary : " + this.getSalary());

    }

    public Manager(String name, String department, int salary,int num_of_emp) {
        super(name, department, salary);

        this.num_of_emp = num_of_emp;
    }
    public void showInfos1() {
        System.out.println("Ceo name : " + this.getName());
        System.out.println("Ceo departman : " + this.getDepartment());
        System.out.println("Ceo salary : " + this.getSalary());
        System.out.println("Responsible Person : " + this.num_of_emp);

    }
}

