package LSP_Exercice;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        ElectronicDuck electronicDuck = new ElectronicDuck();
        electronicDuck.turnOn(); // Make sure the electronic duck is turned on

        quack(donaldDuck, electronicDuck);
        swim(donaldDuck, electronicDuck);
    }

    private void quack(Quackable... quackables) {
        for (Quackable quackable : quackables) {
            quackable.quack();
        }
    }

    private void swim(Swimmable... swimmables) {
        for (Swimmable swimmable : swimmables) {
            swimmable.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
