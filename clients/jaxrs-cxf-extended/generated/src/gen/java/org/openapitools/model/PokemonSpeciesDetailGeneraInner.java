package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpeciesDetailGeneraInner  {
  
  @ApiModelProperty(required = true, value = "")
  private String genus;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon language;
 /**
  * Get genus
  * @return genus
  */
  @JsonProperty("genus")
  @NotNull
  public String getGenus() {
    return genus;
  }

  /**
   * Sets the <code>genus</code> property.
   */
 public void setGenus(String genus) {
    this.genus = genus;
  }

  /**
   * Sets the <code>genus</code> property.
   */
  public PokemonSpeciesDetailGeneraInner genus(String genus) {
    this.genus = genus;
    return this;
  }

 /**
  * Get language
  * @return language
  */
  @JsonProperty("language")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public PokemonSpeciesDetailGeneraInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
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
    PokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner = (PokemonSpeciesDetailGeneraInner) o;
    return Objects.equals(this.genus, pokemonSpeciesDetailGeneraInner.genus) &&
        Objects.equals(this.language, pokemonSpeciesDetailGeneraInner.language);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

