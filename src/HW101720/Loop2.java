package HW101720;

public class Loop2 {

    public static void main(String[] args) {

        String[] positions = {"Defenser", "Midfielder", "Forwarder", "Coach"};


        for (int b = 0; b < 4; b++) {
            for (int i = 0; i < positions.length; i++) {
                System.out.println(positions[i]);
            }
        }
    }
}