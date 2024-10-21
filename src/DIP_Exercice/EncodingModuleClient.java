package DIP_Exercice;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        // Pour encodage avec fichier
        IdataReader fileReader = new FileDataReader("src/DIP_Exercice/beforeEncryption.txt");
        IdataWriter fileWriter = new FileDataWriter("src/DIP_Exercice/afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter);
        fileEncodingModule.encode();

        // Pour encodage avec réseau et base de données
        IdataReader networkReader = new NetworkDataReader("http://myfirstappwith.appspot.com/index.html");
        IdataWriter databaseWriter = new DatabaseDataWriter();
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, databaseWriter);
        networkEncodingModule.encode();
    }
}

