public class Planetas {
        int cantidadSatelites = 0;
        double volumenKm3 = 0;
        String nombre = null;
        int distanciaMediaSol = 0;
        int diametroKm = 0;
        boolean observable = false;
        double masaPlaneta = 0;
enum tipoPlaneta {GASEOSOS, TERRRESTRE, ENANO};
        tipoPlaneta tipo;


        public Planetas(int cantidadSatelites, double volumenKm3, String nombre, int distanciaMediaSol, int diametroKm, boolean observableSimpleVista) {
                this.cantidadSatelites = cantidadSatelites;
                this.volumenKm3 = volumenKm3;
                this.nombre = nombre;
                this.distanciaMediaSol = distanciaMediaSol;
                this.diametroKm = diametroKm;
                this.observable = observable;
                this.masaPlaneta = masaPlaneta;
        }

        public void imprimirPantalla(){
                System.out.println("Nombre del planeta: " + nombre);
                System.out.println("Cantidad de satélites: " + cantidadSatelites);
                System.out.println("Volumen (km3): " + volumenKm3);
                System.out.println("Distancia media al sol (km): " + distanciaMediaSol);
                System.out.println("Diámetro (km): " + diametroKm);
                System.out.println("Es observable a simple vista? " + observable);
        }

        public double densidadPlaneta(){
                return masaPlaneta/volumenKm3;
        }

        public boolean planetaExterior(){
                double prom = 149597870;
                if(distanciaMediaSol > prom*2.1 && distanciaMediaSol < prom*3.4 ){
                        return true;
                }else{
                        return false;
                }
        }

}
