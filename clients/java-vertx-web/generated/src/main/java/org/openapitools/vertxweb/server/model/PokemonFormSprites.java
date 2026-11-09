package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.vertxweb.server.model.PokemonSpritesOther;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonFormSprites   {
  
  private String frontDefault;
  private String frontShiny;
  private String frontFemale;
  private String frontShinyFemale;
  private String backDefault;
  private String backShiny;
  private String backFemale;
  private String backShinyFemale;
  private PokemonSpritesOther other;
  private Map<String, Map<String, Object>> versions = new HashMap<>();

  public PokemonFormSprites () {

  }

  public PokemonFormSprites (String frontDefault, String frontShiny, String frontFemale, String frontShinyFemale, String backDefault, String backShiny, String backFemale, String backShinyFemale, PokemonSpritesOther other, Map<String, Map<String, Object>> versions) {
    this.frontDefault = frontDefault;
    this.frontShiny = frontShiny;
    this.frontFemale = frontFemale;
    this.frontShinyFemale = frontShinyFemale;
    this.backDefault = backDefault;
    this.backShiny = backShiny;
    this.backFemale = backFemale;
    this.backShinyFemale = backShinyFemale;
    this.other = other;
    this.versions = versions;
  }

    
  @JsonProperty("front_default")
  public String getFrontDefault() {
    return frontDefault;
  }
  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }

    
  @JsonProperty("front_shiny")
  public String getFrontShiny() {
    return frontShiny;
  }
  public void setFrontShiny(String frontShiny) {
    this.frontShiny = frontShiny;
  }

    
  @JsonProperty("front_female")
  public String getFrontFemale() {
    return frontFemale;
  }
  public void setFrontFemale(String frontFemale) {
    this.frontFemale = frontFemale;
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

    
  @JsonProperty("back_shiny")
  public String getBackShiny() {
    return backShiny;
  }
  public void setBackShiny(String backShiny) {
    this.backShiny = backShiny;
  }

    
  @JsonProperty("back_female")
  public String getBackFemale() {
    return backFemale;
  }
  public void setBackFemale(String backFemale) {
    this.backFemale = backFemale;
  }

    
  @JsonProperty("back_shiny_female")
  public String getBackShinyFemale() {
    return backShinyFemale;
  }
  public void setBackShinyFemale(String backShinyFemale) {
    this.backShinyFemale = backShinyFemale;
  }

    
  @JsonProperty("other")
  public PokemonSpritesOther getOther() {
    return other;
  }
  public void setOther(PokemonSpritesOther other) {
    this.other = other;
  }

    
  @JsonProperty("versions")
  public Map<String, Map<String, Object>> getVersions() {
    return versions;
  }
  public void setVersions(Map<String, Map<String, Object>> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonFormSprites pokemonFormSprites = (PokemonFormSprites) o;
    return Objects.equals(frontDefault, pokemonFormSprites.frontDefault) &&
        Objects.equals(frontShiny, pokemonFormSprites.frontShiny) &&
        Objects.equals(frontFemale, pokemonFormSprites.frontFemale) &&
        Objects.equals(frontShinyFemale, pokemonFormSprites.frontShinyFemale) &&
        Objects.equals(backDefault, pokemonFormSprites.backDefault) &&
        Objects.equals(backShiny, pokemonFormSprites.backShiny) &&
        Objects.equals(backFemale, pokemonFormSprites.backFemale) &&
        Objects.equals(backShinyFemale, pokemonFormSprites.backShinyFemale) &&
        Objects.equals(other, pokemonFormSprites.other) &&
        Objects.equals(versions, pokemonFormSprites.versions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontDefault, frontShiny, frontFemale, frontShinyFemale, backDefault, backShiny, backFemale, backShinyFemale, other, versions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormSprites {\n");
    
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
    sb.append("    frontShiny: ").append(toIndentedString(frontShiny)).append("\n");
    sb.append("    frontFemale: ").append(toIndentedString(frontFemale)).append("\n");
    sb.append("    frontShinyFemale: ").append(toIndentedString(frontShinyFemale)).append("\n");
    sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
    sb.append("    backShiny: ").append(toIndentedString(backShiny)).append("\n");
    sb.append("    backFemale: ").append(toIndentedString(backFemale)).append("\n");
    sb.append("    backShinyFemale: ").append(toIndentedString(backShinyFemale)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
