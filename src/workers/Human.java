package workers;

class Human implements Eating {

    @Override
    public void eat() {
        System.out.println("Человек ест");
    }
}
