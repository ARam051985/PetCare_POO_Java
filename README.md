# Examen parcial integrador
## Caso de estudio: clínica veterinaria "PetCare"
La clínica veterinaria PetCare necesita un sistema de consola para
registrar a sus mascotas y dueños, agendar citas, registrar consultas
y calcular lo que cobra por cada servicio. La clínica en cuestión
necesita lo siguiente:
- **Personas**. En la clínica hay dueños, veterinarios y recepcionistas.
Todos tienen nombre, apellido, teléfono y correo. Cada tipo tiene datos 
propios: el dueño tiene dirección, el veterinario tiene cédula profesional
y especialidad, y el recepcionista tiene turno.
- **Mascotas**. Cada mascota tiene nombre, edad, peso y un dueño. Hay al
menos tres tipos: perro, gato y ave exótica. Cada tipo tiene un dato propio
(por ejemplo, raza y nivel de energía del perro; si el gato es doméstico;
la longitud de alas del ave) y emite un sonido distinto.
- **Historial clínico**. Cada mascota tiene un historial clínico donde se
guardan sus consultas. El historial no tiene sentido sin la mascota: si la
mascota se elimina del sistema, su historial también.
- **Consultorios**. La clínica tiene consultorios numerados. Los
consultorios pertenecen a la clínica y desaparecen con ella.
- **Personal**. La clínica cuenta con un equipo de veterinarios. Un
veterinario existe aunque la clínica cierre y puede trabajar en otra.
- **Citas**. Una cita relaciona a una mascota con un veterinario en una
fecha y hora, y ocurre en un consultorio. Una cita puede estar programada,
atendida o cancelada.
- **Servicios y cobro**. Los servicios son consulta general, vacunación y
cirugía. Cada uno calcula su costo de forma distinta: la consulta tiene tarifa
base, la vacunación suma el costo de la vacuna y la cirugía depende de la
complejidad y de las horas de quirófano. Al terminar una cita se genera un
comprobante con el total.

## Tecnologías utilizadas
- Versión de Java utilizada: 2026.2.1 
- Herramienta UML utilizada: draw.io
- IDE utilizado: IntelliJ IDEA

## Método de la solución
![PetCare. Diagrama de clases.png](docs/diagramas/PetCare.%20Diagrama%20de%20clases.png)

Herencia: permite que una clase hija reutilice, extienda y herede
atributos y métodos de la clase padre. En este caso, Perro, Gato y
AveExotica heredan de "Mascota", y Dueno, Veterinario y Recepcionista
hereden de "Persona".

Interfaz: define métodos abstractos que una clase está obligada a
implementar. Una interfaz no contiene código funcional propio, permite
establecer comportamientos y lograr polimorfismo entre clases que no
comparten una jerarquía de padres. Ejemplo de esto es la interfaz
"Servicio" (implementada por Cirugia, Vacunacion y ConsultaEstandar).

Asociaciones y composociones: La elección entre ambos tipos de relación
se basó en el ciclo de vida y la dependencia entre los objetos:
- Composición: Se eligió para relaciones en donde la existencia de un
objeto está ligada a fuerzas con otro objeto (Mascota → HistorialClinico
e HistorialClinico → Consulta).
- Asociación: Se eligió para relaciones donde los objetos interactúan
entre sí, pero son independientes y pueden seguir existiendo por separado
aunque se elimine o cambie la otra entidad (Mascota - Dueño, Mascota - 
Cita, Servicio - Cita, Veterinario - Cita y Cita - Consultorio).

## Estructura del proyecto 
petcare-poo-java/ <br>
├── README.md <br>
├── .gitignore <br>
├── docs/ <br>
│ㅤㅤ├── analisis.md <br>
│ㅤㅤ├── diagramas/ <br>
│ㅤㅤ└── capturas/ <br>
└── src/ <br>
ㅤㅤ ├── app/ <br>
ㅤㅤ │ㅤㅤ└── Main.java <br>
ㅤㅤ └── modelo/ <br>
ㅤㅤㅤㅤㅤ├── personas/ <br>
ㅤㅤㅤㅤㅤ├── mascotas/ <br>
ㅤㅤㅤㅤㅤ├── servicios/ <br>
ㅤㅤㅤㅤㅤ└── clinica/ <br>
Se ha elegido esta estructura del proyecto para mantener un orden
a la hora de realizar este proyecto. Se ordenan los diagramas de
clases, capturas de ejecución y tabla de análisis del problema en
"docs/", y la implementación de la aplicación se realizó en "src/",
y dentro de esta misma se organizan por módulos a las personas,
las mascotas de los dueños, los servicios que ofrece la clínica y
la clínica como tal, así como el programa principal en "app/".

