package hw103120.enumPractice;

public class Positions {

    private final SoccerPlayers soccerPlayers;

    public Positions(SoccerPlayers soccerPlayers) {
        this.soccerPlayers = soccerPlayers;
    }

    public void whereToPosition() {

        switch (soccerPlayers) {
            case Cech:
                System.out.println("Goal keeper");
                break;
            case JohnTerry:
                System.out.println("Defender");
                break;
            case Lampard:
                System.out.println("Midfielder");
                break;
            case Drogba:
                System.out.println("Forwarder");
                break;
            default:
                System.out.println("Substitute");
        }
    }
}
