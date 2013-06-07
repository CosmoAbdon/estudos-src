import java.math.*;
import JogodaForca.Keyboard;

public class Forca {
    public static void main(String args[]) {
        boolean jogar = true;
        do {
 try {
 System.out.println("* JOGO DA FORCA *");
String array[] = {
 "HUEHUEBRBR", "SISTEMAS", "INFORMAÇAO", "FUTEBOL", "LICEU", "BREJA", "DELL", "ALGORITMOS", "PROGRAMAÇAO",
 "TECNICAS", "ADMINISTRAÇÃO", "ORGANIZAÇÃO", "METODOS", "CALCULO", "COMPUTADOR", "GATINHAS", "DORMIR", "PROGRAMAR",
 "PNEUMOLTRAMICROSCOPICOSILICOVULCANOCONIOTICO"
                };
// String palavra = array[(int)(Math.random()*array.length)];
String palavra = array[(int)(Math.random()*array.length)];
int tamPal = palavra.length();
System.out.println("\nINSTRUÇÕES: Você deve digitar uma letra de cada vez. Se a palavra contiver a letra que você ");
System.out.println("digitou, os respectivos caracteres serão mostrados. Você tem direito a 6 erros.");
System.out.println("Dica: a palavra contém "+tamPal+" letras. Boa sorte!");
System.out.println("Obs.: digite todas as letras em MAIÚSCULO.");
 boolean jogo = true;
                do {
  char letras[] = new char[tamPal];
 for (int x = 0; x < tamPal; x++) {
    letras[x] = palavra.charAt(x);
    System.out.print(" _ ");
  }
 boolean tentativa = true;
 int erro = 0;
char letraCerta[] = new char[tamPal];
while (tentativa) {
 if (erro < 6) {
System.out.println("\n\nDigite uma letra.");

         int erroLet = 0;
      //char letra = Keyboard.readChar();
         char letra = Keyboard.readChar();
  
        String novaPalavra = "";
       for (int x = 0; x < tamPal; x++) {
                                
                                if (letra == letras[x]) {
                                    letraCerta[x] = letra;
                                } else {
                                    erroLet++;
                                }
                                
                                if (letraCerta[x] == letras[x]) {
                                    novaPalavra += letraCerta[x];
                                    System.out.print(" "+letraCerta[x]+" ");
                                } else {
                                    System.out.print(" _ ");
                                }
                            }
                            if (erroLet >= tamPal) {
                                erro++;
                            }
                            
                            if (palavra.equals(novaPalavra)) {
                                System.out.println("\n\nPARABÉNS! VOCÊ CONSEGUIU ACERTAR A PALAVRA '"+palavra+"'.");
                                tentativa = false;
                            } else {
                                if (erro == 0) {
                                    System.out.println("\n+----------+");
                                    System.out.println("|          |");
                                    System.out.println("|         ---");
                                    System.out.println("|");
                                    System.out.println("|");
                                    System.out.println("|");
                                    System.out.println("+");
                                } else if (erro == 1) {
                                    System.out.println("\n+----------+");
                                    System.out.println("|          |");
                                    System.out.println("|         ---");
                                    System.out.println("|          Ô");
                                    System.out.println("|");
                                    System.out.println("|");
                                    System.out.println("+");
                                } else if (erro == 2) {
                                    System.out.println("\n+----------+");
                                    System.out.println("|          |");
                                    System.out.println("|         ---");
                                    System.out.println("|          Ô");
                                    System.out.println("|          |");
                                    System.out.println("|");
                                    System.out.println("+");
                                } else if (erro == 3) {
                                    System.out.println("\n+----------+");
                                    System.out.println("|          |");
                                    System.out.println("|         ---");
                                    System.out.println("|          Ô");
                                    System.out.println("|         /|");
                                    System.out.println("|");
                                    System.out.println("+");
                                } else if (erro == 4) {
                                    System.out.println("\n+----------+");
                                    System.out.println("|          |");
                                    System.out.println("|         ---");
                                    System.out.println("|          Ô");
                                    System.out.println("|         /|\\");
                                    System.out.println("|");
                                    System.out.println("+");
                                } else if (erro == 5) {
                                    System.out.println("\n+----------+");
                                    System.out.println("|          |");
                                    System.out.println("|         ---");
                                    System.out.println("|          Ô");
                                    System.out.println("|         /|\\");
                                    System.out.println("|         /");
                                    System.out.println("+");
                                } else if (erro == 6) {
                                    System.out.println("\n+----------+");
                                    System.out.println("|          |");
                                    System.out.println("|         ---");
                                    System.out.println("|          Ô");
                                    System.out.println("|         /|\\");
                                    System.out.println("|         / \\");
                                    System.out.println("+");
                                }
                                System.out.println("Erros possíveis: "+(6-erro));
                            }
                        } else {
                            System.out.println("\n\n+----------------------------------------+");
                            System.out.println("|                                        |");
                            System.out.println("|    Y O U  L O O S E ,  B I T C H  !    |");
                            System.out.println("|                                        |");
                            System.out.println("     A PALAVRA CORRETA ERA '"+palavra+"'");
                            System.out.println("|                                        |");
                            System.out.println("+----------------------------------------+");
                            tentativa = false;
                        }
                    }
                    jogo = false;
                } while (jogo);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("\nErro no programa. Possivelmente, você digitou algum comando inválido.");
            }
            

            System.out.println("\nVocê quer jogar novamente ('S' para jogar e 'N' para não jogar)?");
            char jogarNovamente = Keyboard.readChar();
            if (jogarNovamente == 'S' || jogarNovamente == 's') {
                jogar = true;
            } else {
                jogar = false;
                System.out.println("\n   FIM DE JOGO   \n");
            }
        } while (jogar);
    }
}
