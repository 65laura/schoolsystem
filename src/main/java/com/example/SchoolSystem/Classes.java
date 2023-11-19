package com.example.SchoolSystem;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes",schema = "public")

public class Classes {
    @Id
    @Column(name = "classId")
    @NotNull private UUID classID;
    @Column(name = "className")
    private String className;
    @OneToOne(mappedBy = "classes")
    private StudentEntity studentEntity;


}
