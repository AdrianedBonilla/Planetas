public class Main {
    public static void main(String[] args) {

        Planetas planetas = new Planetas(98,150000,"Jupiter", 13,45, false);

        planetas.imprimirPantalla();
        System.out.println("La densidad del planeta es: " + planetas.densidadPlaneta());

        planetas.planetaExterior();
        System.out.println("¿El planeta es exterior?");
            }
    }