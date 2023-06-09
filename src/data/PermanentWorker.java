package data;

public class PermanentWorker extends Worker {
    private int salary;
    @Override
    public int getSalary() {
        return salary;
    }

    public PermanentWorker(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "PermanentWorker{" +
                " name=" + super.getName() +
                ", salary=" + salary +
                '}';
    }
}
