package org.skypro.skyshop.search;
import org.skypro.skyshop.comparator.SearchableComparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
public class SearchEngine {
    private final Set<Searchable> items = new HashSet<>();
    public void add(Searchable item) {
        items.add(item);
    }
    public Set<Searchable> search(String query) {
        return items.stream()
                .filter(item -> item.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toCollection(() -> new TreeSet<>(new SearchableComparator())));
    }
}