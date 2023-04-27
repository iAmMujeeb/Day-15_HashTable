package wordfreq;

public class HashTableMain {
    public static void main(String[] args) {
        String paraGraph = "To be or not to be";
        HashTable<String, Integer> hashTable = new HashTable(6);
        String[] wordsArray = paraGraph.split(" ");
        for (String word : wordsArray) {
            int index = hashTable.getIndex(word);
            System.out.println(word + " -> " + word.hashCode() + " -> " + index);
            Integer currentFrequency = hashTable.get(word);
            if (currentFrequency == null)
                currentFrequency = 1;
            else
                currentFrequency++;
            hashTable.addOrUpdate(word, currentFrequency);
        }
        System.out.println(hashTable);
    }
}