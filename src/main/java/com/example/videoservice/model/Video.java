package com.example.videoservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import com.example.videoservice.model.Creator;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Video {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String url;
    private String description;
    private Date datePublication;
    @ManyToOne
    private Creator creator;
}
