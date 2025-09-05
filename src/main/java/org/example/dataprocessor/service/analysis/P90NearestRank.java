package org.example.dataprocessor.service.analysis;

import org.example.dataprocessor.service.analysis.interfaces.AnalysisStrategy;

import java.util.ArrayList;
import java.util.List;

public class P90NearestRank implements AnalysisStrategy {
    @Override
    public Double analyze(List<Integer> data) {
        if(data.isEmpty()){
            return Double.NaN;
        }
        List<Integer> sortedData = data.stream().sorted().toList();
        int rankIndex = (int) Math.ceil(sortedData.size() * 0.90) - 1;
        return (double) sortedData.get(rankIndex);
    }
}
