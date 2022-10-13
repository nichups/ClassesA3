/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev;


public class Gestores extends Colaboradores{
	private int numeroDeEquipesDirigindo;

	public int getNumeroDeEquipesDirigindo() {
		return numeroDeEquipesDirigindo;
	}

	public void setNumeroDeEquipesDirigindo(int numeroDeEquipesDirigindo) {
		this.numeroDeEquipesDirigindo = numeroDeEquipesDirigindo;
	}

	 public void mostrarGestor() {
	        System.out.println("Numero de equipes que o gestor admnistra: " + this.numeroDeEquipesDirigindo);
	}
	
}