## Conceptos aplicados
# Aplicación de Conceptos POO en el Proyecto "PetCare"

| Concepto POO                                    | Archivo                 | Línea                           | Código / Explicación del Ejemplo                                                                                                                                                   |
|-------------------------------------------------|-------------------------|---------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Clase Abstracta**                             | `Mascota.java`          | Línea 8                         | `public abstract class Mascota`<br>Define la plantilla base para todas las mascotas sin instanciarse directamente.                                                                 |
| **Herencia**                                    | `Perro.java`            | Línea 7                         | `public class Perro extends Mascota`<br>La clase `Perro` hereda atributos y métodos de `Mascota`.                                                                                  |
| **Interfaz**                                    | `Servicio.java`         | Línea 7                         | `public interface Servicio`<br>Define el contrato para calcular costos de atención médica.                                                                                         |
| **Polimorfismo (Sobreescritura / `@Override`)** | `AveExotica.java`       | Líneas 36-39                    | `@Override public void emitirSonido()`<br>Redefine de forma específica el sonido del ave sin usar `instanceof`.                                                                    |
| **Sobrecarga**                                  | `Main.java`             | N/A (Concepto en Constructores) | Ocurre cuando una clase define múltiples constructores o métodos con el mismo nombre pero diferente número o tipo de parámetros (como constructores implícitos o personalizados).  |
| **Encapsulamiento**                             | `Veterinario.java`      | Líneas 8-9, 28-47               | Atributos privados (`private String especialidad;`) accedidos y modificados de forma segura mediante métodos *getter* y *setter* con validaciones.                                 |
| **Composición**                                 | `HistorialClinico.java` | Línea 10                        | `private List<Consulta> consultas;`<br>El historial posee y gestiona directamente las consultas; su existencia depende del historial.                                              |
| **Asociación**                                  | `Cita.java`             | Líneas 16-17                    | `private Mascota mascota;`<br>`private Veterinario veterinario;`<br>Relaciona la cita con la mascota y el veterinario manteniendo sus ciclos de vida independientes.               |
| **Enumeración (`enum`)**                        | `EstadoCita.java`       | Líneas 7-12                     | `public enum EstadoCita { PROGRAMADA, ATENDIDA, CANCELADA }`<br>Define un conjunto fijo de constantes de estado para las citas.                                                    |
| **Manejo de Excepciones**                       | `Cita.java`             | Líneas 94-99                    | `throw new IllegalArgumentException("No puedes marcar una cita cancelada como atendida");`<br>Protección de reglas de negocio en la transición de estados.                         |

## Ejemplo de uso
Agregar dueños y mascotas:

![01. Primer dueño y primera mascota registrados.png](docs/capturas/01.%20Primer%20due%C3%B1o%20y%20primera%20mascota%20registrados.png)
![02. Segundo dueño y segunda mascota registrados.png](docs/capturas/02.%20Segundo%20due%C3%B1o%20y%20segunda%20mascota%20registrados.png)
![03. Tercera mascota registrada.png](docs/capturas/03.%20Tercera%20mascota%20registrada.png)

Registrar veterinarios:
![04. Primer veterinario registrado.png](docs/capturas/04.%20Primer%20veterinario%20registrado.png)
![05. Segundo veterinario registrado.png](docs/capturas/05.%20Segundo%20veterinario%20registrado.png)

Agendar citas
![06. Primera cita agendada (1ra parte).png](docs/capturas/06.%20Primera%20cita%20agendada%20%281ra%20parte%29.png)
![07. Primera cita agendada (2da parte).png](docs/capturas/07.%20Primera%20cita%20agendada%20%282da%20parte%29.png)
![08. Segunda cita agendada (1ra parte).png](docs/capturas/08.%20Segunda%20cita%20agendada%20%281ra%20parte%29.png)
![09. Segunda cita agendada (2da parte).png](docs/capturas/09.%20Segunda%20cita%20agendada%20%282da%20parte%29.png)
![10. Tercera cita agendada (1ra parte).png](docs/capturas/10.%20Tercera%20cita%20agendada%20%281ra%20parte%29.png)
![11. Tercera cita agendada (2da parte).png](docs/capturas/11.%20Tercera%20cita%20agendada%20%282da%20parte%29.png)

