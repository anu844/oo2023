public class Player {
    int xCoordinaate; //täisarvuline number
    int yCoordinaate; // costimine ehk teisendamine ühest tüübist teise <- sulgudes int
    char symbol;

    Direction direction; // 3nda tunni teema
    //Ese: xCoordinaate, yCoordinaate, tugevusest, kasutuskordadest, nimest

    Item item; // klassikomplekt      Player klassi sees on Item klass

    // constructor (peab olema public)
    public Player(int worldWidth, int worldHeight){
        this.xCoordinaate = getRandomCoordinaate(worldWidth);
        this.yCoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = 'X';
        this.direction = Direction.UP;
}
    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }

    //public tähendab, et moni teine klass saab ka seda funktsiooni valja kutsuda
    //private tähendab seda, et seda sunktsiooni saaba inult selles klassis kasutada

    public void move(String input, World world){
        if(input.equals("w")){
            this.direction = Direction.UP;
        }else if(input.equals("s")){
            this.direction = Direction.DOWN;
        }else if(input.equals("a")){
            this.direction = Direction.LEFT;
        }else if(input.equals("d")){
            this.direction = Direction.RIGHT;
        }
        if(direction.equals(Direction.UP) && this.yCoordinaate > 1){
            this.yCoordinaate = this.yCoordinaate - 1;
        }else if(direction.equals(Direction.DOWN) && this.yCoordinaate < world.height-2){
            this.yCoordinaate = this.yCoordinaate + 1;
        }else if(direction.equals(Direction.LEFT) && this.xCoordinaate > 1){
            this.xCoordinaate = this.xCoordinaate - 1;
        }else if(direction.equals(Direction.RIGHT) && this.xCoordinaate < world.width-2){
            this.xCoordinaate = this.xCoordinaate + 1;
        }
    }
}
