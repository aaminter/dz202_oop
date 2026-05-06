package org.skypro.skyshop.search;

import org.skypro.skyshop.comparator.SearchableComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SearchEngine {
    private final Set<Searchable> items = new HashSet<>();
    public void add(Searchable item) {
        items.add(item);
    }
    public Set<Searchable> search(String query) {
        Set<Searchable> result = new TreeSet<>(new SearchableComparator());
        for (Searchable item : items) {
            if (item.getName().toLowerCase().contains(query.toLowerCase())) {
                result.add(item);
            }
        }
        return result;
    }
}