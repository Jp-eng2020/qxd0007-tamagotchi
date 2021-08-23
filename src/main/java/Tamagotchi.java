public class Tamagotchi {
    //max
    private int energiaMax ;
    private int saciedadeMax;
    private int limpezaMax;
    private int idadeMax;

    //atual
    private int energiaAtual ;
    private int saciedadeAtual;
    private int limpezaAtual;
    private int idadeAtual = 0;

    private int diamantes = 0;
    

    public Tamagotchi(int energiaMax, int saciedadeMax, int limpezaMax, int idadeMax){
        // Maximo
        this.energiaMax = energiaMax;
        this.saciedadeMax =saciedadeMax;
        this.limpezaMax =limpezaMax;
        this.idadeMax =idadeMax;
      
        // Atual
        this.energiaAtual = energiaMax;
        this.saciedadeAtual = saciedadeMax; 
        this.limpezaAtual = limpezaMax;
       
   
    }

    public int getEnergiaMax() {
        return energiaMax;
    }

    public int getSaciedadeMax() {
        return saciedadeMax;
    }

    public int getLimpezaMax() {
        return limpezaMax;
    }

    public int getIdadeMax() {
        return idadeMax;
    }

    
    public int getEnergiaAtual() {
        return energiaAtual;
    }

    public int getSaciedadeAtual() {
        return saciedadeAtual;
    }

    public int getLimpezaAtual() {
        return limpezaAtual;
    }

    public int getIdadeAtual() {
        return idadeAtual;
    }
    
    public int getDiamantes() {
        return diamantes;
    }

    public boolean getEstaVivo(){
       if (energiaAtual<=0) {
           energiaAtual = 0;
           return false;
       }else if (saciedadeAtual<=0){
           saciedadeAtual = 0;
           return false;
       }else if(idadeMax<=idadeAtual) {
           return false;
       }else if (limpezaAtual<=0) {
           limpezaAtual = 0;
           return false;
       }
       return true;
        
    }

    //  MECHER AQUI
    public boolean brincar(){
        if (getEstaVivo()){
            
                
            energiaAtual -= 2;  
            saciedadeAtual -= 1;
            limpezaAtual -= 3;
            idadeAtual += 1;
            diamantes  += 1;
            return true;
            
        }

           return false;

    }

    public boolean comer(){
        if (getEstaVivo()){
            
        energiaAtual -= 1;
        saciedadeAtual += 4;
        limpezaAtual -= 2;
        idadeAtual += 1;
        return true;
            
        }

       return false;
       
    }

    public boolean dormir(){
        if (getEstaVivo()&& energiaMax-energiaAtual >= 5){
            
                
                energiaAtual = energiaMax;
                idadeAtual +=1;
                saciedadeAtual -= 2;
                return true;
    
            

        }
      return false;
    }

    public boolean banhar(){
        if (getEstaVivo()){
            energiaAtual -= 3; 
            saciedadeAtual -= 1;
            limpezaAtual = limpezaMax;
            idadeAtual += 1;
            diamantes += 0;
            return true;
        }

       return false;
        
       

    }

}
