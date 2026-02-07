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



public class PokemonSpeciesDetailVarietiesInner   {
  
  private Boolean isDefault;

  private AbilityDetailPokemonInnerPokemon pokemon;

  /**
   **/
  public PokemonSpeciesDetailVarietiesInner isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("is_default")
  @NotNull
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  /**
   **/
  public PokemonSpeciesDetailVarietiesInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }
  public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonSpeciesDetailVarietiesInner pokemonSpeciesDetailVarietiesInner = (PokemonSpeciesDetailVarietiesInner) o;
    return Objects.equals(this.isDefault, pokemonSpeciesDetailVarietiesInner.isDefault) &&
        Objects.equals(this.pokemon, pokemonSpeciesDetailVarietiesInner.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesDetailVarietiesInner {\n");
    
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

