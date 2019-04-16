public class Maze_Look {
    public static void main(String[] args) {

        Maze labyrinth = new Maze();
        labyrinth.opend();

        labyrinth.print_maze();

for(int i = 0; i < 5; i++) {
    labyrinth.takeStep();
    System.out.println(labyrinth.getx()) ;
}
    labyrinth.print_maze();
}
    }// method main
// class Maze_Search
