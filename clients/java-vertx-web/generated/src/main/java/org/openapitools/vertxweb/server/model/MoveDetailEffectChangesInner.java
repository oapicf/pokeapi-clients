package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.MoveDetailEffectChangesInnerEffectEntriesInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveDetailEffectChangesInner   {
  
  private List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries = new ArrayList<>();
  private AbilityDetailPokemonInnerPokemon versionGroup;

  public MoveDetailEffectChangesInner () {

  }

  public MoveDetailEffectChangesInner (List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries, AbilityDetailPokemonInnerPokemon versionGroup) {
    this.effectEntries = effectEntries;
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("effect_entries")
  public List<MoveDetailEffectChangesInnerEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

    
  @JsonProperty("version_group")
  public AbilityDetailPokemonInnerPokemon getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
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
    return Objects.equals(effectEntries, moveDetailEffectChangesInner.effectEntries) &&
        Objects.equals(versionGroup, moveDetailEffectChangesInner.versionGroup);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
