package pt.isec;

import java.time.LocalDate;
import java.time.Period;

public class Docente
{
    private String nome;
    private String email;
    private LocalDate dataDeNascimento;
    private ListaDisciplinas disciplinas;

    public Docente(String nome, String email, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.disciplinas = new ListaDisciplinas();
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

    public ListaDisciplinas getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(String disciplina)
    {
        this.disciplinas.addDisciplina(disciplina);
    }

    public int getIdade()
    {
        LocalDate today = LocalDate.now();
        Period p = Period.between(dataDeNascimento, today);
        return p.getYears();
    }

    public String getDisciplina(int indice)
    {
        return disciplinas.getDisciplina(indice);
    }

    public boolean lecionaDisciplina(String disc)
    {
        for (int z = 0; z < disciplinas.getTotalDisciplinas(); z++)
        {
            if (disc.equals(getDisciplina(z)))
                return true;
        }

        return false;
    }

    // -------------------------------------------------------------------

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;

        if (!(obj instanceof Docente))
            return false;

        Docente other = (Docente)obj;

        return email.equals(other.email);
    }

    @Override
    public String toString()
    {
        return "Docente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
