package SystemDesign.SnakeGame2;

public interface BoardInterface {

    void generateFood();
    public Cell[][] getBoard();
    public void setBoard(Cell[][] board);
}
