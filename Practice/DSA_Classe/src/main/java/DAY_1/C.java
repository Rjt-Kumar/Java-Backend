package DAY_1;

public class C {
        public long maximumValueSum(int[][] board) {
            int m = board.length;
            int n = board[0].length;
            long maxSum = Long.MIN_VALUE;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    long currentSum = board[i][j];
                    boolean[] rowUsed = new boolean[m];
                    boolean[] colUsed = new boolean[n];
                    rowUsed[i] = true;
                    colUsed[j] = true;

                    long secondMax = Long.MIN_VALUE;
                    int secondRow = -1, secondCol = -1;

                    // Find the best position for the second rook
                    for (int r = 0; r < m; r++) {
                        if (rowUsed[r]) continue;
                        for (int c = 0; c < n; c++) {
                            if (colUsed[c]) continue;
                            if (board[r][c] > secondMax) {
                                secondMax = board[r][c];
                                secondRow = r;
                                secondCol = c;
                            }
                        }
                    }

                    // If a valid second rook is found
                    if (secondMax != Long.MIN_VALUE) {
                        currentSum += secondMax;
                        rowUsed[secondRow] = true;
                        colUsed[secondCol] = true;

                        long thirdMax = Long.MIN_VALUE;

                        // Find the best position for the third rook
                        for (int r = 0; r < m; r++) {
                            if (rowUsed[r]) continue;
                            for (int c = 0; c < n; c++) {
                                if (colUsed[c]) continue;
                                if (board[r][c] > thirdMax) {
                                    thirdMax = board[r][c];
                                }
                            }
                        }

                        // If a valid third rook is found
                        if (thirdMax != Long.MIN_VALUE) {
                            currentSum += thirdMax;
                        }

                        // Update the maximum sum
                        maxSum = Math.max(maxSum, currentSum);
                    }
                }
            }

            return maxSum;
        }

    }
