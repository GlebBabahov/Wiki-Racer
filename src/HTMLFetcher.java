import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HTMLFetcher {
    private URL url;
    private BufferedReader bufferedReader;
    private StringBuilder stringBuilder;
    private String line;


    public HTMLFetcher(String inUrl) {
        try {
            url = new URL(inUrl);
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            stringBuilder = new StringBuilder();
        }
        catch (MalformedURLException mue){
            mue.printStackTrace();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public String getHTML() {
        try {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return stringBuilder.toString();
    }
}