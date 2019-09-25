package com.datasectech.books.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Author")
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String book;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "book_author",
            joinColumns = {@JoinColumn(name = "author_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )private Set<BookEntity> bookEntitySet;
//    @ManyToMany(mappedBy = "authorEn")
//    Set<BookEntity> bookEntitySet;

    protected AuthorEntity(){}

    public AuthorEntity(String name, String book){
        this.name = name;
        this.book = book;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Set<BookEntity> getBookEntitySet() {
        return bookEntitySet;
    }

    public void setBookEntitySet(Set<BookEntity> bookEntitySet) {
        this.bookEntitySet = bookEntitySet;
    }
}
