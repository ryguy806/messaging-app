package fluentinterfaces;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayUtils {

    private Object[] array;

    public  ArrayUtils(Object[] array)
    {
        this.array = array;
    }

    public ArrayUtils resize(int size){

        Object[] oldArray = array;
        array = new Object[size];

        for(int i = 0; i < array.length; i++){
            if(i < oldArray.length){
                array[i] = oldArray[i];
            }
        }

        return this;
    }

    public ArrayUtils removeDuplicates(Object duplicate){

        Set<Object> set = new HashSet<>(Arrays.asList(array));

        array = set.toArray();

        return this;
    }

    public ArrayUtils filter(Object other){

        List<Object> oldArray = new ArrayList<>();

        for(Object object : array){
            if(!object.equals(other)){
                oldArray.add(other);
            }
        }

        array = oldArray.toArray();
        return this;
    }

    public Object[] getArray(){

        return array;
    }
}
