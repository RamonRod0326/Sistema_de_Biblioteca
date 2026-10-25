# Sistema de Biblioteca

Proyecto integrador de Aplicaciones Web - UTEZ, Desarrollo de Software.

Backend hecho con Spring Boot, Spring Data JPA y MySQL.

## Integrantes

- Albarran Candia Alondra Raziel
- Brito Ibarra Angel Said
- Garcia Rodriguez Gerardo
- Pacheco Mendoza Yara Ayme
- Rodriguez Meminje Ramón
- Velazquez Ojeda Jairo Jesus

## Estructura

Todo está dentro de `src/main/java/mx/edu/utez/biblioteca`:

- `entities` - entidades JPA (una por cada tabla del diagrama)
- `enums` - valores de las columnas tipo ENUM
- `repositories` - un repository por cada entidad

## Para correrlo

1. Tener MySQL corriendo en el puerto 3306.
2. Poner su usuario y contraseña de MySQL en `src/main/resources/application.properties`.
3. Correr `BibliotecaApplication` desde el IDE o con `./mvnw spring-boot:run`.

La base de datos `biblioteca` se crea sola si no existe y las tablas las genera Hibernate.
