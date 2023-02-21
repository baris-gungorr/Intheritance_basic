public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Jack", "IT",1700);
        Manager manager = new Manager("Kate","Software",1450);
        Manager manager1 = new Manager("Michael","CEO",8000,1500);



        employee.showInfos();
        System.out.println("-------");
        manager.showInfos();
        System.out.println("******");
        manager1.showInfos1();
        manager.raiseSalary(1400);

    }
}
