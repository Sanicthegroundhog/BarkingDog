public class Bark {
    public static void main(String[] args) {
        ShouldWakeUp(2);
    }

    public static boolean ShouldWakeUp(int hourOfDay){

        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }

        if(hourOfDay < 8 || hourOfDay > 22){
            return true;
        }else{
            return false;
        }
    }



}
