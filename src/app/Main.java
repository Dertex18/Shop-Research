package app;

public class Main {
    public static void main(String[] args) {

        DataProcessor processor = new DataProcessor(new DataProvider(), new DataHandler());

        getOutput(processor.getProcessedNames());
        getOutput(processor.getProcessedSales());
    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
