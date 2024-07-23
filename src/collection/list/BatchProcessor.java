package collection.list;


public class BatchProcessor {
    private final MyList<Integer> mylist;

    public BatchProcessor(MyList<Integer> mylist) {
        this.mylist = mylist;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            mylist.add(0, i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
