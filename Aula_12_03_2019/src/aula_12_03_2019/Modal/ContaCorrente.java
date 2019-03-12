/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_12_03_2019.Modal;

import java.util.Date;

/**
 *
 * @author antonio.ncgjunior
 */
public class ContaCorrente {
    
    
    private String Titular;
    private int nConta;
    private Date DataDeAbertura;
    private float Saldo;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public Date getDataDeAbertura() {
        return DataDeAbertura;
    }

    public void setDataDeAbertura(Date DataDeAbertura) {
        this.DataDeAbertura = DataDeAbertura;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
    
    
    
}
