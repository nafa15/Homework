package mentoring110220.enumPractice;

enum Lights{
    Green, Yellow, Red, Blue,
}

public class classEnum {
    public static void main(String[] args) {

        Lights whatToDo = Lights.Green;

        switch (whatToDo){
            case Green:
                System.out.println("Pass");
                break;
            case Yellow:
                System.out.println("Be prepared to stop");
                break;
            case Red:
                System.out.println("Stop");
                break;
            default:
                System.out.println("Error");
        }
    }



}
