package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsBox<T1, T2> {
    private List<T1> items = new ArrayList<>();
    private T2 boxSize;

    public GenericsBox() {

    }

    public List<T1> getItems() {
        return items;
    }

    public void setItems(T1 item) {
        this.items.add(item);
    }

    public T2 getBoxSize() {
        return boxSize;
    }


    public void setBoxSize(T2 boxSize) {
        this.boxSize = boxSize;
    }


}
