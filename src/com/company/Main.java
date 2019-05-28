package com.company;

import com.company.Pokemon.Pokemon;
import com.company.Pokemon.Poketype.Fire;
import com.company.Pokemon.Poketype.Poketype;

public class Main {

  public static void main(String[] args) {
    Pokemon Charmander = new Pokemon("Charmander",
            new Poketype[]{new Fire()},
            1,
            1,
            new String[]{"Ember", "Scratch"});
  }
}
