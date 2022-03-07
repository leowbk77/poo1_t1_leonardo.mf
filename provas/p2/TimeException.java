public class TimeException extends IllegalArgumentException{
    private int time;
    
    public TimeException(String message, int time){
        super(message);
        this.time = time;
    }

    public void showMSG(){
        System.out.println("valor invalido (<= 3000): " + time);
    }
}
