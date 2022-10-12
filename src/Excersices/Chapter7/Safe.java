package Excersices.Chapter7;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Safe<T> {
    public T item;

    public Safe(T item) {
        this.item = item;
    }

    public void store(T item){
        this.item = item;
    }

    public Optional<T> retrive(){
        if (item == null)
        return Optional.empty();
        else
            return Optional.of(item);

    }
}
