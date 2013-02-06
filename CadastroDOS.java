/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cosmo
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
    public static  void main (String [] gotoeoterror) {
        
String nome = null;
String end = null;
String tel = null;
double vlc = 0,d;
int op ;
int opp;
Scanner x;
x= new Scanner (System.in);
int zz=1;
int mn = 0;
do{
   
    System.out.println("\n");
System.out.println("-------------------------------------------------------------\n \tCadastro de Locadores - Denisglaydson Car\n-------------------------------------------------------------\n");

System.out.println("\n 1 - Cadastrar Cliente\n 2 - Exibir Cliente\n 3 - Atualizar Clientes\n 4 - Deletar Cliente\n 5 - Fechar Programa\n\n");
System.out.println(" Escolha uma das Opcoes: ");
    op = x.nextInt();
    
    switch(op){
        case 1 :  System.out.println("Cadastro de Cliente: \n");
                if(nome==null || end==null || tel==null || "".equals(nome) || "".equals(end) || "".equals(tel)){
        
                if(mn==0){
                System.out.println("Nome : ");
                x = new Scanner (System.in);
                nome = x.nextLine();
                mn=1;
            }
                System.out.print("\n");
                if(mn==1){
                System.out.println("Endereco : ");
                x = new Scanner (System.in);
                end= x.nextLine();
                mn=2;
                }
                System.out.print("\n");
                
                if(mn==2){
                System.out.println("Telefone : ");
                x = new Scanner (System.in);
                tel= x.nextLine();
                }
                mn=0;
                }
                else{
                    System.out.println("Já existe um cadastro !");
                }
                
                try {  
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
        System.out.println("Pressione uma tecla para continuar");  
         in.readLine();  
    } catch (IOException e) {  
    }
                    break;
            
        case 2 : int mp =0;
            System.out.println("Exibicao de Cliente Cadastrado:\n");
            if(mp==0){
                if(nome==null || "".equals(nome)){
                    System.out.println("\tNome :       Não Preenchido      ");
                mp=1;
                }
                else{
                System.out.println("\tNome :             "+nome);
                mp=1;
                }
            }if(mp==1){
                if(nome==null || "".equals(end)){
                    System.out.println("\tEndereço :       Não Preenchido      ");
                mp=2;
                }else{
                System.out.println("\tEndereco :         "+end);
                mp=2;}
            }if(mp==2){
                if(nome==null || "".equals(tel)){
                    System.out.println("\tTelefone :       Não Preenchido      ");
                mp=3;
                }else{
                System.out.println("\tTelefone :    "+tel);
                mp=3;}
            }if(mp==3){
                System.out.println("\n");
                try {  
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
        System.out.println("Pressione uma tecla para continuar");  
         in.readLine();  
    } catch (IOException e) {  
    }  
            }         
                break;
            
        case 3: System.out.println(" \t Alteracao de cliente cadastrado : \n\n");
System.out.println(" 1 - Alterar nome\n 2 - Alterar Endereço\n 3 - Alterar Telefone\n 4 - Sair do Módulo\n\n Escolha uma das opcoes: ");
            x = new Scanner(System.in);
            opp = x.nextInt();
int xa=1;            
            do{ switch(opp){

                case 1: System.out.println("Insira um novo nome :");
                        x = new Scanner(System.in);
                        nome = x.nextLine();
                        System.out.println("Nome Alterado ! ");
                        xa=2;
                    break ;
                    
                    case 2: System.out.println("Insira um novo Endereço :");
                        x = new Scanner(System.in);
                        end = x.nextLine();
                        System.out.println("Endereço Alterado ! ");
                        xa=2;
                    break ;
                        
                        case 3: System.out.println("Insira um novo telefone :");
                        x = new Scanner(System.in);
                        tel = x.nextLine();
                        System.out.println("Telefone Alterado ! ");
                        xa=2;
                    break ;
                            
                        case 4: System.out.println("Você saiu do módulo de atualização !");
                        xa=2;
                            break;
                            
                        default : System.out.println("Opção Invalida");
                            break;
                
            }}while(xa==1);
            break;
            
        case 4: 
                int org =1;
                do{
                System.out.println("Deseja apagar todos os dados ?");
                System.out.println("1 - Sim      |      2 - Não");
                int opp2;
                x= new Scanner(System.in);
                opp2 = x.nextInt();
                
                switch(opp2){
                    case 1 : System.out.println("Apagando todos os dados");
                        nome = null;
                        end = null;
                        tel = null;
                        if(nome == null && end == null && tel == null){
                        System.out.println("Dados apagados com sucesso");
                        org=2;
                        }
                        else{
                            System.out.println("Dados não foram apagados com sucesso ");
                            org=2;
                        }
                        
                    case 2: System.out.println("Volte quando precisar");
                            org=2;
                            break;
                        
                    default: System.out.println("Opção invalida !");
                }
                }while(org==1);
            break;
            
        case 5: System.out.println("Deseja sair do programa realmente ? \n 1 - Sim      |      2 - Não");
                x = new Scanner (System.in);
                int opp3 = x.nextInt();
                
            switch(opp3){
                
                case 1: System.out.println("Programa encerrado !");
                        zz=2;
                        break;
                    
                case 2: System.out.println("Programa não foi encerrado!");
                    break;
                    
                default : System.out.println("Opção invalida, retorno ao menu forçado !");
                    break;
            }
            break;
    }
}while(zz==1);

System.out.println("Não entrou");
        
    }
    
}
