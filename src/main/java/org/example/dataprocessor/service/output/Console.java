package org.example.dataprocessor.service.output;

import org.example.dataprocessor.service.output.interfaces.OutputStrategy;

public class Console implements OutputStrategy {
    @Override
    public void output(String result) {
        System.out.println("Result = " + result);
    }
}
