package org.openapitools.model;

import org.openapitools.model.PokemonSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityPokemonDetail  {
  
 /**
  * Whether or not this a hidden ability for the referenced Pokémon.
  */
  @ApiModelProperty(value = "Whether or not this a hidden ability for the referenced Pokémon.")

  private Boolean isHidden;

 /**
  * Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
  */
  @ApiModelProperty(required = true, value = "Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.")

  private Integer slot;

 /**
  * The Pokémon this ability could belong to.
  */
  @ApiModelProperty(required = true, value = "The Pokémon this ability could belong to.")

  @Valid

  private PokemonSummary pokemon;
 /**
   * Whether or not this a hidden ability for the referenced Pokémon.
   * @return isHidden
  **/
  @JsonProperty("is_hidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public AbilityPokemonDetail isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

 /**
   * Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
  **/
  @JsonProperty("slot")
  @NotNull
 @Min(-2147483648) @Max(2147483647)  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public AbilityPokemonDetail slot(Integer slot) {
    this.slot = slot;
    return this;
  }

 /**
   * The Pokémon this ability could belong to.
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

  public AbilityPokemonDetail pokemon(PokemonSummary pokemon) {
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
    AbilityPokemonDetail abilityPokemonDetail = (AbilityPokemonDetail) o;
    return Objects.equals(this.isHidden, abilityPokemonDetail.isHidden) &&
        Objects.equals(this.slot, abilityPokemonDetail.slot) &&
        Objects.equals(this.pokemon, abilityPokemonDetail.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, slot, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityPokemonDetail {\n");
    
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
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

