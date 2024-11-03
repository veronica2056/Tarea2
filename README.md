Proyecto de Contenidos Audiovisuales

-Descripción del Proyecto
Este proyecto es una aplicación en Java para gestionar y visualizar detalles de diferentes tipos de contenidos audiovisuales. Utiliza Programación Orientada a Objetos (POO) para definir clases que representan distintos tipos de contenidos, como películas, series de TV, documentales, cortometrajes y transmisiones en streaming. 

-Objetivo
El objetivo del proyecto es implementar un sistema flexible que permita la creación y manipulación de objetos audiovisuales, utilizando principios avanzados de POO como la herencia, la composición y la agregación. El sistema está diseñado para ser expandible y fácil de mantener.

-Estructura de Clases y Funcionalidades Nuevas
- **ContenidoAudiovisual**: Clase abstracta base que define los atributos comunes para todos los contenidos (título, duración, género, ID único).
- **Pelicula**: Subclase que representa una película e incluye atributos adicionales como estudio, actor y actriz.
- **SerieDeTV**: Subclase que representa una serie de TV, con atributos como temporadas y capítulos.
- **Documental**: Subclase que incluye atributos adicionales como el tema y el investigador.
- **Cortometraje**: Subclase que representa un cortometraje, con el nombre del director.
- **Streaming**: Subclase que representa una transmisión en línea, con el canal de emisión.

-Funcionalidades
- Creación y almacenamiento de diferentes tipos de contenido audiovisual en una lista dinámica.
- Visualización de los detalles de cada contenido.
- Expansibilidad para agregar otros tipos de contenido en el futuro.

-Pasos para Clonar y Ejecutar en NetBeans 23
Clonar el Repositorio:
Abre la terminal o línea de comandos.
Navega a la carpeta donde deseas guardar el proyecto.
Ejecuta el comando: git clone <URL del repositorio>
Abrir el Proyecto en NetBeans:
Abre NetBeans 23.
Ve a File > Open Project.
Busca la carpeta donde clonaste el repositorio y selecciona la carpeta raíz del proyecto.
Haz clic en Open Project.
Ejecutar el Proyecto:
En el panel de proyectos, haz clic derecho en PruebaAudioVisual (en el paquete poo).
Selecciona Run File para ejecutar la clase principal.
