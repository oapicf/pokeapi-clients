package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class PokemonShapeDetailAwesomeNamesInner   {
  
  private String awesomeName;

  private AbilityDetailPokemonInnerPokemon language;

  /**
   **/
  public PokemonShapeDetailAwesomeNamesInner awesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("awesome_name")
  @NotNull
  public String getAwesomeName() {
    return awesomeName;
  }
  public void setAwesomeName(String awesomeName) {
    this.awesomeName = awesomeName;
  }


  /**
   **/
  public PokemonShapeDetailAwesomeNamesInner language(AbilityDetailPokemonInnerPokemon language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("language")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

