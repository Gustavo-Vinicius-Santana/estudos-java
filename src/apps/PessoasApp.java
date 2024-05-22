package apps;
import dao.PessoasDao;
import models.Pessoa;

import java.util.Scanner;

public class PessoasApp {
    private Scanner scanner;
    private PessoasDao pessoasDao;

    public PessoasApp(){
        this.scanner = new Scanner(System.in);
        this.pessoasDao = new PessoasDao();
    }

    public void Start(){
        System.out.println("\nCADASTRO E LISTAGEM DE PESSOAS INICIADA!");

        System.out.print("\nDigite o nome: ");
        String nome = scanner.next();

        System.out.print("\nDigite a idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("\nDigite o sexo: ");
        String sexo = scanner.next();

        Pessoa novaPessoa = new Pessoa(nome, idade, sexo);
        pessoasDao.salvar(novaPessoa);

        System.out.print("\nDeseja cadastrar outra pessoa?\n1-SIM\n2-NÃO\nDigite a opção:");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                Start();
                break;
            case 2:
                System.out.print("cadastro de pessoas encerrado. Segue para listagem.");
                break;
        }

        System.out.print("\n-------------------------------------------------");
        System.out.println("\nPESSOAS CADASTRADAS");

        for (Pessoa pessoa : pessoasDao.listarPessoas()) {
            System.out.println("\nNome: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade() + ", Sexo: " + pessoa.getSexo());
        }
    }

}
