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
        //TODO: Call move methods on the robot so that it knows
        // which steps to take.

        //TODO: Nest a call to getHint within a call to solveRoadBlock
        // so that the hint is passed to solveRoadBlock.

        //TODO: After passing the road block, move up 2 more spaces to
        // complete the maze!

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

        this.solveRoadBlock(this.getHint());

        andyBot.moveUp(2);

    }

    /**
     * Solves a roadblock using the passed in integer.
     */
    public void solveRoadBlock(int x){
        //TODO: call enterPassword and pass it 4 times x, minus 6

        this.enterPassword(4*x-6);
    }
}
