package com.company.Pokemon.Poketype;

public abstract class Poketype{
  private String name;
  private String[] advantage;
  private String[] disadvantage;
  private String[] immunity;

  public Poketype(String name, String[] advantage, String[] disadvantage, String[] immunity) {
    this.name = name;
    this.advantage = advantage;
    this.disadvantage = disadvantage;
    this.immunity = immunity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getAdvantage() {
    return advantage;
  }

  public void setAdvantage(String[] advantage) {
    this.advantage = advantage;
  }

  public String[] getDisadvantage() {
    return disadvantage;
  }

  public void setDisadvantage(String[] disadvantage) {
    this.disadvantage = disadvantage;
  }

  public String[] getImmunity() {
    return immunity;
  }

  public void setImmunity(String[] immunity) {
    this.immunity = immunity;
  }
}
