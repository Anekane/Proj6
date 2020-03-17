public class Tutor {
    private int idTutor;
    private Persona datos;
    public Tutor() { }
    public Tutor(int id, Persona p){
        this.idTutor = id;
        this.datos = p;
    }
    public void setIdTutor(int idTutor) {
         this.idTutor = idTutor;
    }
    public int getIdTutor() {
         return idTutor;
    }
    public void setDatos(Persona datos) {
         this.datos = datos;
    }
    public Persona getDatos() {
         return datos;
    }
}