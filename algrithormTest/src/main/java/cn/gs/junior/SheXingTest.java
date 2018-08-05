package cn.gs.junior;

/**
 * @Author: gaoshuai
 * @Date: 2018/5/14 16:50
 * @Version 1.0
 */


/**
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 */
//打印：1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10


public class SheXingTest {
    int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8},
            {9, 10, 11, 12}, {13, 14, 15, 16}};
    int arrColum = arr[0].length;
    int arrRow = arr.length;

    int[][] arrFlag = {{0, 0, 0, 0}, {0, 0, 0, 0},
            {0, 0, 0, 0}, {0, 0, 0, 0}};
    int dirction = 1;

    public void getNext(int colum, int row) {
        if (this.checkFlag()) {
            return;
        }

        int rowNew;
        int columNew;
        if (dirction == 1) {
            rowNew = row + 1;
            if (rowNew < arrRow && arrFlag[colum][rowNew] == 0) {
                arrFlag[colum][rowNew] = 1;
                System.out.print(arr[colum][rowNew] + " ");
                //向右走
                getNext(colum, rowNew);
            } else {
                dirction = 2;
                getNext(colum, row);
            }
        }
        if (dirction == 2) {
            if (arr[colum][row] == 11) {
                dirction = 2;
            }
            columNew = colum + 1;
            if (columNew < arrColum && arrFlag[columNew][row] == 0) {
                System.out.print(arr[columNew][row] + " ");
                arrFlag[columNew][row] = 1;
                //向下走
                getNext(columNew, row);
            } else {
                dirction = 3;
                getNext(colum, row);
            }
        }

        if (dirction == 3) {
            rowNew = row - 1;
            if (rowNew >= 0 && arrFlag[colum][rowNew] == 0) {
                System.out.print(arr[colum][rowNew] + " ");
                arrFlag[colum][rowNew] = 1;
                //向左走
                getNext(colum, rowNew);
            } else {
                dirction = 4;
                getNext(colum, row);
            }
        }

        if (dirction == 4) {
            columNew = colum - 1;
            if (columNew >= 0 && arrFlag[columNew][row] == 0) {
                System.out.print(arr[columNew][row] + " ");
                arrFlag[columNew][row] = 1;
                //向上走
                getNext(columNew, row);
            } else {
                dirction = 1;
                getNext(colum, row);
            }
        }

    }

    public boolean checkFlag() {
        for (int i = 0; i < arrColum; i++) {
            for (int j = 0; j < arrRow; j++) {
                if (arrFlag[i][j] == 0) {
                   return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SheXingTest test = new SheXingTest();
        test.getNext(0, -1);
    }

}
