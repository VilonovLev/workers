import data.Worker;

import java.util.*;
import java.util.function.Consumer;

public class WorkersList<W extends Worker> implements Iterable<W>{
    Worker[] workers;
    int indexTail = 0;
    private int head = 0;

    public WorkersList() {
        workers = new Worker[16];
    }

    public WorkersList(W[] workers) {
        this.workers = workers;
    }

    private void resize() {
        if (indexTail > (workers.length/4 * 3)) {
            workers = Arrays.copyOf(workers,workers.length<<1);
        }
    }

    public boolean add(W w) {
        if (w == null) {
            return false;
        }
        workers[indexTail++] = w;
        resize();
        return true;
    }

    public void sort() {
        workers = Arrays.copyOf(workers,indexTail);
        Arrays.sort(workers);
        resize();
    }

    @Override
    public String toString() {
        return "WorkersList{" +
                "workers=" + Arrays.asList(workers);

    }

    @Override
    public Iterator iterator() {
        this.head = 0;
        Iterator<W> iter = new Iterator<W>() {
            @Override
            public boolean hasNext() {
                return head < indexTail;
            }

            @Override
            public W next() {
                if (hasNext()) {
                    return (W) workers[head++];
                }
                else
                    throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        return iter;
    }
}
