package Fonte;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CriacaoDoCliente {
    private String cpf,nome,endereco,bairro,cidade,cep,telefone,email,NumeroProcesso;
    
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getCpf(){
        return cpf;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }

    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getBairro() {
        return bairro;
    }

    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCidade() {
        return cidade;
    }
    
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCep() {
        return cep;
    }
    
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }
    
    
    public void setEmail(String email) {
        this.email = email;
    } 
    public String getEmail() {
        return email;
    }
   
    
    public void setNumeroProcesso(String NumeroProcesso) {
        this.NumeroProcesso = NumeroProcesso;
    }
    public String getNumeroProcesso() {
        return NumeroProcesso;
    }
    
    public void EscritaDosDados() throws IOException{
        FileWriter arquivo = new FileWriter("C:\\Users\\coont\\Desktop\\Teste do programa\\Cliente.txt");
        PrintWriter escreverArquivo = new PrintWriter(arquivo);
        
        escreverArquivo.printf(this.cpf);
        escreverArquivo.printf("\n");
        escreverArquivo.printf(nome);
        escreverArquivo.printf("\n");
        escreverArquivo.printf(endereco);
        escreverArquivo.printf("\n");
        escreverArquivo.printf(bairro);
        escreverArquivo.printf("\n");
        escreverArquivo.printf(cidade);
        escreverArquivo.printf("\n");
        escreverArquivo.printf(cep);
        escreverArquivo.printf("\n");
        escreverArquivo.printf(telefone);
        escreverArquivo.printf("\n");
        escreverArquivo.printf(email);
        escreverArquivo.printf("\n");
        escreverArquivo.printf(NumeroProcesso);
        escreverArquivo.printf("\n");
        System.out.println(this.cpf);
        System.out.println(this.nome);
        System.out.println(this.endereco);
        System.out.println(this.bairro);
        System.out.println(this.cidade);
        System.out.println(cep);
        System.out.println(telefone);       
        
    }
}