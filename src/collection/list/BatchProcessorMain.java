package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor batchProcessor = new BatchProcessor(list);

        batchProcessor.logic(1_000_000);
    }
}

//컴파일 타임: 코드 컴파일 시점을 뜻함
//런타임: 프로그램 실행 시점

//컴파일 타임 의존관계 : 배치프로세서 파일은 mylist 인 인터페이스에만 의존하고 있다.
//런타임 의존관계 : 런타임에는 해당 프로세서에서 생성된 인스턴스 (myArrayList or myLinkedList 를 참조한다)

