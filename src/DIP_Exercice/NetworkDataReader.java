package DIP_Exercice;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;

public class NetworkDataReader implements IdataReader {
    private String _url;

    public NetworkDataReader(String url) {
        _url = url;
    }

    @Override
    public String read() throws IOException {
        URL url = new URL(_url);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder content = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            content.append((char) c);
        }
        reader.close();
        return content.toString();
    }
}

