# Sistema de Gestión de Inventario
## Descripción del Proyecto
Este es un sistema de gestión de inventario basado en la web, desarrollado utilizando tecnologías modernas tanto en el frontend como en el backend. El sistema permite a los usuarios gestionar productos y realizar un seguimiento de los movimientos (entradas y salidas) en el inventario. Proporciona un conjunto completo de operaciones CRUD para productos y movimientos de inventario, junto con documentación detallada de la API.

# Funcionalidades Clave
- Agregar, actualizar, eliminar y consultar productos en el inventario.
- Registrar movimientos de inventario (entradas y salidas).
- Gestionar niveles de stock e información de productos de manera eficiente.
- Documentación de la API RESTful mediante Swagger para facilitar la interacción.
- Interfaz web para gestionar el inventario utilizando HTML/CSS/JavaScript y Bootstrap.

# Tecnologías Utilizadas
## Backend:
- **Java (Spring Boot):** Utilizado para construir la API RESTful que maneja los datos de productos y movimientos.
- **Spring Data JPA:** Para gestionar las operaciones de la base de datos con entidades como Productos y Movimientos.
- **MySQL:** Sistema de base de datos utilizado para almacenar información de productos y movimientos.
- **Hibernate:** Implementación de JPA para el mapeo objeto-relacional (ORM).
- **Swagger/OpenAPI:** Para la documentación de la API y pruebas interactivas de los endpoints.
## Frontend:
- **HTML/CSS/JavaScript:** Estructura, estilo e interactividad para la interfaz de usuario del sistema.
- **Bootstrap: Utilizado** para crear una interfaz de usuario receptiva y visualmente atractiva.
## Herramientas de Desarrollo:
- **Maven:** Para la gestión de dependencias y el ciclo de vida del proyecto.
- **Thunder** Client/Postman: Para probar los endpoints de la API REST.
- **GitHub:** Para control de versiones y colaboración en el proyecto.
# Logros
- Implementación de una API RESTful completamente funcional para la gestión de inventario con Spring Boot.
- Integración exitosa de la documentación de la API mediante Swagger para facilitar el desarrollo y las pruebas.
- Creación de una interfaz web basada en Bootstrap que permite a los usuarios gestionar su inventario de manera fácil y eficiente.
- Desarrollo de un backend seguro y escalable con MySQL y Spring Data JPA para manejar las operaciones de datos de manera eficaz.

#Cómo Ejecutar el Proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/tu-repo-url.git
cd sistema-gestion-inventario
```
2. Construir el proyecto:

```bash
mvn clean install
```
3. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```
4. Documentación de la API: Accede a [http://localhost:8080/swagger-ui.html](https://app.swaggerhub.com/apis-docs/RUBENORTIZDB9/Gestion_Inventario/1.0.0) para interactuar con la API a través de Swagger.

# Contribuciones
¡Las contribuciones son bienvenidas! Por favor, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (git checkout -b nueva-funcionalidad).
3. Realiza los commits necesarios (git commit -m 'Agregar nueva funcionalidad').
4. Sube los cambios a la rama (git push origin nueva-funcionalidad).
5. Abre un pull request.

# Licencia
Este proyecto está licenciado bajo la [Licencia Apache 2.0.](https://www.apache.org/licenses/LICENSE-2.0.html)

  ![Logo](https://blog.knoldus.com/wp-content/uploads/2019/05/spring_boot.png)
  <img>![Logo](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTl9R-FE_hHTnzSrt4ptLmsUa6rTXkd6Wdoo32IV3O9G-cR1mKZf8ix6Hwa0wmnFycTRA&usqp=CAU)
