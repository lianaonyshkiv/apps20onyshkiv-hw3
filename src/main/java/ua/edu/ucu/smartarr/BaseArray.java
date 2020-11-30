package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] elements;

    public BaseArray() {
        this.elements = new Object[0];
    }

    public BaseArray(Object[] array) {
        this.elements = array.clone();
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
        return elements.length;
    }
}
