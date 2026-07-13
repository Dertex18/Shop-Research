package app;

public class Main {
    public static void main(String[] args) {

        DataProcessor processor = new DataProcessor(new DataProvider(), new DataHandler());

        try {
            getOutput(processor.getProcessedNames());
            getOutput(processor.getProcessedSales());
        } catch (IllegalArgumentException e){
            System.out.println("Failed to process data" + e.getMessage());
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
