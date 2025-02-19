public class App {
    public static void main(String[] args)  {
        int [][] ilha = {
            {0, 1, 1, 1, 0},
            {0, 0, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 1, 1, 0},
            {0, 0, 0, 1, 0},
            
        };
        
        int perimetro = calculaPerimetro(ilha);
        int area = calcularArea(ilha);
        //Impressao da Ilha
        System.out.println("Ilha: ");

        for (int i = 0; i < ilha.length; i++) {
            for (int j = 0; j < ilha[0].length; j++) {
                System.out.print(ilha[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Perimetro da Ilha: "+ perimetro);
        System.out.println("Area da Ilha: "+ area);

    }

    public static int calculaPerimetro(int[][] ilha){
        int perimetro = 0;
        int linhas = ilha.length;
        int colunas = ilha[0].length;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j< colunas; j++){
                if(ilha[i][j] == 1){
                    if(i == 0 || ilha[i-1][j] == 0){
                        perimetro++;
                    }
                    if(i == linhas - 1|| ilha[i + 1][j] == 0){
                        perimetro++;
                    }
                    if(j == 0 || ilha[i][j - 1] == 0){
                        perimetro++;
                    }
                    if(j == colunas || ilha[i][j + 1] == 0){
                        perimetro++;
                    }
                }
            }
        }
        return perimetro;
    }

    public static int calcularArea(int[][] ilha){
        int area = 0;
        int linhas = ilha.length;
        int colunas = ilha[0].length;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j ++){
                if(ilha[i][j] == 1){
                    area ++;
                }
            }
        }
        return area;
    }
    
}
