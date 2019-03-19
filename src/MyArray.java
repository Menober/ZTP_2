import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class MyArray <T> {
    private T[] array;
    private int size;
    private int actualSize = 0;

    public T newObjInstance(Class<T> clazz, T t){
        try {
            return clazz.getConstructor(clazz).newInstance(t);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MyArray(Class<T> clazz, int size){
        array = (T[])Array.newInstance(clazz, size);
        this.size = size;
    }

    public T get(int index){
        return array[index];
    }

    public void set(int index, T t){
        if(index<size) array[index] = t;
    }

    public void add(T t){
        array[actualSize++] = t;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
