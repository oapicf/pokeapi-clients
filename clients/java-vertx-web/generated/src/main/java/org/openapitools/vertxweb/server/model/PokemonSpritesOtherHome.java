package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonSpritesOtherHome   {
  
  private String frontDefault;
  private String frontFemale;
  private String frontShiny;
  private String frontShinyFemale;

  public PokemonSpritesOtherHome () {

  }

  public PokemonSpritesOtherHome (String frontDefault, String frontFemale, String frontShiny, String frontShinyFemale) {
    this.frontDefault = frontDefault;
    this.frontFemale = frontFemale;
    this.frontShiny = frontShiny;
    this.frontShinyFemale = frontShinyFemale;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpritesOtherHome pokemonSpritesOtherHome = (PokemonSpritesOtherHome) o;
    return Objects.equals(frontDefault, pokemonSpritesOtherHome.frontDefault) &&
        Objects.equals(frontFemale, pokemonSpritesOtherHome.frontFemale) &&
        Objects.equals(frontShiny, pokemonSpritesOtherHome.frontShiny) &&
        Objects.equals(frontShinyFemale, pokemonSpritesOtherHome.frontShinyFemale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontFemale, frontShiny, frontShinyFemale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpritesOtherHome {\n");
    
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
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
