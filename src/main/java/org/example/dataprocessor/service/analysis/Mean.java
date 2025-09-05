package org.example.dataprocessor.service.analysis;

import org.example.dataprocessor.service.analysis.interfaces.AnalysisStrategy;

import java.util.List;

public class Mean implements AnalysisStrategy {
    @Override
    public Double analyze(List<Integer> data){
        if(data.isEmpty()){
            return Double.NaN;
        }
        int sum = 0;
        for(Integer i : data){
            sum += i;
        }
        return sum / (double)data.size();
    }
}
