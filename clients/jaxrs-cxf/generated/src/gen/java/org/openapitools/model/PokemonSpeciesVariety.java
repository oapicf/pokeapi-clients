package org.openapitools.model;

import org.openapitools.model.PokemonSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonSpeciesVariety  {
  
 /**
  * Whether this variety is the default variety.
  */
  @ApiModelProperty(required = true, value = "Whether this variety is the default variety.")

  private Boolean isDefault;

 /**
  * The Pokémon variety.
  */
  @ApiModelProperty(required = true, value = "The Pokémon variety.")

  @Valid

  private PokemonSummary pokemon;
 /**
   * Whether this variety is the default variety.
   * @return isDefault
  **/
  @JsonProperty("is_default")
  @NotNull
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonSpeciesVariety isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

 /**
   * The Pokémon variety.
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  @NotNull
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  public PokemonSpeciesVariety pokemon(PokemonSummary pokemon) {
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
    PokemonSpeciesVariety pokemonSpeciesVariety = (PokemonSpeciesVariety) o;
    return Objects.equals(this.isDefault, pokemonSpeciesVariety.isDefault) &&
        Objects.equals(this.pokemon, pokemonSpeciesVariety.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDefault, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonSpeciesVariety {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

