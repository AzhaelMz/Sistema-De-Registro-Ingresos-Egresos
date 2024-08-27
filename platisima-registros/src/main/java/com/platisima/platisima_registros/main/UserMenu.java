package com.platisima.platisima_registros.main;

public class UserMenu {
    public void welcomeMessages(String process){
        System.out.println("""
                =================================================================
                ---------------> Bienvenido(a) a platísima registro <--------""");
    }
    public void menu(){
        System.out.println("""
                ============================================================
                <<<<<<Por favor selecciona que deseas hacer hoy ;) >>>>>>
                |1. Consultar registros     |2. Realizar un nuevo registro
                |3. Registrar un egreso     |4. Consultar balances
                ============================================================""");
    }
}
