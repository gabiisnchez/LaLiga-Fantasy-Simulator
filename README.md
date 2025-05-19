# LaLiga-Fantasy-Simulator
📊 Simulador de Temporadas de Liga

Esta aplicación permite simular temporadas completas de una liga de fútbol, consultar estadísticas, y gestionar datos de temporadas simuladas a través de una interfaz gráfica sencilla e intuitiva.
  
🚀 Funcionalidades Principales
1. Menú Principal
   
    Al iniciar la aplicación, se presenta una ventana emergente con las siguientes opciones:
  
    Simular Temporada
  
    Consultar Temporada
  
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

3. Consultar Temporadas
   
   Si no existen temporadas simuladas, se muestra una ventana de aviso.

   Si hay temporadas guardadas:
   
        Se solicita seleccionar una temporada específica.
   
        Se habilitan las mismas opciones que tras simular una temporada: consultar resultados, clasificación o volver.

4. Borrar Datos Simulados
   
   Al seleccionar esta opción, el programa permite:

     Borrar una temporada específica (solo si existe).

     Borrar todas las temporadas generadas.
   
    En caso de intentar eliminar una temporada inexistente, se mostrará un mensaje de error.

5. Salir
   
   Finaliza la ejecución del programa y cierra todas las ventanas activas.
