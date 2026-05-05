package com.arsan.expense.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

@Entity
@NoArgsConstructor
@Data
@Builder
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
		
	@JsonIgnore
	@JoinColumn()
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;	
}
