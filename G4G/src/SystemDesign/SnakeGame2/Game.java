package SystemDesign.SnakeGame2;

public class Game {
    static FoodInterface foodInterface;
    public static final int DIRECTION_NONE=0,DIRECTION_UP =1, DIRECTION_DOWN=-1, DIRECTION_RIGHT =1, DIRECTION_LEFT =-1;
    private Snake snake;
    private BoardInterface boardInterface;
    private int direction;
    private boolean gameOver;

    public Game(Snake snake, BoardInterface bi) {
        this.snake = snake;
        this.boardInterface=bi;
        //foodInterface=new FoodService();
    }

    public void update(){
        if(gameOver)
            return;
        if(direction==DIRECTION_NONE)
            return;
        
        Cell nextCell = getNextCell(snake.getHead());
        if(snake.checkCrash(nextCell))
        {
            gameOver=true;
            return;
        }
        snake.move(nextCell);
        if(nextCell.getCellType()==CellType.Food){
            snake.grow();
            boardInterface.generateFood();
        }
    }

    private Cell getNextCell(Cell head) {
        int row = head.getRow();
        int col = head.getCol();
        if (direction == DIRECTION_RIGHT) {
            col++;
        }
        else if (direction == DIRECTION_LEFT) {
            col--;
        }
        else if (direction == DIRECTION_UP) {
            row--;
        }
        else if (direction == DIRECTION_DOWN) {
            row++;
        }
        if(row>=boardInterface.getBoard().length || col>=boardInterface.getBoard()[0].length) {
            random();
            return getNextCell(head);
        }
        Cell nextCell = boardInterface.getBoard()[row][col];
        return nextCell;
    }


    public static void main(String [] args){
        Snake snake = new Snake(new Cell(0,0));
        BoardInterface bi = new Board(20,20);
        Game game = new Game(snake,bi);
        game.gameOver=false;
        game.direction=DIRECTION_RIGHT;

        for(int i=0;i<20;i++){
            if(i%2==0)
                game.boardInterface.generateFood();
            game.update();
            game.direction = game.random();
            if(game.gameOver)
                break;
        }
    }

    private int random() {
        int r = (int ) (Math.random() * 4);
        if(r==0)
            return DIRECTION_DOWN;
        else if(r==1)
            return DIRECTION_LEFT;
        else if(r==2)
            return DIRECTION_RIGHT;
        else
            return DIRECTION_UP;
    }
}
