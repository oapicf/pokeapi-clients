package org.openapitools.model;

import org.openapitools.model.AbilitySummary;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonAbility implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Whether or not this is a hidden ability.
   */
  @JsonProperty("is_hidden")
  private Boolean isHidden;

  /**
   * The slot this ability occupies in this Pokémon species.
   */
  @JsonProperty("slot")
  private Integer slot;

  /**
   * The ability the Pokémon may have.
   */
  @JsonProperty("ability")
  private AbilitySummary ability;

  /**
   * Whether or not this is a hidden ability.
   * @return isHidden
   */
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  /**
   * The slot this ability occupies in this Pokémon species.
   * @return slot
   */
  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  /**
   * The ability the Pokémon may have.
   * @return ability
   */
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
