package pt.isec;

import java.time.LocalDate;
import java.time.Period;




public class Estudante
{
    private String nome;
    private String email;
    private int numero;
    private LocalDate dataDeNascimento;
    private ListaDisciplinas disciplinas;

    public Estudante(String nome, String email, int numero, LocalDate dataDeNascimento)
    {
        this.nome = nome;
        this.email = email;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public ListaDisciplinas getDisciplinasDadasPor(Docente prof)
    {
        ListaDisciplinas tempDisciplinas = new ListaDisciplinas();

        for (int i = 0; i < disciplinas.getTotalDisciplinas(); i++)
        {
            String disciplina = disciplinas.getDisciplina(i);

            if (prof.lecionaDisciplina(disciplina))
                tempDisciplinas.addDisciplina(disciplina);
        }

        return tempDisciplinas;
    }
}
