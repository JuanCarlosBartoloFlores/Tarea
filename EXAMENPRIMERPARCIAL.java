Clase Empleado 
package EXAMEN;

    abstract class Empleado {
        private String RFC;
        private String apellidos;
        private String nombres;

        public Empleado(String RFC, String apellidos, String nombres) {
            this.RFC = RFC;
            this.apellidos = apellidos;
            this.nombres = nombres;
        }

        public abstract double calcularIngresos();

        public abstract double calcularBonificacion();

        public abstract double calcularDescuento();

        public double calcularSueldoNeto() {
            double ingresos = calcularIngresos();
            double bonificacion = calcularBonificacion();
            double descuento = calcularDescuento();
            return ingresos + bonificacion - descuento;
        }

        public void mostrarInformacion() {
            System.out.println("RFC: " + RFC);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Nombres: " + nombres);
        }
    }


Clase EmpleadoVendedor 
package EXAMEN;

    class EmpleadoVendedor extends Empleado {
        private double montoVendido;
        private double tasaComision;

        public EmpleadoVendedor(String RFC, String apellidos, String nombres, double montoVendido, double tasaComision) {
            super(RFC, apellidos, nombres);
            this.montoVendido = montoVendido;
            this.tasaComision = tasaComision;
        }

        @Override
        public double calcularIngresos() {
            return montoVendido * tasaComision;
        }

        @Override
        public double calcularBonificacion() {
            if (montoVendido < 1000) {
                return 0;
            } else if (montoVendido >= 1000 && montoVendido <= 5000) {
                return calcularIngresos() * 0.05;
            } else {
                return calcularIngresos() * 0.10;
            }
        }

        @Override
        public double calcularDescuento() {
            if (calcularIngresos() < 1000) {
                return calcularIngresos() * 0.11;
            } else {
                return calcularIngresos() * 0.15;
            }
        }
    }

Clase EmpleadoPermanente 
package EXAMEN;

    class EmpleadoPermanente extends Empleado {
        private double sueldoBase;
        private String numeroSeguroSocial;

        public EmpleadoPermanente(String RFC, String apellidos, String nombres, double sueldoBase, String numeroSeguroSocial) {
            super(RFC, apellidos, nombres);
            this.sueldoBase = sueldoBase;
            this.numeroSeguroSocial = numeroSeguroSocial;
        }

        @Override
        public double calcularIngresos() {
            return sueldoBase;
        }

        @Override
        public double calcularBonificacion() {
            return 0; // Los empleados permanentes no tienen bonificación
        }

        @Override
        public double calcularDescuento() {
            return sueldoBase * 0.11;
        }
    }

