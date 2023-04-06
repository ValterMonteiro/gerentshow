package br.edu.ifms.gerentshow.model.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "TB_SHOW")

public class Show {
	
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private UUID id;
		
		@Column(nullable = false, length = 80)
		private String nome;
		
		@Column(nullable = false, length = 11)
		private String local;

		public UUID getId() {
			return id;
		}

		public void setId(UUID id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getLocal() {
			return local;
		}

		public void setLocal(String local) {
			this.local = local;
		}
		
		
}
