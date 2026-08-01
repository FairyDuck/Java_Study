package com.study;

public class ArrayTest2 {
    static void main(String[] args) {
        // 完成数字华容道的创建
        start(4);
    }

    public static void start(int n) {
        int[][] arr = new int[n][n];
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n - 1 && j == n - 1) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = cnt;
                    cnt++;
                }
            }
        }

        printArray(arr);

        // 打乱其中的位置
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int index1 = (int)(Math.random() * arr.length);
                int index2 = (int)(Math.random() * arr.length);
                int temp = arr[index1][index2];
                arr[index1][index2] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        printArray(arr);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
