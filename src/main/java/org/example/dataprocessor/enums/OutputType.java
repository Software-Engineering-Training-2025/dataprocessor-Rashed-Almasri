package org.example.dataprocessor.enums;

import org.example.dataprocessor.service.output.Console;
import org.example.dataprocessor.service.output.TextFile;
import org.example.dataprocessor.service.output.interfaces.OutputStrategy;

public enum OutputType {
    /** Print "Result = <value>" to stdout */
    CONSOLE{
        @Override
        public OutputStrategy getInstance(){
            return new Console();
        }
    },

    /** Write "Result = <value>" to target/result.txt (overwrite, create dirs) */
    TEXT_FILE{
        @Override
        public OutputStrategy getInstance(){
            return new TextFile();
        }
    };
    public abstract OutputStrategy getInstance();
}
