package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveDetailEffectChangesInnerEffectEntriesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveDetailEffectChangesInner  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AbilityDetailPokemonInnerPokemon versionGroup;
 /**
  * Get effectEntries
  * @return effectEntries
  */
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   */
 public void setEffectEntries(List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   * Sets the <code>effectEntries</code> property.
   */
  public MoveDetailEffectChangesInner effectEntries(List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>effectEntries</code> list.
   */
  public MoveDetailEffectChangesInner addEffectEntriesItem(MoveDetailEffectChangesInnerEffectEntriesInner effectEntriesItem) {
    this.effectEntries.add(effectEntriesItem);
    return this;
  }

 /**
  * Get versionGroup
  * @return versionGroup
  */
  @JsonProperty("version_group")
  @NotNull
  public AbilityDetailPokemonInnerPokemon getVersionGroup() {
    return versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
 public void setVersionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
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

