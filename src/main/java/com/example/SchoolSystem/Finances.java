package com.example.SchoolSystem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="finaces",schema = "public")

public class Finances {
    @Id
    @Column
   @NotNull private UUID financeId;
    @Column
    private float feesPaid;
    @Column
    private float funding;
}
