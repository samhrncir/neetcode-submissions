class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet[] rowHashSetArray = new HashSet[9];
        HashSet[] colHashSetArray = new HashSet[9];
        HashSet[][] boxHashSetArray = new HashSet[3][3];

        // populate the arrays
        for (int i = 0; i < 9; i++) {
            rowHashSetArray[i] = new HashSet<Character>();
            colHashSetArray[i] = new HashSet<Character>();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxHashSetArray[i][j] = new HashSet<Character>();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j =0; j < 9; j++) {
                // i = row
                // j = column
                // based on its i,j is the box 
                // ignore '.'s
                char curChar = board[i][j];
                if (curChar != '.') {
                    HashSet<Character> rowValues = rowHashSetArray[i];
                    boolean notInRow = rowValues.add(curChar);

                    Set<Character> colValues = colHashSetArray[j];
                    boolean notInCol = colValues.add(curChar);

                    // figure out which box 
                    int boxRow = i / 3;
                    int boxCol = j / 3;
                    HashSet<Character> boxValues = boxHashSetArray[boxRow][boxCol];
                    boolean notInBox = boxValues.add(curChar);

                    if (!(notInRow && notInCol && notInBox)) {
                        return false;
                    }
                }

            }
        }
        return true;
    }
}

