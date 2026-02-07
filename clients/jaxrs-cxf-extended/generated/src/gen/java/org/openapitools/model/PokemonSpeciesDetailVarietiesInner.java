package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpeciesDetailVarietiesInner  {
  
  @ApiModelProperty(required = true, value = "")
  private Boolean isDefault;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon pokemon;
 /**
  * Get isDefault
  * @return isDefault
  */
  @JsonProperty("is_default")
  @NotNull
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
 public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
  public PokemonSpeciesDetailVarietiesInner isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

 /**
  * Get pokemon
  * @return pokemon
  */
  @JsonProperty("pokemon")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getPokemon() {
    return pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
 public void setPokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
  public PokemonSpeciesDetailVarietiesInner pokemon(AbilityDetailPokemonInnerPokemon pokemon) {
    this.pokemon = pokemon;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

