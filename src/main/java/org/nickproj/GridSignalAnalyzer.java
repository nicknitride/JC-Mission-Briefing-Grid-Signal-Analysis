package org.nickproj;

import java.util.Arrays;

public class GridSignalAnalyzer {
    // Mission Data: The Scrambled Communications Grid
    static char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };

     void analyzeWithForLoop(char[][] charArr){
        for (int x = 0; x < charArr.length; x++){
            for(int columns = 0; columns < charArr[x].length; columns++){
                System.out.print(charArr[x][columns]+" ");
            }
            System.out.println();
        }
    }

     void analyzeWithForEachLoop(char[][] charArr){
        for (char[] rowArray : charArr){
            System.out.println("Processing Row with Hash: "+rowArray.toString());
            for(char columnEntry : rowArray){
                System.out.println("-> "+columnEntry);
            }
            System.out.println();
        }
    }

     void analyzeWithHybridLoop(char[][] charArr){
        for (char[] rowArray : charArr){
            for(int col = 0; col < rowArray.length ; col++){
                System.out.print(rowArray[col]+" ");
            }
            System.out.println();
        }
    }
}
