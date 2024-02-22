package day13_self_practice.State;

public class StateClient {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("VA","Republican", "Glenn Youngkin", "Tim Kaine", 8535519);
        California california = new California("CA","Democratic", "Gavin Newsom", "Alex Padilla", 39538223);
        Texas texas = new Texas("TX","Republican", "Greg Abbott", "John Cornyn", 29145505);
        Florida florida = new Florida( "FL","Republican", "Ron DeSantis", "Marco Rubio", 21538187);


        System.out.println(virginia + "\t");

        System.out.println(california + "\t");

        System.out.println(texas + "\t");

        System.out.println(florida + "\t");
    }

}

