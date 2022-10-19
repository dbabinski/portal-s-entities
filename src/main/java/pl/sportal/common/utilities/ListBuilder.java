package pl.sportal.common.utilities;

import java.util.LinkedList;
import java.util.List;

/**

 * @param <T>
 */
public class ListBuilder<T> {

    private LinkedList<T> list = new LinkedList<>();

    //--------------------------------------------------------------------------
    // Konstruktor
    //--------------------------------------------------------------------------
    public ListBuilder() {      
    }

    public ListBuilder(LinkedList<T> list) {
        if(list != null) {
            this.list.addAll(list);
        }
    }

    //--------------------------------------------------------------------------
    // Metody publiczne
    //--------------------------------------------------------------------------
    public LinkedList<T> build() {
        return list;
    }

    public ListBuilder append(T object) {
        if (list != null) {
            list.add(object);
        }
        return this;
    }

    public ListBuilder addAll(List<T> objects) {
        if (objects != null) {
            objects.forEach(o -> {
                list.add(o);
            });
        }
        return this;
    }

    public ListBuilder addUnique(List<T> objects) {
        if (objects != null) {
            objects.forEach(o -> {
                if (!list.contains(o)) {
                    list.add(o);
                }
            });
        }
        return this;
    }
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public int sizeF() {
        return list.size();
    }
    //--------------------------------------------------------------------------
    // Metody prywatne
    //--------------------------------------------------------------------------
}
