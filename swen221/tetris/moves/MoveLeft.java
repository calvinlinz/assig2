package swen221.tetris.moves;

import swen221.tetris.logic.Board;
import swen221.tetris.tetromino.ActiveTetromino;

/**
 * Move the active tetromino one square to the left.
 *
 * @author David J. Pearce
 *
 */
public class MoveLeft extends AbstractTranslation {
	/**
	 * Construct a new move left translation.
	 */
	public MoveLeft() {
		super(-1,0);
	}

	@Override
	public boolean isValid(Board board) {
		if (board.getActiveTetromino() == null) {
			return false;
		}

		if(board.getActiveTetromino().getBoundingBox().getMinX()<1){
			return false;
		}
		return true;
	}

}
