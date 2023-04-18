package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        if (!Objects.equals(nome, bootcamp.nome)) return false;
        if (!Objects.equals(descricao, bootcamp.descricao)) return false;
        if (!Objects.equals(dataInicial, bootcamp.dataInicial))
            return false;
        if (!Objects.equals(dataFinal, bootcamp.dataFinal)) return false;
        if (!Objects.equals(devsInscritos, bootcamp.devsInscritos))
            return false;
        return Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (dataInicial != null ? dataInicial.hashCode() : 0);
        result = 31 * result + (dataFinal != null ? dataFinal.hashCode() : 0);
        result = 31 * result + (devsInscritos != null ? devsInscritos.hashCode() : 0);
        result = 31 * result + (conteudos != null ? conteudos.hashCode() : 0);
        return result;
    }
}
