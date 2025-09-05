package org.example.dataprocessor.service.analysis;

import org.example.dataprocessor.service.analysis.interfaces.AnalysisStrategy;
import org.example.dataprocessor.util.Pair;

import java.util.*;

public class Top3FrequentCountSum implements AnalysisStrategy {
    @Override
    public Double analyze(List<Integer> data) {
        if(data.isEmpty()){
            return 0.0;
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(Integer num : data){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Pair<Integer, Integer>> frequencyList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            frequencyList.add(new Pair<>(entry.getKey(), entry.getValue()));
        }

        frequencyList.sort(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
                int cmp = Integer.compare(p2.getSecond(), p1.getSecond());
                if (cmp != 0) {
                    return cmp;
                }
                return Integer.compare(p1.getFirst(), p2.getFirst());
            }
        });
        int sum = 0;
        for(int i = 0; i < Math.min(3, frequencyList.size()); i++){
            sum += frequencyList.get(i).getSecond();
        }

        return (double) sum;
    }
}
