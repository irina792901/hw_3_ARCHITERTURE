package printText;

public class Main {
    public static void main(String[] args) {
        Text text = new Text("Я убила на эту задачу 3 дня и не уверена в правильности!");
        TextPrinter consolePrinter = new ConsoleTextPrinter();
        Printer printer = new Printer(consolePrinter);
        printer.print(text);
    }
}
