// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.tetris.moves;

import swen221.tetris.logic.Board;
import swen221.tetris.logic.Rectangle;
import swen221.tetris.tetromino.ActiveTetromino;
import swen221.tetris.tetromino.Tetromino;

/**
 * Implements a "hard drop". That is, when the tetromino is immediately dropped
 * all the way down as far as it can go.
 *
 * @author David J. Pearce
 * @author Marco Servetto
 *
 */
public class DropMove implements Move {
	@Override
	public boolean isValid(Board board) {
		// NOTE: to check whether move is valid or not, you can employ Move.apply() to
		// compute the new board and then check whether the active tetromino is in a
		// valid position.
		return true;
	}

	@Override
	public Board apply(Board board) {
		ActiveTetromino tet = board.getActiveTetromino();
		for(int i =0; i<board.getHeight();i++){
			tet = tet.translate(0,-1);

			if(!board.canPlaceTetromino(tet)){
				tet = tet.translate(0,1);
				board.placeTetromino(tet);
				board.setActiveTetromino(tet);
			}
		}
		return board;
	}

	@Override
	public String toString() {
		return "drop";
	}
}
