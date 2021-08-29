package generics;

public class GenericRunner {
    public static void main(String[] args) {
        GenericsBox<String, Integer> box1 = new GenericsBox<>();
        box1.setBoxSize(55);
        box1.setItems("3");
        box1.setItems("73");
        System.out.println(box1.getBoxSize());
        System.out.println(box1.getItems());
        GenericsBox<String, Integer> box2 = new GenericsBox<>();
        box2.setItems("Ford vs Ferrari");
        box2.setBoxSize(10);
        System.out.println(box2.getItems());
        System.out.println(box2.getBoxSize());
    }
}
