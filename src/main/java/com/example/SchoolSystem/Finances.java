package com.example.SchoolSystem;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@Table(name="finances")

public class Finances {
    @Id
    @Column
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UUID financeId;
    @Column
    private float feesPaid;
    @Column
    private float funding;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_student_id")
    private StudentEntity studentEntity;
}
