package com.learnkafka.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table
public class Book {

    @Id
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private final static String  joinColumnValue="libraryEventId";

    @OneToOne
    @JoinColumn(name = joinColumnValue)
    private LibraryEvent libraryEvent;
}
