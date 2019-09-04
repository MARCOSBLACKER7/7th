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
    string text,textoaux;
    cout<<"***************CRYPTOGRAPHY******************"<<endl;
    cout<<"***************SHIFT CIPHER******************"<<endl;
    cout<<"Codificador o Decodificador C/D"<<endl;
    cin >> v;
    cout<<"Key: "<<endl;
    cin>> desp;
   if(v == 'c' || v == 'C'){
    cin.ignore();
    //
    //cout<<"Texto a codificar"<<endl;
    //gets(texto);
    ifstream archivo;
    archivo.open("archivo.txt", ios::in);//abrimos en modo lectura
    if(archivo.fail()){
      cout<<"no se pudo abrir archivo";
      exit(1);
    }
    while(!archivo.eof()){
        getline(archivo,text);
        textoaux = textoaux + text +'\n';
        //cout<<text<<endl;
      
    }
    archivo.close();
    //cout<<"sali";
    //cout<<textoaux<<endl;
    tam = textoaux.size();
     // regresa el tamanio de la palabra ingresada 
    for(int i=0;i<tam;i++)
    {
    //obtenemos el valor de la letra en aux
      aux=textoaux[i];
      //cout<<"letra:"<<i<<endl;
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
      if(textoaux[i]!=' ')
      {
         //codificamos la letra 
         textoaux[i]=aux;             
      }          
    }
    cout << "Texto codificado a: "<< textoaux << "\n"<<endl;
    //cout<<"Texto codificado a: "<<text<<endl;  
    //getch();

    //escribirmos texto codificado en archivo 
    ofstream cif("cifra.txt", ios::out);
    if(cif.is_open()){
      cif<<textoaux<<endl;
    }
    cif.close();
    
    }
    else if( v== 'D' || v =='d'){
       cin.ignore();
       //cout<<"Indique el texto a decodificar"<<endl;
    //gets(texto);
    //////
    ifstream lee;
    lee.open("cifra.txt", ios::in);//abrimos en modo lectura
    if(lee.fail()){
      cout<<"no se pudo abrir archivo";
      exit(1);
    }
    while(!lee.eof()){
        getline(lee,text);
        textoaux = textoaux + text ;
        //cout<<text<<endl;
      
    }
    lee.close();
    //cout<<"sali";
    //cout<<textoaux<<endl;


    ////////
    tam=textoaux.size();
    for(int i=0;i<tam;i++) 
    {
      aux=textoaux[i];
      if(aux-desp<97) 
      {
         aux=122-(96-(aux-desp));          
      }
      else
      {
          aux=aux-desp;
      } 
      if(textoaux[i]!=' ')
      {
         textoaux[i]=aux;             
      }        
    }
    //cout<<"Texto codificado a: "<<textoaux<<endl;  
    //getch();
    //escribirmos texto codificado en archivo 
    ofstream cif1("descifra.txt", ios::out);
    if(cif1.is_open()){
      cif1<<textoaux<<endl;
    }
    cif1.close();
    }

    system("pause");
    return 0;


    }


    

