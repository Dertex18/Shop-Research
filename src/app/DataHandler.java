package app;

public class DataHandler {

    public <T> String handleData(T[] items) {
        if (items == null || items.length == 0) {
            throw new IllegalArgumentException("Items cannot be null");
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for (T item : items) {
            count++;

            sb.append(String.format("(%d) %s ", count, item));
        }
        sb.deleteCharAt(items.length - 1);
        return sb.toString();
    }
}
