
public class Cerdo extends Animal implements Vacuna
{

    private static final int PESO_CERDO = 15;    
    private static final int INCREMENTO_VIDA_VACUNA_CERDO = 20;    
    private static final int INCREMENTO_PESO_CERDO = 2;   
    private static final int DISMINUCION_VIDA_CERDO = 10;

    public Cerdo()
    {
        super(PESO_CERDO);
    }

    public void comer()
    {
        peso = peso + INCREMENTO_PESO_CERDO;
        vida = vida - DISMINUCION_VIDA_CERDO;
    }
    
    public void emitirSonidoCaracteristico()
    {
        System.out.println("cerdo,cerdo");
    }
    
    public void vacunar()
    {
        vida = vida + INCREMENTO_VIDA_VACUNA_CERDO;
    }
    
}
