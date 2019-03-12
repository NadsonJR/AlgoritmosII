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
       
    public float SaldoAtual(){
        ContaCorrente Conta = new ContaCorrente();
        
        float SaldoConta;
        SaldoConta = Conta.getSaldo();
        
        return SaldoConta;
    }
   

}
