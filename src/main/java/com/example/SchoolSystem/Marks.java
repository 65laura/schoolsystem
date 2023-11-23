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
@Table(name = "marks",schema = "public")

public class Marks {
    @Id
    @Column
   @NotNull private UUID marksId;
    @Column
    private float marksObtained;
    @Column
    private char ranking;
}
