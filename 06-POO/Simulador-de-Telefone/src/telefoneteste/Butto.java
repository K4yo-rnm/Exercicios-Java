package telefoneteste;

public class Butto {
        int volume;
        boolean ligado;
        boolean tocando;
        
        public Butto(){//metodo construtor
            setVolume(50);
            setLigado(false);
            setTocando (false);
            
        }
        
        private void setVolume(int v){
            volume = v;
        }
        
        private int getVolume(){
            return this.volume;
        }
        
        private void setLigado(boolean l){
            ligado = l;
        }
        
        private boolean getLigado(){
            return this.ligado;
    }
        
        private void setTocando(boolean t){
            tocando = t;
        }
        
        private boolean getTocando(){
            return this.tocando;
        }
        
        //METODOS 
        public void Ligar(){
        if (ligado == false){
            ligado = true;
        }
    
        }
        
       public void Desligar(){
            if (ligado == true){
                ligado = false;
                
            }
            else
                if (getTocando() == true){
                    tocando = false;
                }
        }
        
        public void menosVolume(int n){
            if((ligado == true) && (volume >= 0)){                
            setVolume(getVolume() - n);
          
          }
        else            
             if((ligado == true) && (volume <= 0)){
                 System.out.println("Volume MINIMO");
                 setVolume(0);
          }
        }
        
        public void maisVolume(int n){
            if ((ligado == true) && (volume <= 100)){//((ligado == true) && (volume != 100)){
            setVolume(getVolume() + n);
            }
            else
                   if ((ligado == true) && (volume >= 100)) {//((ligado == true) && (volume >= 100)){
                        System.out.println("\nVolume MAXIMO");
                        setVolume(100);
                    }
        }
        
        public void ligarMudo(){
            if ((getTocando() == false) && (ligado == true) && (volume != 0)){
                tocando = true;
                setVolume(getVolume() - getVolume());
            }                       
        }
        
        public void deligarMudo(){
            if ((getTocando() == true) && (ligado == true)){
                tocando = false;
                setVolume(50);
                
            }
                
        }
        
        public void Status(){
            System.out.println("Volume: " + this.getVolume());
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
        }
}
