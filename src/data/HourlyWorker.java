package data;

public class HourlyWorker extends Worker{

    private double form = 20.8*8;
    private int hoursWorked = 0;

    public HourlyWorker(String name, double form) {
        super(name);
        this.form = form;
    }

    public void addHoursWorked(int hours) {
        hoursWorked += hours;
    }

    public HourlyWorker(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return (int) Math.ceil(form*hoursWorked);
    }

    public double getForm() {
        return form;
    }

    public void setForm(double form) {
        this.form = form;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "HourlyWorker{" +
                " name=" + super.getName() +
                " form=" + form +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
