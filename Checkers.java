import java.util.Scanner;
/**
 * Jogo de damas para dois jogadores.
 * 
 * @author felipe.gattelli@edu.pucrs.br
 * @version (um número da versão ou uma data)
 */
public class Checkers{
  public static String [][] init(){
      String recheio="X";
      String [] []b=new String [8][8];
      for(int i = 0; i<b.length;i++){
          if(i==3)
              recheio=".";
          else if(i==5)
              recheio="O";
          for (int j =0;j<b[i].length;j++){
              if(i%2 == 0 && j%2!=0 || i%2!=0 && j%2==0)             
                  b[i][j]=recheio;
              else
                  b[i][j]=" ";
          }
        }
      return b;
  }
  public static String display(String [] [] b){
      String r= "  01234567\n";
      for (int i = 0; i < b.length; i++) {
          r += i + "|";
          for (int j = 0; j < b[i].length; j++) {
              r += b[i][j];
          }
          r += "|\n";
        }
      return r;
  }
  public static void set(String[][]b, int i, int j,int k,int l,String p){
      if (!b[i][j].equals(p)){//é uma peça do jogador?
          return;//nao é uma peça tua ou é vazio!
      }
      if (!b[k][l].equals(".")){//é uma celula vazia?
          return;//nao é um vazio!
          
      }
      //TODO verificar se a nova posição é adjacente
      b[i][j]=".";
      b[k][l]=p;
  }
  public static void main(String[] args){
      String board [][];
      board=init();
      System.out.println(display(board));
      set(board, 5 ,0 , 3 , 0,"O");
      System.out.println(display(board));
      
      
  }
}
