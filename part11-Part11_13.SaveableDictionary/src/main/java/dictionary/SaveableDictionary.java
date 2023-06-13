package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        String translation = null;
        
        if (this.dictionary.containsKey(word)) {
            translation = this.dictionary.get(word);
        }

        if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    translation = key;
                }
            }
        }
        return translation;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word, this.dictionary.get(word));
        }

        String keyRemove = "";
        if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    keyRemove = key;
                }
            }

        }
        this.dictionary.remove(keyRemove, word);
    }

    public boolean load() {
        try ( Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                this.add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println("File not found " + e.getMessage());
            return false;
        }

        return true;
    }

    public boolean save() {
        try ( PrintWriter writer = new PrintWriter(this.file)) {
            for (String key : this.dictionary.keySet()) {
                writer.println(key + ":" + this.dictionary.get(key));
            }
        } catch (Exception e) {
            System.out.println("Cannot save to the file.");
            return false;
        }
        return true;
    }
}
