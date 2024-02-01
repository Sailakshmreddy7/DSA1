public class Matrix {
    public static void transposeOfMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a[i].length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

    }

    public static void mirrorMatrix(int a[][]) {
        transposeOfMatrix(a);
        for (int i = 0; i < a.length; i++) {
            int high = a.length - 1;
            int low = 0;
            while (low < high) {
                int temp = a[low][i];
                a[low][i] = a[high][i];
                a[high][i] = temp;
                low++;
                high--;
            }
        }
    }

    public static void mirrorMatrix(int[][] a) {
        transposeOfMatrix(a);
        int k = a.length - 1;
        for (int i = 0; i < k; i++) {
            for (int j = i; j < a[i].length; j++) {
                int temp = a[i][j];
                a[i][j] = a[k][j];
                a[k][j] = temp;
            }
            k--;
        }
    }

    public static void boundaryTraverse(int[][] a) {
        for (int i = 0; i < a[0].length; i++) {
            System.out.print(a[0][i]);
        }
        System.out.println();
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i][a[0].length - 1]);
        }
        System.out.println();
        for (int i = a[0].length - 2; i >= 0; i--) {
            System.out.print(a[a.length - 1][i]);
        }
        System.out.println();
        for (int i = a.length - 2; i > 0; i--) {
            System.out.print(a[i][0]);
        }
        System.out.println();
    }

    public static void spirallyTraverse(int[][] a) {
        int left = 0;
        int top = 0;
        int right = a[0].length - 1;
        int bottom = a.length - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void snakeTraverse(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j] + " ");
                }
            } else {
                for (int j = a[i].length - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }

    public static void searchElemInSortedMatrix(int[][] a, int ele) {
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] == ele) {
                        System.out.print("True");
                    }
                }
            } else {
                for (int j = a[i].length - 1; j >= 0; j--) {
                    if (a[i][j] == ele) {
                        System.out.print("True");
                    }
                }
            }
        }
    }

    public static void searchInMatrix(int[][] a, int target) {
        int i = 0;
        int j = a[0].length - 1;
        boolean found = false;
        while (i <= a.length - 1 && j >= 0) {
            // System.out.println(a[i][j] + " " + i + " " + j);
            if (a[i][j] == target) {
                // System.out.print(i + " " + j);
                System.out.print("True");
                found = true;
                break;
            } else if (a[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        if (!found) {
            System.out.print("False");
        }
    }

    public static void sumOfDiagonalElementsOfMatrix(int[][] a) {
        int sum = 0;
        int j = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
            sum += a[i][j];
            j--;
        }
        if (a.length % 2 == 0) {
            System.out.print(sum);
        } else {
            sum -= a[a.length / 2][a.length / 2];
            System.out.print(sum);
        }

    }

    public

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // mirrorMatrix(a);
        // transposeOfMatrix(a);
        // boundaryTraverse(a);
        // printMatrix(a);
        // spirallyTraverse(a);
        // snakeTraverse(a);
        // searchElemInSortedMatrix(a, 10);
        // searchInMatrix(a, 35);
        sumOfDiagonalElementsOfMatrix(a);
    }

}
