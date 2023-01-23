package com.projetoDevs2blu.videolocadora.models;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="TB_Filmes")
public class LocadoraModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 70)
    private String filmeNome;
    @Column(nullable = false, length = 70)
    private String generoFilme;
    @Column(nullable = false)
    private LocalDateTime dataAluguel;
    @Column(nullable = false, length = 30)
    private Integer devolucaoData;
    @Column(nullable = false, length = 130)
    private String user;
    @Column(nullable = false, length = 130)
    private String email;
    @Column(nullable = false, length = 30)
    private Integer telefone;
    @Column(nullable = false, length = 130)
    private String endereco;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFilmeNome() {
        return filmeNome;
    }

    public void setFilmeNome(String filmeNome) {
        this.filmeNome = filmeNome;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public LocalDateTime getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDateTime dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public Integer getDevolucaoData() {
        return devolucaoData;
    }

    public void setDevolucaoData(Integer devolucaoData) {
        this.devolucaoData = devolucaoData;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
