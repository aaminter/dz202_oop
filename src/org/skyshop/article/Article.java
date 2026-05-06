package org.skypro.skyshop.article;
import org.skypro.skyshop.search.Searchable;
import java.util.Objects;
public class Article implements Searchable {
    private final String name;
    private final String text;
    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }
    @Override
    public String getName() {
        return name;
    }
    public String getText() {
        return text;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(name, article.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}