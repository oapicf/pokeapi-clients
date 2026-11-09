package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonSpritesOtherShowdown   {
  
  private String frontDefault;
  private String frontFemale;
  private String frontShiny;
  private String frontShinyFemale;
  private String backDefault;
  private String backFemale;
  private String backShiny;
  private String backShinyFemale;

  public PokemonSpritesOtherShowdown () {

  }

  public PokemonSpritesOtherShowdown (String frontDefault, String frontFemale, String frontShiny, String frontShinyFemale, String backDefault, String backFemale, String backShiny, String backShinyFemale) {
    this.frontDefault = frontDefault;
    this.frontFemale = frontFemale;
    this.frontShiny = frontShiny;
    this.frontShinyFemale = frontShinyFemale;
    this.backDefault = backDefault;
    this.backFemale = backFemale;
    this.backShiny = backShiny;
    this.backShinyFemale = backShinyFemale;
  }

    
  @JsonProperty("front_default")
  public String getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

    
  @JsonProperty("front_female")
  public String getFrontFemale() {
    return frontFemale;
  }
  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
  }

    
  @JsonProperty("front_shiny")
  public String getFrontShiny() {
    return frontShiny;
  }
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

    
  @JsonProperty("front_shiny_female")
  public String getFrontShinyFemale() {
    return frontShinyFemale;
  }
  public void setFrontShinyFemale(String frontShinyFemale) {
    this.frontShinyFemale = frontShinyFemale;
  }

    
  @JsonProperty("back_default")
  public String getBackDefault() {
    return backDefault;
  }
  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

    
  @JsonProperty("back_female")
  public String getBackFemale() {
    return backFemale;
  }
  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

    
  @JsonProperty("back_shiny")
  public String getBackShiny() {
    return backShiny;
  }
  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

    
  @JsonProperty("back_shiny_female")
  public String getBackShinyFemale() {
    return backShinyFemale;
  }
  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherShowdown pokemonSpritesOtherShowdown = (PokemonSpritesOtherShowdown) o;
    return Objects.equals(frontDefault, pokemonSpritesOtherShowdown.frontDefault) &&
        Objects.equals(frontFemale, pokemonSpritesOtherShowdown.frontFemale) &&
        Objects.equals(frontShiny, pokemonSpritesOtherShowdown.frontShiny) &&
        Objects.equals(frontShinyFemale, pokemonSpritesOtherShowdown.frontShinyFemale) &&
        Objects.equals(backDefault, pokemonSpritesOtherShowdown.backDefault) &&
        Objects.equals(backFemale, pokemonSpritesOtherShowdown.backFemale) &&
        Objects.equals(backShiny, pokemonSpritesOtherShowdown.backShiny) &&
        Objects.equals(backShinyFemale, pokemonSpritesOtherShowdown.backShinyFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale, frontShiny, frontShinyFemale, backDefault, backFemale, backShiny, backShinyFemale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherShowdown {\n");
    
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
    sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
    sb.append("    backFemale: ").append(toIndentedString(backFemale)).append("\n");
    sb.append("    backShiny: ").append(toIndentedString(backShiny)).append("\n");
    sb.append("    backShinyFemale: ").append(toIndentedString(backShinyFemale)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
