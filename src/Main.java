public class Main {
    public static void main(String[] args) {

        Planetas planetas = new Planetas(98,15,"Jupiter", 13,45, false, 13, Planetas.tipoPlaneta.GASEOSOS);

        planetas.imprimirPantalla();
        System.out.println("La densidad del planeta es: " + planetas.densidadPlaneta());

        System.out.println("¿El planeta es exterior?" + planetas.planetaExterior());
            }
    }