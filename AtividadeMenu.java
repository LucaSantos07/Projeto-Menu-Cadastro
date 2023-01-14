
package atividademenu;

import javax.swing.JOptionPane;


public class AtividadeMenu {
    
        public static void cadastro(String cad[][], int totalCadP[], int totalCad ) {
        
        
            int qtdadeCad = Integer.parseInt(JOptionPane.showInputDialog("Deseja realizar quantos cadastros? "));
        
            for(int i = 1; i <= qtdadeCad; i++){
            
            
              cad[i + totalCad -1] [0] = JOptionPane.showInputDialog("Digite o seu nome: ");
              cad[i + totalCad -1] [1] = JOptionPane.showInputDialog("Digite a sua idade: ");
              cad[i + totalCad -1] [2] = JOptionPane.showInputDialog("Digite a sua altura: ");
              cad[i + totalCad -1] [3] = JOptionPane.showInputDialog("Digite seu telefone: ");
              cad[i + totalCad -1] [4] = JOptionPane.showInputDialog("Digite o nome da sua cidade: ");
              cad[i + totalCad -1] [5] = JOptionPane.showInputDialog("Digite o seu endereço: ");
              JOptionPane.showMessageDialog(null, cad[i+totalCad-1][0] +
              ", o seu cadastro foi realizado com SUCESSO!!", "Cadastro",1);
            }
        
            totalCad = totalCad + qtdadeCad - 1;
            totalCadP [0] = totalCad;
        
        }
    
    
        public static void dados(String cad[][], int totalCad){
            
            for(int i = 1; i <= totalCad; i++){
          
                JOptionPane.showMessageDialog(null, cad[i][0] + "\n" + 
                    "Idade: " + cad[i][1] + "\n" +
                    "Altura: " + cad[i][2] + "\n" + 
                    "Tel: " + cad[i][3] + "\n" + 
                    "Cid: " + cad[i][4] + "\n" +
                    "End: " + cad[i][5] + "\n\n",
                     "Dados",1);
             
            }
        }
        
        public static void apagar(String cad[][], int totalCad){
         
            for(int i = 1; i <= totalCad; i++){
                
                cad[i][0] = "      ";
                cad[i][1] = "      ";
                cad[i][2] = "      ";
                cad[i][3] = "      ";
                cad[i][4] = "      ";
                cad[i][5] = "      ";
                
            }
            
            
        }

    
    public static void main(String[] args) {
        
       String cad [][] = new String [100][100];
           int totalCad = 1;
           int totalCadP [] = new int [1];
           String menu = (
                   "REALIZE O SEU CADASTRO \n" +
                   "1 - Cadastrar \n" + 
                   "2 - Mostar Dados \n" +
                   "3 - Excluir Dados \n" +
                   "4 - Sair \n");
    
            int opcao;
         
        do{
          
            
             opcao = Integer.parseInt( JOptionPane.showInputDialog(menu));
       
      
            switch (opcao){
                case 1:
                   
                    cadastro(cad, totalCadP, totalCad);
                   
                   break;
                   
                case 2:
                    
                    totalCad = totalCadP[0];
                    dados(cad, totalCad);
                    
                    break;
                    
                case 3:
                   
                    totalCad = totalCadP[0];
                    
                    String informe = ("Deseja EXCLUIR todos os cadastros? \n"
                            +"1 - Sim \n"
                            +"2 - Não \n");
                    
                    int escolha;
                    escolha = Integer.parseInt(JOptionPane.showInputDialog( informe));
                    
                    if (escolha == 1){
                        apagar(cad,totalCad);
                        totalCadP[0] = 1;
                    }
                    
                    else {
                     
                        JOptionPane.showMessageDialog(null, "Seus dados continuam salvos", "APAGAR", 2);
                    }
                    
                   
                    break;
                    
                case 4:
                    
                    JOptionPane.showMessageDialog(null, "Obrigado Pela Preferência!!!!!", "Finalizando Programa", 0 );
                    break;
                    
                default:
                    
                    JOptionPane.showMessageDialog(null, "Opção Invalida");
                    break;
               }  
            }
       
         while(opcao != 4);
    
    }

}
