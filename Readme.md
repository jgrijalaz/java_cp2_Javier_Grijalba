# Enunciado 2: BankAccount (No terminado)

 **Javier Grijalba**

**https://github.com/jgrijalaz/java_cp2_Javier_Grijalba**

**jgrijalaz@gmail.com**

Colaborador: alansastre

Fecha de entrega: ideal 10/02/2023, si se necesita más tiempo no hay problema, simplemente indicar si está acabado o no en el README.

## 1. Creación de clases y objetos:

### Clases OBLIGATORIAS:
* Clase principal **BankAccount**:
    * Identificador (numérico)
    * Saldo (numérico)
    * Tipo (enum): ahorro, inversiones, empresa
    * Coste (numérico)
    * Interés/recompensa (numérico)
    * Customer (Otra clase **obligatoria**)
    * Lista de monedas soportadas: EUR, USD, FOR, HUG, CZK, YEN (Set o List de String)
    * Fecha de creación
* Clase **Customer**:
    * id
    * nif
    * name

### Clases OPCIONALES:
* Clase Banco (asociado a BankAccount)
* Clase Address (asociado a Customer)
* Clase Préstamo: bankAccount, Empleado, cantidad, interés, fecha expiración
* Clase Empleado
* Interfaz e implementación para cada clase


## 2. Creación de interfaz

### Crear una interfaz para las operaciones de cuenta bancaria:
* Buscar todas las cuentas bancarias
* Buscar una cuenta bancaria por su id
* Buscar una cuenta bancaria por el nif de su usuario/cliente
* Buscar todas las cuentas bancarias por el tipo de cuenta. Ejemplo: buscar cuentas de tipo ahorro devuelve una lista con las cuentas de ahorro.
* Buscar por moneda soportada
* Agrupar por tipo de cuenta: devuelve un mapa cuyas claves son los tipos de cuenta y cuyos valores son listas de cuentas de esos tipos. Aquí se devuelve un mapa con todos los tipos de cuenta pero agrupados.
* Crear nueva cuenta bancaria
* Incrementar saldo
* Hacer retiro / Disminuir saldo
* Actualizar cuenta bancaria
* Borrar cuenta bancaria
* Traspasar saldo de una cuenta a otra

### Crear implementación de la interfaz que implemente todas las operaciones

### Consola:
* Mostrar un menú por consola con todas las opciones de la interfaz
* El usuario puede elegir una opción
* Leer de consola los datos necesarios para ejecutar la operación que haya elegido

## Recomendable:
* Intentar gestionar las posibles excepciones y repetir las lecturas en caso de que el usuario introduzca mal los datos. Se puede crear algo parecido a la clase ScannerReader vista en el curso.

