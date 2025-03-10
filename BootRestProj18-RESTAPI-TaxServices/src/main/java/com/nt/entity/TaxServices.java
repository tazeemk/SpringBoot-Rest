package com.nt.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class TaxServices 
{
	  @GeneratedValue(strategy = GenerationType.AUTO)
      @Id
	  private Integer id;
	  @NonNull
	  private String participant_id;
	  @NonNull
	  private String name;
	  @NonNull
	  private Double amount;
	  @NonNull
	  private LocalDate date;
}
