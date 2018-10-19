package pt.isec;

public class ListaDisciplinas
{
    private final int MAX = 50;

    private String[] disciplinas;
    private int contadorDisciplinas;

    public ListaDisciplinas()
    {
        this.disciplinas = new String[MAX];
        this.contadorDisciplinas = 0;
    }

    public void addDisciplina(String disciplina)
    {
        if (this.contadorDisciplinas == MAX)
            return;

        this.disciplinas[this.contadorDisciplinas] = disciplina;
        this.contadorDisciplinas++;
    }

    public String getDisciplina(int indice)
    {
        if (indice < 0 || indice >= this.contadorDisciplinas)
            return null;

        return this.disciplinas[indice];
    }

    public int getTotalDisciplinas()
    {
        return this.contadorDisciplinas;
    }
}
