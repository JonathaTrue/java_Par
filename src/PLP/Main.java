package PLP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcao;

        do{
            menu();
            opcao = scan.nextInt();
            
            switch(opcao){
            case 1:
            	Questao1();
                break;
                
            case 2:
            	Questao2();
                break;
                
            case 3:
            	Questao3();
                break;
               
            case 4:
            	Questao4();
                break;
            
            case 5:
            	Questao5();
            	break;
            	
            default:
                System.out.println("OpÁ„o inv·lida.");
            }
            
        } while(opcao != 0);
        
        
    }
    
    public static void menu() {
    	System.out.println("Atividade de PARADIGMAS");
    	System.out.println(" 1 - QUEST√O 01");
    	System.out.println(" 2 - QUEST√O 02");
    	System.out.println(" 3 - QUEST√O 03");
    	System.out.println(" 4 - QUEST√O 04");
    	System.out.println(" 5 - QUEST√O 05");
    	System.out.println(" 0 - PARA SAIR");
    	System.out.println("");	
    }
    
    public static void Questao1() {
    	System.out.println("Quest„o 1!");
    	Scanner scan = new Scanner(System.in);
    	
        q1 p1 = new q1();
        q1 p2 = new q1();
        System.out.println("Informe primeiro nome e idade: ");
		p1.setNome(scan.next());
        p1.setIdade(scan.nextInt());
        System.out.println("Informe segundo nome e idade: ");
        p2.setNome(scan.next());
        p2.setIdade(scan.nextInt());

        if (p1.getIdade() > p2.getIdade()){System.out.println("Pessoa mais velha: "+p1.getNome());}
            else {System.out.println("Pessoa mais velha: "+p2.getNome());}
    }
    
    public static void Questao2() {
    	System.out.println("Quest„o 2!");
    	Scanner scan = new Scanner(System.in);
    	
    	q2 p1 = new q2();
        q2 p2 = new q2();
        System.out.println("Informe nome e salario");
        p1.setNome(scan.next());
        p1.setSalario(scan.nextFloat());
        System.out.println("Informe nome e salario");
        p2.setNome(scan.next());
        p2.setSalario(scan.nextFloat());

        float med = (p1.getSalario() + p2.getSalario()) / 2;
        System.out.println("Sal√°rio medio: "+med);

    }
    
    public static void Questao3() {
    	System.out.println("Quest„o 3!");
    	Scanner scan = new Scanner(System.in);
    	
    	retangulo retangulo = new retangulo();
    	
        System.out.println("Informe valor de largura: ");
        double b = scan.nextDouble();
        System.out.println("Informe valor de altura: ");
        double d = scan.nextDouble();
        
        double area = b * d;
        double perimetro = 2 * (b + d);
        double diagonal = Math.sqrt((b * b) + (d * d ));

        System.out.println("Area: " + area);
        System.out.println("Perimetro: "+ perimetro);
        System.out.println("Diagonal: "+ diagonal);
    }
    
    public static void Questao4() {
    	System.out.println("Quest„o 4!");
    	Scanner scan = new Scanner(System.in);
    	
    	 funcionario funcionario = new funcionario() ;
    		
         System.out.println("Informe nome, salario e imposto respectivamente: ");
         funcionario.setNome(scan.next());
         funcionario.setSalarioBruto(scan.nextDouble());
         funcionario.setImposto(scan.nextDouble());

         funcionario.setSalarioLiq(funcionario.getSalarioBruto()- funcionario.getImposto());
         System.out.println(funcionario.getNome()+", "+funcionario.getSalarioLiq());

         System.out.println("Informe porcentagem de aumento: ");
         funcionario.setPorc(scan.nextDouble());
         funcionario.setPorc(funcionario.getPorc()/100);

         funcionario.setAumentarSal(funcionario.getSalarioLiq()+(funcionario.getPorc())* funcionario.getSalarioBruto());
         System.out.println("Dados atualizados: "+funcionario.getNome()+", R$"+funcionario.getAumentarSal());
    	
    }
    
    public static void Questao5() {
    	System.out.println("Quest„o 5!");
    	Scanner scan = new Scanner(System.in);
    	
    	aluno aluno = new aluno();
        aluno.setNotaMin(60.00);

        System.out.println("Informe nome do aluno: ");
        aluno.setNomeAluno(scan.next());
        System.out.println("Informe as 3 notas obtidas: ");
        aluno.setNota1(scan.nextInt());
        aluno.setNota2(scan.nextInt());
        aluno.setNota3(scan.nextInt());

        aluno.setNotaFim(aluno.getNota1()+ aluno.getNota2()+ aluno.getNota3());

        System.out.println(aluno.getNotaFim());

        if (aluno.getNotaFim() < aluno.getNotaMin()){
            aluno.setNotaRest(aluno.getNotaMin()- aluno.getNotaFim());
            System.out.println("Reprovado!\n"+"Faltaram "+aluno.getNotaRest()+" pontos.");
        }else{
            System.out.println("Aprovado!");
    }

    }
}
