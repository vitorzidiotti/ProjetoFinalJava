/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.projetofinal;

/**
 *
 * @author vitor
 */
public class Contato {

    public String nome;

    public String telefone;

    public String email;

    public String endereço;

    public String cidade;

    public String estado;

    //Metodos
    public String getMensagemErro() {
        String mensagem = "";

        if (nome == null || nome.isEmpty()) {
            mensagem = "O nome é obrigatorio";
        } else if (telefone == null || telefone.isEmpty()) {
            mensagem = "O Telefone é obrigatorio";
        } else if (email == null || email.isEmpty()) {
            mensagem = "O Email é obrigatorio";

        } else if (endereço == null || endereço.isEmpty()){
            mensagem = "O Endereço é obrigatorio";
        }
        else if(cidade == null || cidade.isEmpty()){
            mensagem = "O Cidade é obrigatorio";
        }
            else if(estado == null || estado.isEmpty()){
            mensagem = "O Estado é obrigatorio";
        }

        return mensagem;
    }
}
