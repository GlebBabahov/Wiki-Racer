import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkSet {
    private String HTML;

    public LinkSet(String inURL) {
        HTML = new HTMLFetcher(inURL).getHTML();
    }

    public HashSet<String> getLinkSet() {
        HashSet<String> urls = new HashSet<>();

        Pattern pattern = Pattern.compile("<a href=\"/wiki/(.*?)\"");
        Matcher matcher = pattern.matcher(HTML);

        while (matcher.find()) {
            urls.add("https://en.wikipedia.org/wiki/" + matcher.group(1));
        }

        return urls;
    }
}
