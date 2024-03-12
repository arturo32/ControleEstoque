package br.ufrn.imd.controleestoque.model;

import br.ufrn.imd.controleestoque.model.enums.TipoMovimentacao;
import jakarta.persistence.Entity;

import java.util.Date;


@Entity
public class Movimentacao {
	private Date data;
	private TipoMovimentacao tipoMovimentacao;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoMovimentacao getTipoMovimentacao() {
		return tipoMovimentacao;
	}

	public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
}
