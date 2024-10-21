public class Ejecutar {
    public static void main(String[] args) {

        persona objP1 = new persona ("pipe", 1.80,80.0,22);
        

        objP1.caminar();

        String respuesta =objP1.IMC();
        System.out.println(respuesta);
        System.out.println(objP1.mayorEdad(20));

    }
}
