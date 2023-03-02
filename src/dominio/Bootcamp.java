package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();


    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return Set<Conteudo> return the conteudos
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    /**
     * @param conteudos the conteudos to set
     */
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    /**
     * @return Set<Dev> return the decsInscirtos
     */
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
     * @param decsInscirtos the decsInscirtos to set
     */
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    @Override
    public String toString() {
        return "Bootcamp [nome=" + nome + ", descricao=" + descricao + ", dataInicial=" + dataInicial + ", dataFinal="
                + dataFinal + ", conteudos=" + conteudos + ", devsInscritos=" + devsInscritos + "]";
    }

}