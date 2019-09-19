import java.util.Scanner;

public class WikiRacer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkSet a = new LinkSet("https://en.wikipedia.org/wiki/Edwin_Pope_Thayer");
        System.out.println(a.getLinkSet());
    }

    public void findWikiLadder() {
        
    }
}
