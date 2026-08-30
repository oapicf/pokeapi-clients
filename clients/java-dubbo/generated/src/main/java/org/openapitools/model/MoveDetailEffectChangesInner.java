package org.openapitools.model;

import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveDetailEffectChangesInnerEffectEntriesInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class MoveDetailEffectChangesInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("effect_entries")
  private List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries = new ArrayList<>();

  @JsonProperty("version_group")
  private AbilityDetailPokemonInnerPokemon versionGroup;

  /**
   * 
   * @return effectEntries
   */
  public List<MoveDetailEffectChangesInnerEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  public void setEffectEntries(List<MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * 
   * @return versionGroup
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
