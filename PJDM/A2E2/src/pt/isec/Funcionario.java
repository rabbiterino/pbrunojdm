package pt.isec;

import java.time.LocalDate;
import java.time.Period;

public class Funcionario
{
    private String nome;
    private String email;
    private LocalDate dataDeNascimento;

    public Funcionario(String nome, String email, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade()
    {
        LocalDate today = LocalDate.now();
        Period p = Period.between(dataDeNascimento, today);
        return p.getYears();
    }
}
