package moreandeasy.eg05countries;

import java.util.ArrayList;
import java.util.List;

class Country {
  
  private String name;
  private String capitalCity;
  private int population;
  private String language;
  private boolean isG2;

  public Country(String name, String capitalCity, int population, String language, boolean isG2) {
    this.name = name;
    this.capitalCity = capitalCity;
    this.population = population;
    this.language = language;
    this.isG2 = isG2;
  }

  public String getName() {
    return name;
  }

  public String getCapitalCity() {
    return capitalCity;
  }

  public int getPopulation() {
    return population;
  }

  public String getLanguage() {
    return language;
  }

  public boolean getIsG2() {
    return isG2;
  }
}

public class Main {
  public static void main(String[] args) {

    List<Country> countries = new ArrayList<>();

    countries.add(new Country("한국", "서울", 53_000_000, "한국어", false));
    countries.add(new Country("미국", "워싱턴 D.C", 350_000_000, "영어", true));
    countries.add(new Country("일본", "도쿄", 130_000_000, "일본어", false));

    for (Country country : countries) {
      System.out.println(country.getCapitalCity());
      System.out.println(country.getCapitalCity());
      System.out.println(country.getPopulation());
      System.out.println(country.getLanguage());
      System.out.println(country.getIsG2());
      System.out.println();
    }
  }
}
