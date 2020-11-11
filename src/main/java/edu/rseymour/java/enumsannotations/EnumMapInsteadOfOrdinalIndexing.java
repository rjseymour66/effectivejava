package edu.rseymour.java.enumsannotations;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnumMapInsteadOfOrdinalIndexing {

    static class Plant {
        enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

        final String name;
        final LifeCycle lifeCycle;

        Plant (String name, LifeCycle lifeCycle) {
            this.name = name;
            this.lifeCycle = lifeCycle;
        }

        @Override
        public String toString() {
            return name;
        }

        public static void main(String[] args) {

            // using EnumMap to associate data with an enum
            Map<LifeCycle, Set<Plant>> plantsByLifeCycle =
                    new EnumMap<>(Plant.LifeCycle.class);
            for (Plant.LifeCycle lc : Plant.LifeCycle.values())
                plantsByLifeCycle.put(lc, new HashSet<>());
//            for (Plant p : garden)
//                plantsByLifeCycle.get(p.lifeCycle).add(p);
//            System.out.println(plantsByLifeCycle);
        }
    }
}
