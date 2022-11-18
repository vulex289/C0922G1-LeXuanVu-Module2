package ss9_DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Mylist<E> {
    private int size;
    static final int DEFAULT_CAPACITY=10;
    Object [] elements;
    public Mylist(){
        elements= new Object[DEFAULT_CAPACITY];
    }
    Mylist(int capacity){
        if (capacity>0){
elements= new Object[capacity];
        }
        else {
            throw new IllegalArgumentException("capacity: "+capacity);
        }
    }
    /**
     * Phương thức trả về số phần tử
     * */
    public int Size(){
        return  this.size;
    }
    /**
     * Phương thức clear ArrayList
     * */
    public void clear(){
        size=0;
        for(int i=0;i<elements.length;i++){
            elements[i]=null;
        }

    }
    public boolean add(E element){
        if(elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size]=element;
        size++;
        return true;
    }
    public void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSize=this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
        }
        else{
            throw new IllegalArgumentException("minCapacity"+minCapacity);
        }
    }
    public void add(int element,int index) {
        if (index > elements.length) throw new IllegalArgumentException("index:" + index);

        else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if(elements[index]==null){
            elements[index]=element;
            size++;
        }
        else {
            for (int i=size+1;i>=index;i--){
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }
}
