package com.example.nuevo_tema_cuandofalte;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DIDACT on 14/02/2018.
 */


//implementar la clase
public class Persona implements Parcelable {

    String nombre;
    int edad;
    double sueldo;

    //Creator

    public static final Parcelable.Creator<Persona> CREATOR = new Parcelable.Creator<Persona>(){
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }
        public Persona[] newArray(int size){
            return new Persona[size];
        }
    };

    //FIN CREATOR

    //Constructor normal

    public Persona(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }


    //Constructor que reciba por parametros un parcel

    public Persona(Parcel parcel){

        //llamamos al metodo readfromparcel y le pasamos el parcelable

        readFromParcel(parcel);


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Metodos implementados

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.nombre);
        dest.writeInt(this.edad);
        dest.writeDouble(this.sueldo);

    }

    private void readFromParcel (Parcel parcel){

        this.nombre = parcel.readString();
        this.edad = parcel.readInt();
        this.sueldo = parcel.readDouble();
    }
}
