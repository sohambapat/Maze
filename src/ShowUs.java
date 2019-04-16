import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ShowUs extends Application {
    public void start(Stage primaryStage){
        Button btStep=new Button("Step");
        Button btSolve=new Button("Solve");

//        int[][] grid = new int[][]{
//                {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
//                {0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
//                {0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0},
//                {0,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0},
//                {0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0},
//                {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
//                {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
//                {0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
//                {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};


        Maze labyrinth = new Maze();
        int[][] lazy= labyrinth.grid;
        labyrinth.opend();

        HBox btBox=new HBox();
        btBox.getChildren().addAll(btStep,btSolve);
        btBox.setAlignment(Pos.CENTER);

        BorderPane maze=new BorderPane();
        maze.setCenter(sDisplay(lazy));
        maze.setBottom(btBox);

        btSolve.setOnAction(e->{
            if(labyrinth.grid[labyrinth.getx()][labyrinth.getY()]==3) {
                labyrinth.grid[labyrinth.getx()][labyrinth.getY()] = 1;

                if (labyrinth.solve(labyrinth.getx(), labyrinth.getY()))
                    System.out.println("Maze solved!");
                else
                    System.out.println("No solution.");
                maze.setCenter(null);
                maze.setCenter(sDisplay1(lazy));
            }
        });

        btStep.setOnAction(e -> {
            labyrinth.takeStep();
            maze.setCenter(null);
            maze.setCenter(sDisplay1(lazy));
        });

        Scene scene=new Scene(maze);
        primaryStage.setTitle("Maze runner");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static GridPane sDisplay(int grid[][]) {
        Image start=new Image("annoyed.png");
        Image end=new Image("cheese.png");
        Image wall=new Image("wall.png");
        Image mouse=new Image("jerry.jpg");
        Image blank=new Image("Blank.png");

        GridPane maze = new GridPane();

        int choose = 0;
        int choose2 = 0;
        do {
            for (int y = 0; y < grid.length; y++) {
                if (grid[choose][choose2] == 0) {
                    maze.add(new ImageView(wall), choose2, choose);
                    choose++;
                } else if (grid[choose][choose2] == 1) {
                    maze.add(new ImageView(blank), choose2, choose);
                    choose++;
                }
                else if(grid[choose][choose2]==6){
                    maze.add(new ImageView(end),choose2,choose);
                    choose++;
                }
                else if(grid[choose][choose2]==7){
                    maze.add(new ImageView(mouse),choose2,choose);
                    choose++;
                }
                else if(grid[choose][choose2]==3){
                    maze.add(new ImageView(start),choose2,choose);
                    choose++;
                }
            }
            choose = 0;
            choose2++;
        } while (choose2 != grid[0].length);
        return maze;
    }
    public static GridPane sDisplay1(int grid[][]) {
        Image start = new Image("annoyed.png");
        Image end = new Image("cheese.jpg");
        Image wall = new Image("wall.png");
        Image mouse = new Image("jerry.jpg");
        Image blank = new Image("Blank.png");

        GridPane maze = new GridPane();

        int choose = 0;
        int choose2 = 0;
        do {
            for (int y = 0; y < grid.length; y++) {
                if (grid[choose][choose2] == 0) {
                    maze.add(new ImageView(wall), choose2, choose);
                    choose++;
                } else if (grid[choose][choose2] == 1) {
                    maze.add(new ImageView(blank), choose2, choose);
                    choose++;
                } else if (grid[choose][choose2] == 6) {
                    maze.add(new ImageView(end), choose2, choose);
                    choose++;
                } else if (grid[choose][choose2] == 7) {
                    maze.add(new ImageView(mouse), choose2, choose);
                    choose++;
                } else if (grid[choose][choose2] == 3) {
                    maze.add(new ImageView(start), choose2, choose);
                    choose++;
                }
            }
            choose = 0;
            choose2++;
        } while (choose2 != grid[0].length);
        return maze;
    }
}
