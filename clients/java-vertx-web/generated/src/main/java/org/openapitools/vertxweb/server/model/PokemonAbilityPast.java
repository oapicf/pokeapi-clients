package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AbilitySummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PokemonAbilityPast   {
  
  private Boolean isHidden;
  private Integer slot;
  private AbilitySummary ability;

  public PokemonAbilityPast () {

  }

  public PokemonAbilityPast (Boolean isHidden, Integer slot, AbilitySummary ability) {
    this.isHidden = isHidden;
    this.slot = slot;
    this.ability = ability;
  }

    
  @JsonProperty("is_hidden")
  public Boolean getIsHidden() {
    return isHidden;
  }
  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

    
  @JsonProperty("slot")
  public Integer getSlot() {
    return slot;
  }
  public void setSlot(Integer slot) {
    this.slot = slot;
  }

    
  @JsonProperty("ability")
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
    PokemonAbilityPast pokemonAbilityPast = (PokemonAbilityPast) o;
    return Objects.equals(isHidden, pokemonAbilityPast.isHidden) &&
        Objects.equals(slot, pokemonAbilityPast.slot) &&
        Objects.equals(ability, pokemonAbilityPast.ability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, slot, ability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonAbilityPast {\n");
    
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
