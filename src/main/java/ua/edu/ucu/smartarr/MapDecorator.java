package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    public MapDecorator(SmartArray array, MyFunction function) {
        super(array);
        Object[] result = Arrays.stream(array.toArray()).map(function::apply)
                .toArray();
        elements = result.clone();


    }

    @Override
    public String operationDescription() {
        return "Map every element to another object using MyFunction";
    }
}
