#include<iostream>
#include<conio.h>
#include<stdio.h>
#include<string.h>
#include<fstream>
#include <stdlib.h>

using namespace std;



main()
{
	
    char texto[10000], v;
    int desp,tam,aux;
    cout<<"***************CRYPTOGRAPHY******************"<<endl;
    cout<<"***************SHIFT CIPHER******************"<<endl;
    cout<<"Codificador o Decodificador C/D"<<endl;
    cin >> v;
    cout<<"Key: "<<endl;
    cin>> desp;
   if(v == 'c' || v == 'C'){
    cin.ignore();
    //
    cout<<"Texto a codificar"<<endl;
    gets(texto);
    tam = strlen (texto);
     // regresa el tamanio de la palabra ingresada 
    for(int i=0;i<tam;i++)
    {
    //obtenemos el valor de la letra en aux
      aux=texto[i];
       //comparamos el valor ascci 
      if(aux+desp>122)
      {
         //si es le restamos el valor z y la  diferencia la sumamos al principio del abecedario y almacenamos el nuevo valo
         aux=((aux+desp)-122)+96;          
      }
      else
      {
          aux=aux+desp;
      } 
      //condicion para no hacer nada si el caracter es un ESPACIO
      if(texto[i]!=' ')
      {
         //codificamos la letra 
         texto[i]=aux;             
      }          
    }
    cout<<"Texto codificado a: "<<texto<<endl;  
    getch();
    
    
    }
    else if( v== 'D' || v =='d'){
       cin.ignore();
       cout<<"Indique el texto a decodificar"<<endl;
    gets(texto);
    tam=strlen(texto);
    for(int i=0;i<tam;i++) 
    {
      aux=texto[i];
      if(aux-desp<97) 
      {
         aux=122-(96-(aux-desp));          
      }
      else
      {
          aux=aux-desp;
      } 
      if(texto[i]!=' ')
      {
         texto[i]=aux;             
      }        
    }
    cout<<"Texto codificado a: "<<texto<<endl;  
    getch();
    }




    }


    

