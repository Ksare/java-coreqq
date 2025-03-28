package lr10;

import java.io.FileWriter;

public class ex3 {

    public static void main(String[] args) {
        org.json.simple.JSONObject library = new org.json.simple.JSONObject();
        org.json.simple.JSONArray books = new org.json.simple.JSONArray();

        org.json.simple.JSONObject book1 = new org.json.simple.JSONObject();
        book1.put("title", "Война и мир");
        book1.put("author", "Лев Толстой");
        book1.put("year", 1869);

        org.json.simple.JSONObject book2 = new org.json.simple.JSONObject();
        book2.put("title", "Мастер и Маргарита");
        book2.put("author", "Михаил Булгаков");
        book2.put("year", 1967);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("src/lr10/example2.json")) {
            file.write(library.toJSONString());
            System.out.println("JSON файл успешно создан");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

