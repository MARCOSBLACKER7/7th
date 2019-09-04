#include<iostream>
#include<conio.h>
#include<stdio.h>
#include<string.h>

using namespace std;

main()
{
    char texto[5000]; 
    int desp=3,tam,aux;
    
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
