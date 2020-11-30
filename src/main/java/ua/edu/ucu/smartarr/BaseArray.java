package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{
    private Object[] elements;
    private int length;

    public BaseArray() {
        elements = new Object[0];
        length = 0;
    }

    public BaseArray(Object[] array) {
        elements = array.clone();
        length = array.length;
    }

    @Override
    public Object[] toArray() {
        return elements.clone();
    }

    @Override
    public String operationDescription() {
        return "No decorators";
    }

    @Override
    public int size() {
        return length;
    }
}
