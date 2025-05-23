# LaLiga-Fantasy-Simulator
📊 Simulador de Temporadas de Liga

Esta aplicación permite simular una temporada completa de LaLiga Española de fútbol, consultar estadísticas, y gestionar los datos de la temporada simulada a través de una interfaz gráfica sencilla e intuitiva.



🛠️ Configuración del Proyecto

📌 SGBD Elegido

Se ha utilizado MySQL Workbench 8.0.42 como sistema de gestión de base de datos (SGBD).



⚙️ Configuración del entorno

1. Driver JDBC de MySQL:

    Descargar el archivo mysql-connector-java-8.0.20.jar desde el sitio oficial de MySQL.
  
    Añadirlo al classpath del proyecto o configurarlo en el IDE (Eclipse, IntelliJ, NetBeans, etc.).

2. Configuración de conexión JDBC:

   La conexión se realiza desde la clase ConexionBD.java.

   Formato de la URL de conexión:

       String url = "jdbc:mysql://localhost/<nombre_base_de_datos>?user=<usuario>&password=<contraseña>&useLegacyDatetimeCode=false&serverTimezone=<zona_horaria>";

   Este formato incluye:

       Protocolo JDBC: jdbc:mysql://

       Host: localhost

       Base de datos: /<BD>

   Parámetros:

        user y password: usuario y contraseña de la base de datos

        useLegacyDatetimeCode=false: asegura compatibilidad con fechas y horas modernas

        serverTimezone=<zona_horaria>: ajusta la zona horaria al sistema local

   Usuario y contraseña deben coincidir con los definidos en la base de datos.

   

▶️ Ejecución de la Aplicación

  Requisitos Previos:

    JDK 8 o superior.

    MySQL funcionando y accesible.

    Driver JDBC correctamente configurado.   

    Importar el proyecto como proyecto Java.

    Añadir mysql-connector-java-8.0.20.jar a las dependencias.

    Ejecutar la clase pagina01Principal.java.

  
  
🚀 Funcionalidades Principales
1. Menú Principal
   
    Al iniciar la aplicación, se presenta una ventana emergente con las siguientes opciones:
  
    Simular Temporada

    Ver Temporada
  
    Borrar Datos Simulados
  
    Salir



2. Simular Temporada
    
   Al elegir Simular Temporada, el programa:
   
     Recupera los equipos registrados en la base de datos.
   
     Simula una temporada completa, generando todos los partidos de ida y vuelta.
   
     Los resultados se determinan en base a:
   
       Condición de local o visitante.
   
       Valoración de cada equipo (de 0 a 5 estrellas).
   
     Se registran automáticamente en la base de datos los siguientes datos para cada equipo:

       Puntos

       Partidos jugados
   
       Partidos ganados / empatados / perdidos
   
       Goles a favor / en contra
   
       Diferencia de goles
   
    Una vez finalizada la simulación, aparece una nueva ventana con tres opciones:
   
      Consultar Resultados: Navegar jornada por jornada.
   
      Consultar Clasificación: Ver la tabla de posiciones actualizada por jornada.
   
      Volver al Menú Principal
   


3. Ver Temporada

    Al elegir Ver Temporada, el programa enseña una ventana con tres opciones:

      Consultar Resultados: Navegar jornada por jornada.
   
      Consultar Clasificación: Ver la tabla de posiciones actualizada por jornada.
   
      Volver al Menú Principal

   En caso de que no haya ninguna temporada simulada, saltará una ventana de error.

  

4. Borrar Datos Simulados
   
   Al seleccionar esta opción, el programa permite eliminar todos los registros de laa temporada simulada.

   En caso de intentar eliminar una temporada y no haya ninguna generada, se mostrará un mensaje de error.



5. Salir
   
   Finaliza la ejecución del programa y cierra todas las ventanas activas.



📝 Notas

Asegirate de tener bien generada la base de datos ejecutando el archivo LaLigaFantasyGenerator_DataBase.sql dentro de nuestro SGBD.

Asegúrate de tener cargados los equipos en la base de datos ejecutando el archivo laliga_equipos dentro de nuestro SGBD antes de simular una temporada.

Los datos generados se guardan automáticamente y se pueden consultar o eliminar posteriormente.



📌 Autor

Desarrollado por Félix Caballero Peña y Gabriel Sánchez Heredia.
