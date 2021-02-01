package andybot;

import cs15.prj.andyBotSupport.AndyBot;
import cs15.prj.andyBotSupport.MazeSolverSupport;

public class MazeSolver extends MazeSolverSupport{

    public MazeSolver(AndyBot andyBot) {
        // This is the constructor.
        // **Please do not alter this part of the code**
        super();
        this.solve(andyBot);
    }

    /**
     * The method can manipulate an andybot instance to solve the maze.
     */
    public void solve(AndyBot andyBot){

        //andy navigates through the maze until he reaches the roadblock
        andyBot.moveUp(1);
        andyBot.shuffleLeft(2);
        andyBot.moveUp(2);
        andyBot.shuffleLeft(1);
        andyBot.moveUp(1);
        andyBot.shuffleLeft(1);
        andyBot.moveUp(2);
        andyBot.shuffleRight(3);
        andyBot.moveUp(2);
        andyBot.shuffleRight(2);

        //andy solves the roadblock
        this.solveRoadBlock(this.getHint());

        //andy moves out of the maze
        andyBot.moveUp(2);

    }

    /**
     * Solves a roadblock using the passed in integer.
     */
    public void solveRoadBlock(int x){

        this.enterPassword(4*x-6);
    }
}
