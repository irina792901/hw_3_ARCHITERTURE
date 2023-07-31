package workers;

public class Main {
    public static void main(String[] args) {
        HumanWorker human = new HumanWorker();
        human.eat();
        human.work();
        Robot robot = new Robot();
        robot.work();
    }
}
