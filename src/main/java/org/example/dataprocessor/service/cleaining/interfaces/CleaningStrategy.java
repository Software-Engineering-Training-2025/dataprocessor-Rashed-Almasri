package org.example.dataprocessor.service.cleaining.interfaces;

import java.util.List;

public interface CleaningStrategy {
    List<Integer> clean(List<Integer> data) throws Exception;
}
