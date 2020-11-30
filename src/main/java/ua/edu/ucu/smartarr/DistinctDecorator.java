package ua.edu.ucu.smartarr;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{
    public DistinctDecorator(SmartArray array) {
        super(array);
        Set<Object> setElements = new HashSet<Object>();
        Collections.addAll(setElements, elements);
    }

    @Override
    public String operationDescription() {
        return "Remove duplicates from SmartArray. Use method equals()" +
                "to compare objects";
    }
}
