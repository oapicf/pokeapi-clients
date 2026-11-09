package org.openapitools.model;

import org.openapitools.model.PokemonSummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonSpeciesVariety implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Whether this variety is the default variety.
   */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /**
   * The Pokémon variety.
   */
  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  /**
   * Whether this variety is the default variety.
   * @return isDefault
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * The Pokémon variety.
   * @return pokemon
   */
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
