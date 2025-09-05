package org.example.dataprocessor.enums;

import org.example.dataprocessor.service.cleaining.RemoveNegatives;
import org.example.dataprocessor.service.cleaining.ReplaceNegativesWithZero;
import org.example.dataprocessor.service.cleaining.interfaces.CleaningStrategy;

public enum CleaningType {
    /** Drop all values < 0 */
    REMOVE_NEGATIVES{
        @Override
        public CleaningStrategy getInstance(){
            return new RemoveNegatives();
        }
    },

    /** Replace all values < 0 with 0 */
    REPLACE_NEGATIVES_WITH_ZERO{
        @Override
        public CleaningStrategy getInstance(){
            return new ReplaceNegativesWithZero();
        }
    };
    public abstract CleaningStrategy getInstance();
}