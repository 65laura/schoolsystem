package com.example.SchoolSystem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")
public class Classes {
    @Id
    @Column
     private UUID classID;
    @Column
    private String className;
    @OneToOne(mappedBy = "classes")
    private StudentEntity studentEntity;


}
