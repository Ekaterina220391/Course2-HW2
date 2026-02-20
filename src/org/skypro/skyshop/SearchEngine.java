package org.skypro.skyshop;

public class SearchEngine {
    private final Searchable[] elements;

    public SearchEngine(int capacity) {
        this.elements = new Searchable[capacity];
    }

    public void add(Searchable item) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                elements[i] = item;
                return;
            }
        }
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int foundCount = 0;

        for (Searchable element : elements) {
            if (element != null &&
                    element.getSearchTerm().toLowerCase().contains(query.toLowerCase()) &&
                    foundCount < 5) {
                results[foundCount] = element;
                foundCount++;
            }

            if (foundCount == 5) {
                break;  // Прерываем после 5 результатов
            }
        }

        return results;
    }
}
