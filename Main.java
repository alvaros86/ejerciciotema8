package com.open_bootcampp;

    public class Main {
        public static void main(String[] args) {
            Persona persona = new Persona();
            persona.setEdad(30);
            persona.setNombre("Juan");
            persona.setTelefono("1234567890");

            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Teléfono: " + persona.getTelefono());
    }

    public static class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
}
