#include <iostream>
#include <conio.h>
#include <stdio.h>
#include <string.h>
#include <fstream>
#include <stdlib.h>

main()
{
    char texto[50000];
    int desp=1,tam,aux;
    cout<<"Indique el texto a codificar"<<endl;
    gets(texto);
    /* gets función que permite almacenar texto
    en una cadena de caracteres incluyendo el carácter ESPACIO*/
    tam=strlen(texto);
     // strlen () funcion que retorna el tamaño de la palabra ingresada
    // ciclo para recorrer el vector texto[] hasta el tamaño de la frase
    for(int i=0;i<tam;i++)
    {
    //obtenemos el valor de la letra en aux
      aux=texto[i];
       /*comparamos a ver si la suma del valor ascci mas
       el desplazamiento es mayor que el valor de z*/
      if(aux+desp>122)
      {
         /*si es le restamos el valor z y la
         diferencia la sumamos al principio
         del abecedario y almacenamos el nuevo valor*/
         aux=((aux+desp)-122)+96;
      }
      else
      {
          /*si no solo sumamos el desplazamiento
           y almacenamos el nuevo valor*/
          aux=aux+desp;
      }
      /* condición para no hacer nada si el carácter es un ESPACIO*/
      if(texto[i]!=' ')
      {
         //codificamos la letra
         texto[i]=aux;
      }
    }
    //mostramos la palabra codificada
    cout<<"Texto codificado a: "<<texto<<endl;
    getch();//detenemos la pantalla y listo
    }
Y ahora con el de-codificador:
#include<conio.h>
#include<stdio.h>
#include<string.h>

main()
{
    char texto[50];
    int desp=1,tam,aux;
    /*Variables
    texto[50] vector donde se almacena la frase o palabra a codificar
    desp=1  numero de desplazamiento del cifrado Cesar en este caso es 1
    tam Tamaño de la frase o palabra introducida
    aux variable auxiliar para trabajar con los valores numéricos de las letras*/
    cout<<"Indique el texto a descodificar"<<endl;
    gets(texto);
    /* gets función que permite almacenar texto
    en una cadena de caracteres incluyendo el carácter ESPACIO*/
    tam=strlen(texto); // strlen () función que retorna el tamaño de la palabra ingresada
    // ciclo para recorrer el vector texto[] hasta el tamaño de la frase
    for(int i=0;i<tam;i++)
    {
      //obtenemos el valor de la letra en aux
      aux=texto[i];
      //comparamos a ver si la resta del valor ascci es menor que a
      if(aux-desp<97)
      {
         /*si es calculamos el valor de la letra codificada retando la diferencia a z*/
         aux=122-(96-(aux-desp));
      }
      else
      {
          /*si no solo restamos el desplazamiento
           y almacenamos el nuevo valor*/
          aux=aux-desp;
      }
       /* condición para no hacer nada si el carácter es un ESPACIO*/
      if(texto[i]!=' ')
      {
         //codificamos la letra
         texto[i]=aux;
      }
    }
      //mostramos la palabra codificada
    cout<<"Texto codificado a: "<<texto<<endl;
    getch();//detenemos la pantalla y listo
    }
