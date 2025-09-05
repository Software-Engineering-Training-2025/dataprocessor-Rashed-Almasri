package org.example.dataprocessor.service.cleaining;

import org.example.dataprocessor.service.cleaining.interfaces.CleaningStrategy;

import java.util.ArrayList;
import java.util.List;

public class ReplaceNegativesWithZero implements CleaningStrategy {
    @Override
    public List<Integer> clean(List<Integer> data) throws Exception {
        data = new ArrayList<>(data);
        for(int i = 0; i < data.size(); i++){
            if(data.get(i) < 0){
                data.set(i, 0);
            }
        }
        return data;
    }
}
