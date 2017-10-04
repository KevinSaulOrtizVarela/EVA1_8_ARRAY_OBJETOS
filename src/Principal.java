/**
 * @author 16550549
 */
public class Principal {

    public static void main(String[] args) {
        Alumno[] aaDatosAlumno; //  EL IDENTIFICADOR ES NULO
        aaDatosAlumno = new Alumno[10]; // CREAMOS EL ARREGLO DE 10
        //alumnos- AQUI HABRÀ PREGUNTA
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaDatosAlumno[i] = new Alumno("Kevin", "16550549", 0);

        }
        for (Alumno aaDatosAlumno1 : aaDatosAlumno) {
            System.out.println("Nombre: " + aaDatosAlumno1.getsNom());
            System.out.println("Matricula: " + aaDatosAlumno1.getsMatri());
            System.out.println("Carrera: " + aaDatosAlumno1.getiCar());
        }
       // Alumno[] aaCopiaDatos = new Alumno[aaDatosAlumno.length];
        
        /*for (int i = 0; i < aaDatosAlumno.length; i++) {

            aaCopiaDatos[i].setsNom(aaDatosAlumno[i].getsNom());
            
            aaCopiaDatos[i].setsMatri(aaDatosAlumno[i].getsMatri());
            
            aaCopiaDatos[i].setiCar(aaDatosAlumno[i].getiCar());

        }
        */
        // COPIA DEL ARREGLO DEL ALUMNO
        Alumno aaCopia[] = new Alumno[10];
        for (int i = 0; i < aaDatosAlumno.length; i++) {
            aaCopia[i] = new Alumno(aaDatosAlumno[i].getsNom(),aaDatosAlumno[i].getsMatri(),aaDatosAlumno[i].getiCar());
            
        }
        //IMPRIMIR COPIA
        for (Alumno aaCopia1 : aaCopia) {
            System.out.println("Nombre: " + aaCopia1.getsNom());
            System.out.println("Matricula: " + aaCopia1.getsMatri());
            System.out.println("Carrera: " + aaCopia1.getiCar());
        }
        

    }

}

class Alumno {

    private String sNom;
    private String sMatri;
    private int iCar;

    public Alumno(String sNombre, String sMatricula, int iCarrera) {
        sNom = sNombre;
        sMatri = sMatricula;
        iCar = iCarrera;

    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getsMatri() {
        return sMatri;
    }

    public void setsMatri(String sMatri) {
        this.sMatri = sMatri;
    }

    public int getiCar() {
        return iCar;
    }

    public void setiCar(int iCar) {
        this.iCar = iCar;
    }

}
