package com.firramo.firramoapi.model.evergreen;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "testimonials")
public class Testimonial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String imgUrl;
    private String testimony;
    private int rating;
}
