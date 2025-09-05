package org.example.dataprocessor.service.analysis;

import org.example.dataprocessor.service.analysis.interfaces.AnalysisStrategy;

import java.util.List;

public class Median implements AnalysisStrategy {
    @Override
    public Double analyze(List<Integer> data){
        if(data.isEmpty()){
            return Double.NaN;
        }
        List<Integer> sortedData = data.stream().sorted().toList();
        double median;
        if (sortedData.size() % 2 == 0) {
            median = (sortedData.get(sortedData.size() / 2) +  sortedData.get(sortedData.size() / 2 - 1)) / 2.0;
        }
        else {
            median = sortedData.get(sortedData.size() / 2);
        }
        return median;
    }
}
