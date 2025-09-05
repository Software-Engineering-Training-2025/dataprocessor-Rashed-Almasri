package org.example.dataprocessor.service.analysis;

import org.example.dataprocessor.service.analysis.interfaces.AnalysisStrategy;

import java.util.List;

public class StandardDeviation implements AnalysisStrategy {
    @Override
    public Double analyze(List<Integer> data) {
        if(data.isEmpty()){
            return Double.NaN;
        }
        double sum = 0;
        for(Integer i : data){
            sum += i;
        }
        double mean = sum /  data.size();
        double squaredDifference = 0;
        for(Integer i : data){
            squaredDifference += Math.pow(i - mean, 2);
        }

        return  Math.sqrt(squaredDifference / data.size());
    }
}
