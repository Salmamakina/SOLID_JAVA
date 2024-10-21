package DIP_Exercice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter implements IdataWriter {
    private String _filePath;

    public FileDataWriter(String filePath) {
        _filePath = filePath;
    }

    @Override
    public void write(String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(_filePath));
        writer.write(data);
        writer.close();
    }
}

