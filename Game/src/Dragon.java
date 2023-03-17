public class Dragon {

    int xCoordinaate; //täisarvuline number
    int yCoordinaate; // costimine ehk teisendamine ühest tüübist teise <- sulgudes int
    char symbol;


    // constructor (peab olema public)
    public Dragon(int worldWidth, int worldHeight){
        this.xCoordinaate = getRandomCoordinaate(worldWidth);
        this.yCoordinaate = getRandomCoordinaate(worldHeight);
        this.symbol = 'D';
    }
    private static int getRandomCoordinaate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
