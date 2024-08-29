package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class CompressionTask implements Task{
    private Deque<String> task = new ArrayDeque<>();

    @Override
    public void execute() {
        System.out.println("데이터 압축...");
    }
}
