package org.example.dataprocessor;

import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.service.analysis.interfaces.AnalysisStrategy;
import org.example.dataprocessor.service.cleaining.interfaces.CleaningStrategy;
import org.example.dataprocessor.service.output.interfaces.OutputStrategy;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

/**
 * Students ONLY implement the process(...) method below.
 *
 * Requirements:
 * - Order: Clean -> Analyze -> Output -> Return result
 * - Do NOT mutate the original input list
 * - Handle empties as specified in AnalysisType docs
 * - Output format EXACTLY: "Result = <value>"
 * - TEXT_FILE path: target/result.txt (create parent dirs, overwrite file)
 */
public class DataProcessorService {

    /**
     * Implement this method.
     */
    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {

        // TODO: implement using the enums only (no long if/else ladders required,
        // but minimal branching to select behavior by enum is acceptable in this task).
        // Steps:
        // 1) Copy & clean data according to cleaningType.
        // 2) Analyze cleaned array according to analysisType.
        // 3) Output according to outputType (console or target/result.txt).
        // 4) Return the numeric result.
        CleaningStrategy cleaningStrategy = cleaningType.getInstance();
        List<Integer> cleanedData = cleaningStrategy.clean(new ArrayList<>(data));

        AnalysisStrategy analysisStrategy = analysisType.getInstance();
        Double result = analysisStrategy.analyze(cleanedData);

        OutputStrategy outputStrategy = outputType.getInstance();
        outputStrategy.output(result.toString());

        return result;
        //throw new UnsupportedOperationException("Student must implement process(...)");
    }
}

