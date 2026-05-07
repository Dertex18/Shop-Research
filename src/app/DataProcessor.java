package app;


public class DataProcessor {
    private final DataProvider provider;
    private final DataHandler handler;

    public DataProcessor(DataProvider provider, DataHandler handler) {
        this.provider = provider;
        this.handler = handler;
    }

    public String getProcessedNames() {
        return "Products: " + handler.handleData(provider.getProductNames());
    }

    public String getProcessedSales() {
        return "Sales, EUR: " + handler.handleData(provider.getSalesAmounts());
    }
}