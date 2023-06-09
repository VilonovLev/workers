import data.HourlyWorker;
import data.PermanentWorker;
import data.Worker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WorkersList<Worker> workersList = new WorkersList<>();
        PermanentWorker pm1 = new PermanentWorker("Игорь",3000);
        PermanentWorker pm2 = new PermanentWorker("Вася",1500);
        PermanentWorker pm3 = new PermanentWorker("Вася",18000);
        PermanentWorker pm4 = new PermanentWorker("Игорь",1500);
        HourlyWorker hw1 = new HourlyWorker("Коля");
        HourlyWorker hw2 = new HourlyWorker("Жора");
        workersList.add(pm3);
        workersList.add(pm1);
        hw1.addHoursWorked(12);
        workersList.add(hw1);
        hw2.addHoursWorked(13);
        workersList.add(hw2);
        workersList.add(pm2);
        workersList.add(pm4);

        for (var work: workersList) {
            System.out.println(work);
        }
        System.out.println();

        workersList.sort();

        for (var work: workersList) {
            System.out.println(work);
        }

    }
}