package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveDetailEffectChangesInnerEffectEntriesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetailEffectChangesInner  {
  
  @ApiModelProperty(required = true, value = "")

  private List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private AbilityDetailPokemonInnerPokemon versionGroup;
 /**
   * Get effectEntries
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  public List<MoveDetailEffectChangesInnerEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  public MoveDetailEffectChangesInner effectEntries(List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  public MoveDetailEffectChangesInner addEffectEntriesItem(MoveDetailEffectChangesInnerEffectEntriesInner effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
   * Get versionGroup
   * @return versionGroup
  **/
  @JsonProperty("version_group")
  public AbilityDetailPokemonInnerPokemon getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
  }

  public MoveDetailEffectChangesInner versionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
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
    MoveDetailEffectChangesInner moveDetailEffectChangesInner = (MoveDetailEffectChangesInner) o;
    return Objects.equals(this.effectEntries, moveDetailEffectChangesInner.effectEntries) &&
        Objects.equals(this.versionGroup, moveDetailEffectChangesInner.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectEntries, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveDetailEffectChangesInner {\n");
    
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
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

