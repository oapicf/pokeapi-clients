package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonFormDetailFormNamesInner   {
  
  private AbilityDetailPokemonInnerPokemon language;
  private String name;

  public PokemonFormDetailFormNamesInner () {

  }

  public PokemonFormDetailFormNamesInner (AbilityDetailPokemonInnerPokemon language, String name) {
    this.language = language;
    this.name = name;
  }

    
  @JsonProperty("language")
  public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }
  public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner = (PokemonFormDetailFormNamesInner) o;
    return Objects.equals(language, pokemonFormDetailFormNamesInner.language) &&
        Objects.equals(name, pokemonFormDetailFormNamesInner.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormDetailFormNamesInner {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
