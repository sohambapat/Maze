public class MazeTu {

    private char direction;
    private int r=1;  // x position of the mouse
    private int c=16;  //y position of the mouse
    private boolean exitFound = false;




    public MazeTu(int[][] arrMaze) {
    }

    //Prints out the maze without solution
    public void displayMaze(int[][] arrMaze) {
        //display the maze putting blank spaces where there are 1's in the array and putting
        //another symbol where there are 0's to show the maze without the solution
        for(int i=0; i<arrMaze.length; i++){
            System.out.println(" ");
            for(int j=0; j<arrMaze[i].length; j++){
                if(arrMaze[i][j] == 0){
                    System.out.print("#");
                } if(arrMaze[i][j] == 1) {
                    System.out.print(" ");
                } if(arrMaze[i][j] == 2){
                    System.out.print("@");
                } if(arrMaze[i][j] == 3){
                    System.out.println("~");
                }
            }
        }

    }

    //displays the Maze with the path taken
    public void displayPath(int[][] arrMaze) {

    	/*show the user how far the mouse has gone since the start.
    	 * The path the mouse has gone will be filled in but the path ahead will not.
    	 */
        for (int i = 0; i < arrMaze.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < arrMaze[i].length; j++) {
                if (arrMaze[r][c] == 3) {
                    System.out.print("@");
                } else if (arrMaze[r][c] == 2) {
                    System.out.print("~");
                } else if (arrMaze[r][c] == 0) {
                    System.out.print("#");
                } else {

                }
            }
        }


    }


    public boolean takeStep(int[][] newMaze) {

        // moveNorth(newMaze);
        for (int i = 0; i < newMaze.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < newMaze[i].length; j++) {
                if (newMaze[r][c] == 3) {
                    moveNorth(newMaze);
                    System.out.print("~");
                } else if (newMaze[r][c] == 2) {

                    System.out.print("@");
                } else {

                }
            }
        }

        return isAnExit(newMaze);
    }


    public void moveNorth(int[][] arrMaze) {
        //complete the code here
    	/*method will check for a 0 or a 1 in the position above the current position
    	 * and then if not a 0 will change the current position to the row above it, but in the same column.
    	 */

        if (arrMaze[r][c - 1] != 0) {
            arrMaze[r][c - 1] = 3;
            arrMaze[r][c + 1] = 2;
        } else {
            moveSouth(arrMaze);
        }
        displayPath(arrMaze);


        //if(userInput=n){

        //arrMaze[i-1][j] = "@";
        //arrMaze[i][j]= "-/~";

        // }
    }

    public void moveSouth(int[][] arrMaze) {
        //complete the code here
    	/*method will check for a 0 or a 1 in the position below the current position and then if not a 0
    	 *  will change the current position to the row below it, but in the same column.
    	 */
        if (arrMaze[r][c + 1] != 0) {
            arrMaze[r][c + 1] = 3;
            arrMaze[r][c + 1] = 2;
        } else {
            moveNorth(arrMaze);
        }
        displayPath(arrMaze);
    }


    public void moveEast(int[][] arrMaze) {
        //complete the code here
    	/*method will check for a 0 or a 1 in the position to the right of  the current position and then if
    	 * not a 0 will change the current position to the column to the right but the same row.
    	 */
        if (arrMaze[r + 1][c] != 0) {
            arrMaze[r + 1][c] = 3;
            arrMaze[r - 1][c] = 2;
        } else {
            moveWest(arrMaze);
        }
        displayPath(arrMaze);
    }




    public void moveWest(int[][] arrMaze) {
        //complete the code here
    	/*method will check for a 0 or a 1 in the position to the left of  the current position and then if
    	 *not a 0 will change the current position to the column to the left but the same row.
    	 */
        if (arrMaze[r - 1][c] != 0) {
            arrMaze[r - 1][c] = 3;
            arrMaze[r + 1][c] = 2;
        } else {

        }
        displayPath(arrMaze);
    }




    private boolean isAnExit(int[][] arrMaze) {
        //complete the code here
    	/*method will return true if the user arrives into the last column of the array because there is only one
    	 * location in the last column that is a 1, so if the user reaches the array[i].length then that means that
    	 * it found
       an exit.
    	 */
        if (arrMaze[r][c] > arrMaze.length) {
            exitFound = true;
        } else {
            exitFound = false;
        }
        return exitFound;

    }

    //finds the path without stopping at every step
    public void findExit(int[][] arrMaze) {
        if (arrMaze[r][c] > arrMaze.length) {
            for (int i = 0; i < arrMaze.length; i++) {
                takeStep(arrMaze);
            }
        }


        //complete the code here
        //method will show the complete path from start to finish of the maze and the suggested route to the end.

    }
}