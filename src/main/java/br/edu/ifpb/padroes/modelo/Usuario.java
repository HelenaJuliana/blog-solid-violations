package br.edu.ifpb.padroes.modelo;

import java.util.List;


public class Usuario {
 
   private Long id;
 
   private String nome;
 
   private String login;
 
   private String senha;
 
   private List<Postagem> postagens;
 
 
public void Postagem ( String postagem){
     this.postagem = postagem;
  
   }
 
    public void LoginUse ( String senha, String nome){
               this.senha = senha;
               this.nome = nome;
  
   }
 
   public List<Postagem> getPostagens() {
       return postagens;
   }
 
  
 
   public void setPostagens(List<Postagem> postagens) {
       this.postagens = postagens;
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
 
   public String getLogin() {
       return login;
   }
 
   public void setLogin(String login) {
       this.login = login;
   }
 
   public String getSenha() {
       return senha;
   }
 
   public void setSenha(String senha) {
       this.senha = senha;
   }
 
   public PostagemListar getPostagemListar() {
       return postagemListar;
   }
     public Login getLogin() {
       return login;
   }
 
}
