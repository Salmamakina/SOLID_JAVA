package DIP_Exercice;

import java.util.HashMap;
import java.util.Map;

public class DatabaseDataWriter implements IdataWriter {
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    @Override
    public void write(String data) {
        _data.put(++_count, data);
    }
}

