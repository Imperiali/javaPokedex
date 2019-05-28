package com.company.Pokemon;

import com.company.Pokemon.Poketype.Poketype;

public class Pokemon {
  private String pokeName;
  private Poketype[] types;
  private boolean shine;
  private int level;
  private int exp;
  private String[] skills;

  public Pokemon(String pokeName, Poketype[] types, int level, int exp, String[] skills) {
    this.pokeName = pokeName;
    //TODO this.shine must be random
    this.types = types;
    this.level = level;
    this.exp = exp;
    this.skills = skills;
  }

  public String getPokeName() {
    return pokeName;
  }

  public void setPokeName(String pokeName) {
    this.pokeName = pokeName;
  }

  public Poketype[] getTypes() {
    return types;
  }

  public void setTypes(Poketype[] types) {
    this.types = types;
  }

  public boolean isShine() {
    return shine;
  }

  public void setShine(boolean shine) {
    this.shine = shine;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getExp() {
    return exp;
  }

  public void setExp(int exp) {
    this.exp = exp;
  }

  public String[] getSkills() {
    return skills;
  }

  public void setSkills(String[] skills) {
    this.skills = skills;
  }
}
