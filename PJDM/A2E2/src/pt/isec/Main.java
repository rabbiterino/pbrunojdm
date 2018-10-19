package pt.isec;

import java.time.LocalDate;
import java.time.Month;

public class Main
{
    public static void main(String[] args)
    {
	    Estudante ZeMiguel = new Estudante("Zé Miguel", "ze@isec.pt", 21231212, LocalDate.of(1990, Month.OCTOBER, 10));

        ZeMiguel.addDisciplina("Programação 1");
        ZeMiguel.addDisciplina("Programação 2");
        ZeMiguel.addDisciplina("Gestão");

        System.out.println("ESTUDANTE\n");
        System.out.println("Nome: " + ZeMiguel.getNome() + "\n");
        System.out.println("Número: " + ZeMiguel.getNumero() + "\n");
        System.out.println("Idade: " + ZeMiguel.getIdade() + "\n");
        System.out.println("Disciplinas:\n");

        for (int i = 0; i < ZeMiguel.getDisciplinas().getTotalDisciplinas(); i++)
            System.out.println("\t- " + ZeMiguel.getDisciplinas().getDisciplina(i) + "\n");

        Docente PedroMiguel = new Docente("Pedro Miguel", "pedro@isec.pt", LocalDate.of(1980, Month.NOVEMBER, 8));

        PedroMiguel.addDisciplina("Programação 1");
        PedroMiguel.addDisciplina("Gestão");
        PedroMiguel.addDisciplina("Gestão 2");

        System.out.println("\n\nPROFESSOR\n");
        System.out.println("Nome: " + PedroMiguel.getNome() + "\n");
        System.out.println("E-mail: " + PedroMiguel.getEmail() + "\n");
        System.out.println("Idade: " + PedroMiguel.getIdade() + "\n");
        System.out.println("Disciplinas:\n");

        for (int i = 0; i < PedroMiguel.getDisciplinas().getTotalDisciplinas(); i++)
            System.out.println("\t- " + PedroMiguel.getDisciplinas().getDisciplina(i) + "\n");

        System.out.println("\n");

        ListaDisciplinas disciplinas = ZeMiguel.getDisciplinasDadasPor(PedroMiguel);

        System.out.println("Disciplinas do '" + ZeMiguel.getNome() + "' dadas pelo professor '" + PedroMiguel.getNome() + "':\n");

        for (int i = 0; i < disciplinas.getTotalDisciplinas(); i++)
            System.out.println("\t- " + disciplinas.getDisciplina(i) + "\n");

        // --------------------------------------------------------------

        Docente PedroMiguel2 = new Docente("Pedro Miguel 2", "pedro2@isec.pt", LocalDate.of(1980, Month.NOVEMBER, 8));
        Docente PedroMiguel3 = new Docente("Pedro Miguel 3", "pedro@isec.pt", LocalDate.of(1980, Month.NOVEMBER, 8));

        System.out.println(PedroMiguel.equals(PedroMiguel2));
        System.out.println(PedroMiguel.equals(PedroMiguel3));

        System.out.println(PedroMiguel);
    }
}
