package ISP_Exercice;

import java.util.Random;

public class Sensor {
    public void register(ProxDoor door) {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}

