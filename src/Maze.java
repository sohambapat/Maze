public class Maze {
    private int x = 0;
    private static int y = 2;
    private static char a = 'V';
    int count = 0;
    public int[][] grid = new int[][]{
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

    //===========================================================
    //  Prints the maze grid.
    //===========================================================
    public void print_maze() {

        System.out.println();

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++)
                System.out.print(grid[row][column]);
            System.out.println();
        }

        System.out.println();

    }  // method print_maze

    public void opend() {
        for (int i = 0; i < grid[16].length; i++) {
            int mata = 1;
            if (grid[16][i] == 1) {
                mata = 0;
                if (mata == 0) {
                    grid[16][i] = 6;
                }
                break;
            }
        }
    }

    int marker = 0;

    //===========================================================
    //  Attempts to recursively traverse the maze.  It inserts
    //  special characters indicating locations that have been
    //  tried and that eventually become part of the solution.
    //===========================================================
    public boolean solve(int row, int column) {


        boolean done = false;
        if (tempsol(row, column)) {
            done = true;
        } else if (valid(row, column)) {

            grid[row][column] = 3; // cell has been tried

//            row == grid.length-1 && column == grid[0].length-1
            if (row == grid.length - 1 && column == grid[0].length - 1)
                done = true;  // maze is solved
            else {
                if(a == 'V') {
                    if (!done) {
                        done = solve(row, column - 1);  // west
                        a = '<';
                    }
                    if (!done) {
                        done = solve(row + 1, column);    //south
                        a = 'V';
                    }
                    if (!done) {
                        done = solve(row, column + 1);  // east
                        a = '>';
                    }
                    if (!done) {
                        done = solve(row - 1, column);  // north
                        a = '^';
                    }
                }
                if(a == '>') {
                    if (!done) {
                        done = solve(row + 1, column);    //south
                        a = 'V';
                    }
                    if (!done) {
                        done = solve(row, column + 1);  // east
                        a = '>';
                    }
                    if (!done) {
                        done = solve(row - 1, column);  // north
                        a = '^';
                    }
                    if (!done) {
                        done = solve(row, column - 1);  // west
                        a = '<';
                    }
                }
                if(a == '<') {
                    if (!done) {
                        done = solve(row - 1, column);  // north
                        a = '^';
                    }
                    if (!done) {
                        done = solve(row, column - 1);  // west
                        a = '<';
                    }
                    if (!done) {
                        done = solve(row + 1, column);    //south
                        a = 'V';
                    }
                    if (!done) {
                        done = solve(row, column + 1);  // east
                        a = '>';
                    }
                }
                if(a == '^') {
                    if (!done) {
                        done = solve(row, column + 1);  // east
                        a = '>';
                    }
                    if (!done) {
                        done = solve(row - 1, column);  // north
                        a = '^';
                    }
                    if (!done) {
                        done = solve(row, column - 1);  // west
                        a = '<';
                    }
                    if (!done) {
                        done = solve(row + 1, column);    //south
                        a = 'V';
                    }
                }
            }
            if (done) {
                if(a == '<') {
                    grid[row][column] = 7;
                }
                if(a == 'V') {
                    grid[row][column] = 7;
                }
                if(a == '^') {
                    grid[row][column] = 7;
                }
                if(a == '>') {
                    grid[row][column] = 7;
                }

                // part of the final path
            }
            if(grid[row][column] == 3) {
                if (a == 'V') {
                    a = '^';
                } else if (a == '^') {
                    a = 'V';
                } else if (a == '<') {
                    a = '>';
                } else if (a == '>') {
                    a = '<';
                }
            }
        }
//        if()

        return done;

    }  // method solve

    public int getx() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void takeStep () {
        boolean back = false;
        if (tempsol(x, y) || tempsol(x+1,y) || tempsol(x-1,y) || tempsol(x,y-1) || tempsol(x,y+1)) {
            grid[x][y] = 7;
        } else {
//            row == grid.length-1 && column == grid[0].length-1

            if (a == 'V') {
                if (valid(x, y - 1)) { //west
                    grid[x][y] = 7;
                    y--;
                    a = '<';
                } else if (valid(x + 1, y)) { //south
                    grid[x][y] = 7;
                    x++;
                    a = 'V';
                } else if (valid(x, y + 1)) { //east
                    grid[x][y] = 7;
                    y++;
                    a = '>';
                } else if (valid(x - 1, y)) { //north
                    grid[x][y] = 7;
                    x--;
                    a = '^';
                } else if (grid[x][y] == 3) {
                        if(grid[x-1][y] == 7 && grid[x+1][y]==7) {
                            a = 'V';
                            x++;
                        }
                        else if (grid[x - 1][y] ==7) {
                            x--;
                            a = '^';
                        }
                        else if(grid[x-1][y] == 3 && grid[x][y-1] == 7) {
                            y--;
                            a = '<';
                        }
                        else if(grid[x-1][y] == 3 && grid[x+1][y] == 7) {
                            x++;
                            a = 'V';
                        }
                        else if(grid[x-1][y] == 3 && grid[x][y+1] == 7) {
                            y++;
                            a= '>';
                        }
                } else if (grid[x][y] == 7 && !valid(x, y - 1) && !valid(x, y + 1) && !valid(x + 1, y) && valid(x - 1, y)) {
                    grid[x][y] = 3;
                }
                if (valid(x, y)) {
                    grid[x][y] = 7;
                }
            }
            else if (a == '>') {
                if (valid(x + 1, y)) { //south
                    grid[x][y] = 7;
                    x++;
                    a = 'V';
                } else if (valid(x, y + 1)) { //east
                    grid[x][y] = 7;
                    y++;
                    a = '>';
                } else if (valid(x - 1, y)) { //north
                    grid[x][y] = 7;
                    x--;
                    a = '^';
                } else if (valid(x, y - 1)) { //west
                    grid[x][y] = 7;
                    y--;
                    a = '<';
                } else if (grid[x][y] == 3) {
                    if(grid[x][y-1] == 7 && grid[x][y+1]==7) {
                        a = '>';
                        y++;
                    }
                    else if(grid[x][y-1] ==7) {
                        y--;
                        a = '<';
                    }
                    else if(grid[x][y-1] == 3 && grid[x+1][y] == 7) {
                        x++;
                        a = 'V';
                    }
                    else if(grid[x][y-1] == 3 && grid[x][y+1] == 7) {
                        y++;
                        a = '>';
                    }
                    else if(grid[x][y-1] == 3 && grid[x-1][y] == 7) {
                        x--;
                        a = '^';
                    }
                }
                else if(grid[x][y] == 7 && !valid(x, y - 1) && !valid(x, y + 1) && !valid(x+1, y) && valid(x-1, y)) {
                    grid[x][y] = 3;
                }
                if(valid(x,y)) {
                    grid[x][y] = 7;
                }
            }
            else if (a == '<') {
                if (valid(x - 1, y)) { //north
                    grid[x][y] = 7;
                    x--;
                    a = '^';
                } else if (valid(x, y - 1)) { //west
                    grid[x][y] = 7;
                    y--;
                    a = '<';
                } else if (valid(x + 1, y)) { //south
                    grid[x][y] = 7;
                    x++;
                    a = 'V';
                } else if (valid(x, y + 1)) { //east
                    grid[x][y] = 7;
                    y++;
                    a = '>';
                } else if (grid[x][y] == 3) {
                    if(grid[x][y+1] == 7 && grid[x][y-1]==7) {
                        y--;
                        a = '<';
                    }
                    else if(grid[x][y+1] == 3 && grid[x-1][y] == 7) {
                        x--;
                        a = '^';
                    }
                    else if(grid[x][y+1] == 3 && grid[x][y-1] == 7) {
                        y--;
                        a = '<';
                    }
                    else if(grid[x][y+1] == 3 && grid[x+1][y] == 7) {
                        x++;
                        a = 'V';
                    }
                    else if(grid[x][y+1] ==7) {
                        y++;
                        a = '>';
                    }
                }
                else if(grid[x][y] == 7 && !valid(x, y - 1) && !valid(x, y + 1) && !valid(x+1, y) && valid(x-1, y)) {
                    grid[x][y] = 3;
                }
                if(valid(x,y)) {
                    grid[x][y] = 7;
                }
            }
            else if (a == '^') {
                if (valid(x, y + 1)) { //east
                    grid[x][y] = 7;
                    y++;
                    a = '>';
                } else if (valid(x - 1, y)) { //north
                    grid[x][y] = 7;
                    x--;
                    a = '^';
                } else if (valid(x, y - 1)) { //west
                    grid[x][y] = 7;
                    y--;
                    a = '<';
                } else if (valid(x + 1, y)) { //south
                    grid[x][y] = 7;
                    x++;
                    a = 'V';
                }else if (grid[x][y] == 3) {
                    if(grid[x+1][y] == 7 && grid[x-1][y]==7) {
                        x--;
                        a = '^';
                    }
                    else if(grid[x+1][y] == 7) {
                        x++;
                        a = 'V';
                    }
                    else if(grid[x+1][y] == 3 && grid[x][y+1] == 7) {
                        y++;
                        a = '>';
                    }
                    else if(grid[x+1][y] == 3 && grid[x-1][y] == 7) {
                        x--;
                        a = '^';
                    }
                    else if(grid[x+1][y] == 3 && grid[x][y-1] == 7) {
                        y--;
                        a = '<';
                    }
                }
                else if(grid[x][y] == 7 && !valid(x, y - 1) && !valid(x, y + 1) && !valid(x+1, y) && valid(x-1, y)) {
                    grid[x][y] = 3;
                }
                if(valid(x,y)) {
                    grid[x][y] = 7;
                }

            }
            grid[x][y] = 3;
        }
    }
//        if()




    //===========================================================
        //  Determines if a specific location is valid.
        //===========================================================
    public char getA() {
        return a;
    }
    private boolean valid(int row, int column) {

        boolean result = false;

        // check if cell is in the bounds of the matrix
        if (row >= 0 && row < grid.length && column >= 0 && column < grid[0].length)

            //  check if cell is not blocked and not previously tried
            if (grid[row][column] == 1)
                result = true;

        return result;

    }  // method valid

    public boolean tempsol(int row, int column) {
        boolean result = false;

        if (row >= 0 && row < grid.length && column >= 0 && column < grid[0].length)
            if (grid[row][column] == 6)
                result = true;

        return result;
    }

}
// class Maze