package app;

public class DataHandler {

    public <T> String handleData(T[] items) {
        if (items == null || items.length == 0) {
            return "empty";
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (T item : items) {
            count++;
            sb.append(String.format("(%d) %s ", count, item));
        }
        return sb.toString();
    }
}
