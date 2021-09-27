// This program will implement a basic magic square odd integer intake and display the results
// author: Ericka H. B

class MagicSquareOG {
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
                // original placement if avaliable
                j--;
                i--;
            // for postions thats outofbounds
            if (j < 0)
                j +=n;
            if (i < 0)
                i +=n;
        }

        // print magic square
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
