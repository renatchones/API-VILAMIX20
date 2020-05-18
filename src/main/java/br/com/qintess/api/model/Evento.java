package br.com.qintess.api.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;




@Entity
@Table(name = "Evento")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name = "nome")
	private String nome;
	
	private String descricao;
	
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime data_inicio;

	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime data_fim;
	
	private Integer ingressos;
	
	private double preco;
	
	@ManyToOne
	@JoinColumn(name = "id_casaShow_fk")
	private CasaShow casaShow;
	
	

	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", data_inicio=" + data_inicio
				+ ", data_fim=" + data_fim + ", ingressos="+ingressos  + ", preco=" + preco + ", casashow=" + casaShow
				+ "]";
	}


	public CasaShow getCasaShow() {
		return casaShow;
	}


	public void setCasaShow(CasaShow casaShow) {
		this.casaShow = casaShow;
	}


	public Evento() {
		
	}
	
	



	public Evento(Long id, String nome, String descricao, LocalDateTime data_inicio, LocalDateTime data_fim, Integer ingressos,
			double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.ingressos = ingressos;
		this.preco = preco;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	









	public LocalDateTime getData_inicio() {
		return data_inicio;
	}


	public void setData_inicio(LocalDateTime data_inicio) {
		this.data_inicio = data_inicio;
	}


	public LocalDateTime getData_fim() {
		return data_fim;
	}


	public void setData_fim(LocalDateTime data_fim) {
		this.data_fim = data_fim;
	}


	public Integer getIngressos() {
		return ingressos;
	}


	public void setIngressos(Integer ingressos) {
		this.ingressos = ingressos;
	}


	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public CasaShow getCasashow() {
		return casaShow;
	}

	public void setCasashow(CasaShow casaShow) {
		this.casaShow = casaShow;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
