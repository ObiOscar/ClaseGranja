public class Pollo extends Animal implements Vacuna
{

    private static final int PESO_POLLO = 1;   
    private static final int INCREMENTO_VIDA_VACUNA_POLLOS = 10;   
    private static final int INCREMENTO_PESO_POLLOS = 1;  
    private static final int DISMINUCION_VIDA_POLLO = 10;
    
    public Pollo()
    {
        super(PESO_POLLO);
    }

    public void comer()
    {
        peso = peso + INCREMENTO_PESO_POLLOS;
        vida = vida - DISMINUCION_VIDA_POLLO;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("Pio, pio");
    }
    
    public void vacunar()
    {
        vida = vida + INCREMENTO_VIDA_VACUNA_POLLOS;
    }
    
}
