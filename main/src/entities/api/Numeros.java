package entities.api;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Numeros {

    @SerializedName("dezenas")
    private ArrayList<String> numeros;

    public Numeros(ArrayList<String> numeros) {
        this.numeros = numeros;
    }

    public ArrayList<String> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<String> numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "Numeros " + numeros ;
    }
}
