/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev;

public class Tarefas {
	private String prazoDeEntrega;
	private String descricao;

	public String getPrazoDeEntrega() {
		return prazoDeEntrega;
	}

	public void setPrazoDeEntrega(String prazoDeEntrega) {
		this.prazoDeEntrega = prazoDeEntrega;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void mostrarTarefa() {
		System.out.println("Prazo da entrega da tarefa: " + this.prazoDeEntrega);
		System.out.println("Descrição da tarefa: " + this.descricao);
	}

}