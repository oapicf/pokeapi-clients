package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonFormDetailFormNamesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon language;

  @ApiModelProperty(required = true, value = "")

  private String name;
 /**
   * Get language
   * @return language
  **/
  @JsonProperty("language")
  public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }

  public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
  }

  public PokemonFormDetailFormNamesInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonFormDetailFormNamesInner name(String name) {
    this.name = name;
    return this;
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
    return Objects.equals(this.language, pokemonFormDetailFormNamesInner.language) &&
        Objects.equals(this.name, pokemonFormDetailFormNamesInner.name);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

