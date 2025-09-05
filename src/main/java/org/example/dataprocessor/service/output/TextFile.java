package org.example.dataprocessor.service.output;

import org.example.dataprocessor.service.output.interfaces.OutputStrategy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFile implements OutputStrategy {
    @Override
    public void output(String result) throws Exception{
        Path path = Paths.get("target/result.txt");
        Files.createDirectories(path.getParent());
        Files.write(path, ("Result = " + result).getBytes());
    }
}
