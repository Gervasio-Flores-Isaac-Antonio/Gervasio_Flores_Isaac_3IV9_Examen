

public class Pokemon {

    int id;
    String nombre;
    int fuerza; 
    int defensa_vida;
    String ataque_principal;
    String ataque_secundario;

    
    public Pokemon(int id, String nombre, int fuerza, int defensa_vida, String ataque_principal, String ataque_secundario) {
        this.id = id;
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.defensa_vida = defensa_vida;
        this.ataque_principal = ataque_principal;
        this.ataque_secundario = ataque_secundario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa_vida() {
        return defensa_vida;
    }

    public void setDefensa_vida(int defensa_vida) {
        this.defensa_vida = defensa_vida;
    }

    public String getAtaque_principal() {
        return ataque_principal;
    }

    public void setAtaque_principal(String ataque_principal) {
        this.ataque_principal = ataque_principal;
    }

    public String getAtaque_secundario() {
        return ataque_secundario;
    }

    public void setAtaque_secundario(String ataque_secundario) {
        this.ataque_secundario = ataque_secundario;
    }

    
    
    
    
    
    
    
     
            
      
    
}
