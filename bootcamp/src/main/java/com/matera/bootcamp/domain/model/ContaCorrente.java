package com.matera.bootcamp.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Data
@Entity
	public class ContaCorrente {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(nullable = false)
		private Long agencia;
		
		@Column(nullable = false)
		private Long conta;
		
		@Column(precision = 10, scale = 2, nullable = false)
		private BigDecimal saldo;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getAgencia() {
			return agencia;
		}

		public void setAgencia(Long agencia) {
			this.agencia = agencia;
		}

		public Long getConta() {
			return conta;
		}

		public void setConta(Long conta) {
			this.conta = conta;
		}

		public BigDecimal getSaldo() {
			return saldo;
		}

		public void setSaldo(BigDecimal saldo) {
			this.saldo = saldo;
		}

		
}

