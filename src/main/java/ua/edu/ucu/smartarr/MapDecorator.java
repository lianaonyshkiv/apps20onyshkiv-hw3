package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    public MapDecorator(SmartArray array, MyFunction function) {
        super(array);
        Object[] result = Arrays.stream(elements).map(function::apply)
                .toArray();


    }

    @Override
    public String operationDescription() {
        return "Map every element to another object using MyFunction";
    }
}
