// This program will implement a magic square odd integer intake. The matrix structure will move index
// upperbounds, and if the space is occupied the index will move down.
// author: Ericka H. B

class MagicSquare {
    static void magic(int n) {
        int [][] magicSquare = new int[n][n];

        // position 1
        int j = 0;
        int i = n / 2;

        // next index(s) loop condition
        for (int x = 1; x <= n * n; x++) {
            magicSquare[j][i] = x;


            // if space is occupied move down
            if (x % n == 0)
                j++;
            else
                // subtracting 1 to move upperbounds
                j--;
            i--;
            // continue generation during upperbounds x
            if (j < 0)
                j ++;
            if (i < 0)
                i ++;
        }

        // print magic square including upperbound results of pushing empty squares
        for (j = 0; j < n; j++) {
            for (i = 0; i < n; i++) {
                System.out.print(magicSquare[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    // test driver to test an odd number

    public static void main(String[] args) {
        int n = 5;
        magic(n);
    }
}

