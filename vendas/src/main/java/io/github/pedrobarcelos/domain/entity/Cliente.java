package io.github.pedrobarcelos.domain.entity;

import javax.persistence.*;

@Entity
// @Table(name = "tb_cliente", schema = "vendas")
@Table(name = "cliente")
public class Cliente {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //autoincrement
    @Column(name = "id") //definicoes da coluna
    private Integer id;

    @Column(name = "nome", length = 100) //exemplo: tamanho do nome 100
    private String nome;


    public Cliente() {
    }


    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
