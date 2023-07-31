package workers;

class HumanWorker extends Human implements Working {
    public void work() {
        System.out.println("Человек работает");
    }
}
