package hw102020.encapsulation;

public class Team {

    public static void main(String[] args) {

        // First player
        Players p1 = new Players();
        p1.setPlayerName("Drogba");
        p1.setPlayerPosition("Forwarder");
        p1.setPlayerNumber(11);

        // Second player
        Players p2 = new Players();
        p2.setPlayerName("Lampard");
        p2.setPlayerPosition("Midfielder");
        p2.setPlayerNumber(8);

        System.out.println(p1.getPlayerName());
        System.out.println(p1.getPlayerPosition());
        System.out.println(p1.getPlayerNumber());

        System.out.println(p2.getPlayerName());
        System.out.println(p2.getPlayerPosition());
        System.out.println(p2.getPlayerNumber());

    }
}
