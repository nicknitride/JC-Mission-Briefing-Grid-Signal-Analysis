package org.nickproj;

public class Main {
    public static void main(String[] args) {
        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop(GridSignalAnalyzer.scrambledGrid);

        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop(GridSignalAnalyzer.scrambledGrid);

        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop(GridSignalAnalyzer.scrambledGrid);
    }
}