
package Entidad;

public class Revolver {
    
    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    public void llenarRevolver(){
        
         setPosicionActual((int)(Math.random() * 6) + 1);
         setPosicionAgua((int)(Math.random() * 6) + 1); 
    }
    
    public boolean mojar() {
        
        boolean var = false;
        
        if (getPosicionActual() == getPosicionAgua()) {
            
            System.out.println("se mojo");
            
            var = true;
        }
           System.out.println("no se mojo");
        return var;
    
}
    
    public void siguienteDisparo(){
        
        setPosicionActual(getPosicionActual()+1);

    }

}
