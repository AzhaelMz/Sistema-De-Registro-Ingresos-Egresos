package com.platisima.platisima_registros.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.platisima.platisima_registros.exceptions.InvalidOptionsException;
import com.platisima.platisima_registros.models.DatosGanancia;

import java.util.Scanner;

public class Main {
    private Scanner input = new Scanner(System.in);

    public void mainApp(){
        try{
            UserMenu menu = new UserMenu();
            int selectedOption = input.nextInt();
            input.nextLine();
            switch (selectedOption){
                case 1:
                    registroGanancia();
                    break;
                case 2:
                    registroGasto();
                    break;
                case 3:
                    consultarGanancias();
                    break;
                case 4:
                    consultarGastos();
                    break;
                case 5:
                    mostrarBalanceActual();
                    break;
                case 0:
                    System.out.println("Gracias por tu visita :)");
                    break;
                default:
                    throw new InvalidOptionsException("¡Oops! Opción invalida, por favor escoge una opcion mostrada");
            }


        } catch (InvalidOptionsException e) {
            input.nextLine();
            System.out.println("Inténtalo de nuevo");
        } catch (InvalidOptionsException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio algo inesperado ");
        }
    }

    public void registroGanancia(){
        System.out.println("Por favor ingresa la fecha en el que ingresas o recibiste la ganancia (DD-MM-YYYY");
        String fecha = input.nextLine();

        System.out.println("A continuación por favor ingresa la cantidad de la ganancia: ");
        int cantidad = input.nextInt();
        input.nextLine();

        DatosGanancia datosGanancia = new DatosGanancia(fecha , cantidad);
        var json =
    }

    public void convertidorJson(DatosGanancia datosGanancia){
        ObjectMapper objectMapper = new ObjectMapper():
        try {
            return objectMapper.write
        }
    }
}
