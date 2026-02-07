package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonShapeDetailAwesomeNamesInner  {
  
  @ApiModelProperty(required = true, value = "")
  private String awesomeName;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon language;
 /**
  * Get awesomeName
  * @return awesomeName
  */
  @JsonProperty("awesome_name")
  @NotNull
  public String getAwesomeName() {
    return awesomeName;
  }

  /**
   * Sets the <code>awesomeName</code> property.
   */
 public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }

  /**
   * Sets the <code>awesomeName</code> property.
   */
  public PokemonShapeDetailAwesomeNamesInner awesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
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
  public PokemonShapeDetailAwesomeNamesInner language(AbilityDetailPokemonInnerPokemon language) {
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
    PokemonShapeDetailAwesomeNamesInner pokemonShapeDetailAwesomeNamesInner = (PokemonShapeDetailAwesomeNamesInner) o;
    return Objects.equals(this.awesomeName, pokemonShapeDetailAwesomeNamesInner.awesomeName) &&
        Objects.equals(this.language, pokemonShapeDetailAwesomeNamesInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awesomeName, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonShapeDetailAwesomeNamesInner {\n");
    
    sb.append("    awesomeName: ").append(toIndentedString(awesomeName)).append("\n");
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

