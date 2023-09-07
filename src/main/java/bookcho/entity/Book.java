package bookcho.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @NotBlank(message = "ISBN must not be blank")
    @Pattern(regexp = "^(?:ISBN(?:-10)?:?\\s*)?(?=[0-9X]{10}$|(?=(?:[0-9]+[-\\s]){3})"
            + "[-\\s0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[-\\s]){4})[-\\s0-9]{17}$)"
            + "(?:97[89][-\\s]?)?[0-9]+[-\\s]?[0-9]+[-\\s]?[0-9X]$", message = "Invalid ISBN format")
    @Column(name = "isbn")
    private String isbn;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "isbn"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> authors;

    @Column(name ="genre")
    private Arrays genre;

    /*
    TODO: Add after the program is connected
    private String publicationDate;
    private String publisher;
    private String pageCount;
    private String language;
    private String price;
    private String description;
    private String coverImage;
     */


}
