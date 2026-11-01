# Justificación de las relaciones
## Mascota - Dueño → Asociación
Una mascota sigue existiendo si se elimina al dueño, aunque si se
elimina al dueño, la mascota deberá tener otro dueño asignado.

## Mascota - Historial Clínico → Composición
Una mascota tiene su propio historial clínico. Si se elimina la
mascota, su historial clínico también se elimina.

## Historial Clínico - Consulta → Composición
En el historial clínico se guardan consultas, y cada consulta es
guardada en un historial clínico. Si se elimina el historial
clínico, las consultas también.

## Mascota - Cita → Asociación
Una mascota sigue existiendo si se elimina una cita, y viceversa.

## Servicio - Cita → Asociación
Un servicio sigue existiendo si se elimina la cita, y viceversa.

## Veterinario - Cita → Asociación
Un veterinario sigue existiendo si se elimina la cita, y viceversa.