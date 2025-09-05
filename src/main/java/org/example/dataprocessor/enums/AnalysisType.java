package org.example.dataprocessor.enums;
import org.example.dataprocessor.service.analysis.*;
import org.example.dataprocessor.service.analysis.interfaces.AnalysisStrategy;
public enum AnalysisType {
    /** Arithmetic average; empty -> NaN */
    MEAN{
        @Override
        public AnalysisStrategy getInstance(){
            return new Mean();
        }
    },

    /** Median; even -> average of two middles; empty -> NaN */
    MEDIAN{
        @Override
        public AnalysisStrategy getInstance(){
            return new Median();
        }
    },

    /** Population standard deviation (divide by N); empty -> NaN */
    STD_DEV{
        @Override
        public AnalysisStrategy getInstance(){
            return new StandardDeviation();
        }
    },

    /** 90th percentile by nearest-rank: rank = ceil(0.90 * N) on sorted asc (1-based); empty -> NaN */
    P90_NEAREST_RANK{
        @Override
        public AnalysisStrategy getInstance(){
            return new P90NearestRank();
        }
    },

    /** Sum of top-3 frequency counts (order by count desc, tiebreak by value asc); empty -> 0.0 */
    TOP3_FREQUENT_COUNT_SUM{
        @Override
        public AnalysisStrategy getInstance(){
            return new Top3FrequentCountSum();
        }
    };
    public abstract AnalysisStrategy getInstance();
}
