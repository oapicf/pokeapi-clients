package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AbilitySummary;

/**
 * PokemonAbility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonAbility   {
  @JsonProperty("is_hidden")
  private Boolean isHidden;

  @JsonProperty("slot")
  private Integer slot;

  @JsonProperty("ability")
  private AbilitySummary ability;

  public PokemonAbility isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Whether or not this is a hidden ability.
   * @return isHidden
  **/
  @ApiModelProperty(value = "Whether or not this is a hidden ability.")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public PokemonAbility slot(Integer slot) {
    this.slot = slot;
    return this;
  }

   /**
   * The slot this ability occupies in this Pokémon species.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return slot
  **/
  @ApiModelProperty(required = true, value = "The slot this ability occupies in this Pokémon species.")
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public PokemonAbility ability(AbilitySummary ability) {
    this.ability = ability;
    return this;
  }

   /**
   * The ability the Pokémon may have.
   * @return ability
  **/
  @ApiModelProperty(required = true, value = "The ability the Pokémon may have.")
  public AbilitySummary getAbility() {
    return ability;
  }

  public void setAbility(AbilitySummary ability) {
    this.ability = ability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonAbility pokemonAbility = (PokemonAbility) o;
    return Objects.equals(this.isHidden, pokemonAbility.isHidden) &&
        Objects.equals(this.slot, pokemonAbility.slot) &&
        Objects.equals(this.ability, pokemonAbility.ability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, slot, ability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonAbility {\n");
    
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
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

