package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;
import java.util.List;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    public FilterDecorator(SmartArray array, MyPredicate predicate) {
        super(array);
        Object[] result = Arrays.stream(array.toArray()).filter(predicate::test)
                .toArray();
        elements = result.clone();
    }

    @Override
    public String operationDescription() {
        return "Tests every element and removes it if" +
                "it doesn't satisfy MyPredicate";
    }
}
