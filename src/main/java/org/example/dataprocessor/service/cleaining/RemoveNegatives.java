package org.example.dataprocessor.service.cleaining;

import org.example.dataprocessor.service.cleaining.interfaces.CleaningStrategy;

import java.util.ArrayList;
import java.util.List;

public class RemoveNegatives implements CleaningStrategy {
    @Override
    public List<Integer> clean(List<Integer> data) throws Exception {
        data = new ArrayList<>(data);
        data.removeIf(i -> i < 0);
        return data;
    }
}