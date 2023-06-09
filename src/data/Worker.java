package data;

import java.util.Objects;




public abstract class Worker implements Comparable<Worker>{
    private String name;
    public abstract int getSalary();

    public Worker() {
    }

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return name.equals(worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }

    /**
     * @param worker the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Worker worker) {
        int result = Integer.compare(this.getSalary(),worker.getSalary());
        if (result == 0) {
            result = this.name.compareTo(worker.getName());
        }
        return Integer.compare(this.getSalary(),worker.getSalary());
    }
}
