/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_12_03_2019;
import aula_12_03_2019.Modal.ContaCorrente;
/**
 *
 * @author antonio.ncgjunior
 */
public class OperaçoesDaConta {
       
    public void SaldoAtual(ContaCorrente Conta){
        float SaldoConta;
        SaldoConta = Conta.getSaldo();
        System.out.println("O Saldo atual é: " + SaldoConta);
    }
    
   public void Saque(float Valor,ContaCorrente Conta){
       float SaldoAtual = Conta.getSaldo();
       float SaldoFinal = SaldoAtual - Valor;
       Conta.setSaldo(SaldoFinal);
       System.out.println("O valor: " + Valor +" o Saldo inicial era : "+ SaldoAtual + "o Saldo Final: " + SaldoFinal);
   }
   public void depositar(){
       
   }

}
