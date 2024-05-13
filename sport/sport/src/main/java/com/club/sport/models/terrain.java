package com.club.sport.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table
public class terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column
    private String nomterrain;
    @Column
    private String catterrain;
    

}
