package ua.edu.ucu.smartarr;

import java.util.*;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    public DistinctDecorator(SmartArray array) {
        super(array);
        LinkedHashSet<Object> setElements = new LinkedHashSet<>(Arrays.asList(array.toArray()));
        elements = setElements.toArray().clone();
    }

    @Override
    public String operationDescription() {
        return "Remove duplicates from SmartArray. Use method equals()" +
                "to compare objects";
    }
}
