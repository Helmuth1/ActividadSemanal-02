
Mascota.java:
Clase base que representa cualquier tipo de mascota. Contiene atributos comunes como nombre, edad, vacunado y especie.

Principios POO:
Encapsulamiento: Todos los atributos son private y se accede a ellos a través de métodos public (getters). Esto protege la integridad de los datos de la mascota.
Abstracción: El método mostrarInformacion() oculta los detalles internos de cómo se formatea y presenta la información de la mascota. Los métodos hacerSonido() y descansar() definen comportamientos generales que pueden ser especializados por subclases.

AtencionEspecial.java:
