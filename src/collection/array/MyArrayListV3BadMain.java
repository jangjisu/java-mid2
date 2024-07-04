package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3");

        System.out.println(numberList);

        Integer num = (Integer) numberList.get(0);
        Integer num1 = (Integer) numberList.get(1);
        //다운 캐스팅 실패 문자 인데 숫자로 변환하려고해서
        Integer num2 = (Integer) numberList.get(2);
    }
}
