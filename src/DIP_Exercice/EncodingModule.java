package DIP_Exercice;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private IdataReader _dataReader;
    private IdataWriter _dataWriter;

    public EncodingModule(IdataReader dataReader, IdataWriter dataWriter) {
        _dataReader = dataReader;
        _dataWriter = dataWriter;
    }

    public void encode() throws IOException {
        String data = _dataReader.read();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        _dataWriter.write(encodedData);
    }
}

