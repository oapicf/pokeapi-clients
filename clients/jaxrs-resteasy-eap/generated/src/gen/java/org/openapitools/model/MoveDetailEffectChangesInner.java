package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveDetailEffectChangesInnerEffectEntriesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MoveDetailEffectChangesInner   {
  
  private List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries = new ArrayList<>();
  private AbilityDetailPokemonInnerPokemon versionGroup;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> getEffectEntries() {
    return effectEntries;
  }
  public void setEffectEntries(List<@Valid MoveDetailEffectChangesInnerEffectEntriesInner> effectEntries) {
    this.effectEntries = effectEntries;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_group")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

