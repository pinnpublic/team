package com.test.java.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tblTeam")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {
	
	@Id
	@SequenceGenerator(name = "seqTeam", allocationSize = 1, sequenceName = "seqTeam")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTeam")
	private Long seq;
	
	private String name;
	private String description;

}




