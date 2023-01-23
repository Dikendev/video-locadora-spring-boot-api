package com.projetoDevs2blu.videolocadora.Dtos;

import jakarta.validation.constraints.NotBlank;

public class MovieDto {
    @NotBlank
    private String filmeNome;
    @NotBlank
    private String generoFilme;
    @NotBlank
    private String dataAluguel;
    @NotBlank
    private Integer devolucaoData;
    @NotBlank
    private String user;
    @NotBlank
    private String email;
    @NotBlank
    private Integer telefone;
    @NotBlank
    private String endereco;

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

    public String getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(String dataAluguel) {
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
