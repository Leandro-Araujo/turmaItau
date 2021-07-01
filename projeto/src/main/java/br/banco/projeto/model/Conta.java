package br.banco.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // esta classe será armazenada no BD
@Table(name = "conta") // nome da tabela no BD
public class Conta {

    @Id // indica que este campo é chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica eu este número é gerado pelo BD. 1, 2, 3, ....
    @Column(name = "numero")
    private long numero;
    
    @Column(name = "saldo")
    private double saldo;

    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
