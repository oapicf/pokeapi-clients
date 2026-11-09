package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSummary;

/**
 * AbilityPokemonDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class AbilityPokemonDetail   {
  @JsonProperty("is_hidden")
  private Boolean isHidden;

  @JsonProperty("slot")
  private Integer slot;

  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  public AbilityPokemonDetail isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Whether or not this a hidden ability for the referenced Pokémon.
   * @return isHidden
  **/
  @ApiModelProperty(value = "Whether or not this a hidden ability for the referenced Pokémon.")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public AbilityPokemonDetail slot(Integer slot) {
    this.slot = slot;
    return this;
  }

   /**
   * Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
  **/
  @ApiModelProperty(required = true, value = "Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public AbilityPokemonDetail pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

   /**
   * The Pokémon this ability could belong to.
   * @return pokemon
  **/
  @ApiModelProperty(required = true, value = "The Pokémon this ability could belong to.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

