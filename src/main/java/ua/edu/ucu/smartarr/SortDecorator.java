package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {

    public SortDecorator(SmartArray array, MyComparator comparator) {
        super(array);
        Object[] result = Arrays.stream(array.toArray()).sorted(comparator)
                .toArray();
        elements = result.clone();
    }

    @Override
    public String operationDescription() {
        return "Sorts elements using MyComparator to compare them";
    }
}
