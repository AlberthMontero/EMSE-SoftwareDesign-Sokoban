package emse.softwaredesign.sokoban.model;

import java.util.List;

/**
 * @author Marek Lewandowski <marek.lewandowski@icompass.pl>
 * @since 29/03/14
 */
public class Game {

    private Position playerPosition;

    private List<List<Block>> blocks;

    public void move (MoveType moveType) {

    }
//
//    private Block getBlockAt (Position position) {
//        return null;
//    }


    public boolean isGameFinished () {
        return false;
    }

    public void initialize () {
        // TODO parse level (TO BE DONE), init player position and blocks
    }
}