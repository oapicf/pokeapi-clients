package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonSpeciesDetailGeneraInner   {
  
  private String genus;
  private AbilityDetailPokemonInnerPokemon language;

  public PokemonSpeciesDetailGeneraInner () {

  }

  public PokemonSpeciesDetailGeneraInner (String genus, AbilityDetailPokemonInnerPokemon language) {
    this.genus = genus;
    this.language = language;
  }

    
  @JsonProperty("genus")
  public String getGenus() {
    return genus;
  }
  public void setGenus(String genus) {
    this.genus = genus;
  }

    
  @JsonProperty("language")
  public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }
  public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner = (PokemonSpeciesDetailGeneraInner) o;
    return Objects.equals(genus, pokemonSpeciesDetailGeneraInner.genus) &&
        Objects.equals(language, pokemonSpeciesDetailGeneraInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genus, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailGeneraInner {\n");
    
    sb.append("    genus: ").append(toIndentedString(genus)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
