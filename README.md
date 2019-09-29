# Taller AWS Microservicios

En este laboratorio se crea una aplicación WEB usando spark que tiene un formulario que le pide un número al usuario y le regresa el cuadrado de este número. Usando Amazon Gateway y lambda se crea un servicio que reciba un parámetro numérico y retorne el cuadrado del número. La aplicación Web usa el servicio de de Amazon GateWay para calcular el valor.

### Prerequisitos

* Java 1.8
* Maven 3.6.0
* Tener una cuenta en AWS  

# Pruebas

En las imágenes que se encuentran a continuación se evidencia el funcionamiento de la aplicación web ya desplegada, en la cual se digita un número y se da click en el botón de calcular, luego este retorna el resultado obtenido del servicio de Amazon que se utiliza para su cálculo.
### Ejemplo 1

![ejemplo1](https://github.com/k26duran/AmazonGateway_Lambda/blob/master/images/1.png)

![ejemplo1.1](https://github.com/k26duran/AmazonGateway_Lambda/blob/master/images/2.png)

### Ejemplo 2

![ejemplo2](https://github.com/k26duran/AmazonGateway_Lambda/blob/master/images/3.png)

![ejemplo2.1](https://github.com/k26duran/AmazonGateway_Lambda/blob/master/images/4.png)

El fragmento de código en donde se evidencia que se está haciendo uso del servicio de Amazon GateWay es el siguiente:

![code](https://github.com/k26duran/AmazonGateway_Lambda/blob/master/images/code.png)


## Ejecutar
### Descagar proyecto, sus dependencias y compilar
```console
AREM@AREM:~$ git https://github.com/k26duran/AmazonGateway_Lambda.git
AREM@AREM:~$ cd AmazonGateway_Lambda
AREM@AREM:~$ mvn package
AREM@AREM:~$ mvn compile
```

### Autor

Karen Paola Duran Vivas - [k26duran](https://github.com/k26duran)

Estudiante de la Escuela colombiana de ingeniería Julio Garavito. 