Atender citas
![12. Primera cita atendida (1ra parte).png](docs/capturas/12.%20Primera%20cita%20atendida%20%281ra%20parte%29.png)
![13. Primera cita atendida (2da parte).png](docs/capturas/13.%20Primera%20cita%20atendida%20%282da%20parte%29.png)
![14. Segunda cita atendida.png](docs/capturas/14.%20Segunda%20cita%20atendida.png)

Generar comprobantes de citas
![15. Comprobante de primera cita (1ra parte).png](docs/capturas/15.%20Comprobante%20de%20primera%20cita%20%281ra%20parte%29.png)
![16. Comprobante de primera cita (2da parte).png](docs/capturas/16.%20Comprobante%20de%20primera%20cita%20%282da%20parte%29.png)
![17. Comprobante de segunda cita (1ra parte).png](docs/capturas/17.%20Comprobante%20de%20segunda%20cita%20%281ra%20parte%29.png)
![18. Comprobante de segunda cita (2da parte).png](docs/capturas/18.%20Comprobante%20de%20segunda%20cita%20%282da%20parte%29.png)

Enlistar animales y emitir sonidos
![19. Enlistamiento de animales con sonido emitido.png](docs/capturas/19.%20Enlistamiento%20de%20animales%20con%20sonido%20emitido.png)

Ver el total cobrado de un veterinario
![20. Total cobrado de un veterinario.png](docs/capturas/20.%20Total%20cobrado%20de%20un%20veterinario.png)

Ver el historial de consultas de nua mascota
![21. Historial de una mascota (1ra parte).png](docs/capturas/21.%20Historial%20de%20una%20mascota%20%281ra%20parte%29.png)
![22. Historial de una mascota (2da parte).png](docs/capturas/22.%20Historial%20de%20una%20mascota%20%282da%20parte%29.png)

Demostración de una violación de regla de negocio
![23. Violación de una regla de negocio (1ra parte).png](docs/capturas/23.%20Violaci%C3%B3n%20de%20una%20regla%20de%20negocio%20%281ra%20parte%29.png)
![24. Violación de una regla de negocio (2da parte).png](docs/capturas/24.%20Violaci%C3%B3n%20de%20una%20regla%20de%20negocio%20%282da%20parte%29.png)

## Reglas de negocio
1. El peso y la edad de una mascota no pueden ser negativos ni cero.
2. Un veterinario no puede tener dos citas programadas a la misma hora.
3. Una cita cancelada no puede marcarse como atendida.
4. Un consultorio no puede usarse en dos citas al mismo tiempo.
5. Los costos nunca pueden ser negativos.
6. Todo cobro debe poder consultarse por mascota y por veterinario.

## Reflexión
### ¿Qué aprendí?
- Aprendí a distinguir qué es una asociación, qué es una composición,
y qué es una agregación.
- Reforcé mis conocimientos acerca de cómo realizar un diagrama de
clases en relación a un problema de gran nivel.
- Aprendí a manejar herencias y polimorfismo sin utilizar `instanceof()`.
- Aprendí a validar datos con `IllegalArgumentException`.
- Aprendí sobre cómo puedo acceder a los elementos de una lista utilizando
índices en Java.
- Reforcé mis conocimientos acerca de cómo implementar interfaces y enums
y a cómo utilizarlos de manera adecuada.
- Aprendí a realizar archivos README.md de manera profesional.
- Aprendí a versionar repositorios.
- Aprendí a realizar commits y subirlos a mi GitHub, tanto en consola como
en el mismo IDE (IntelliJ IDEA).

### ¿Qué fue lo más difícil?
Lo más difícil fue implementar el código, ya que nunca he programado
una aplicación de gran magnitud en el cual se incluyan herencias,
polimorfismo, agregaciones, asociaciones, composiciones, enums,
interfaces, y otras cosas que se han visto en este proyecto. Además
de ocupar más de 4 listas durante todo el programa y relacionar unas
listas con otras para la demostración de asociaciones, agregaciones y
composiciones.

### Uso de Inteligencia Artificial
Se ha utilizado la Inteligencia Artificial para la explicación
y diferencias entre asociación, composición y agregación ya que se
me dificultaba diferenciar entre una y otra.

## Autor
Peña Ramírez Ángel Antonio <br>
Perfil de GitHub → https://github.com/ARam051985