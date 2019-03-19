import java.lang.reflect.InvocationTargetException;

public class Pair <T> implements Cloneable{
    private T key;
    private T value;

    private Pair(){}

    public Pair(T key, T value){
        this.key = key;
        this.value = value;
    }

    public T getKey(){
        return key;
    }

    public T getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Key : " + key + ", Value: " + value;
    }

    @Override
    public Pair<T> clone() {
        Pair<T> pair = new Pair<>();
        try {
            pair.key = (T) key.getClass().getMethod("clone").invoke(key);
            pair.value = (T) value.getClass().getMethod("clone").invoke(value);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return pair;
    }
}
