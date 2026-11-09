package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-11-09T13:50:00.159999817Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonSpeciesVariety   {
  
  private Boolean isDefault;
  private PokemonSummary pokemon;

  /**
   * Whether this variety is the default variety.
   **/
  
  @ApiModelProperty(required = true, value = "Whether this variety is the default variety.")
  @JsonProperty("is_default")
  @NotNull
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * The Pokémon variety.
   **/
  
  @ApiModelProperty(required = true, value = "The Pokémon variety.")
  @JsonProperty("pokemon")
  @NotNull
  @Valid
  public PokemonSummary getPokemon() {
    return pokemon;
  }
  public void setPokemon(PokemonSummary pokemon) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

