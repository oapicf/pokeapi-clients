package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ItemDetail_machines_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemDetailMachinesInner   {
  private URI machine;
  private AbilityDetailPokemonInnerPokemon versionGroup;

  public ItemDetailMachinesInner() {
  }

  @JsonCreator
  public ItemDetailMachinesInner(
    @JsonProperty(required = true, value = "machine") URI machine,
    @JsonProperty(required = true, value = "version_group") AbilityDetailPokemonInnerPokemon versionGroup
  ) {
    this.machine = machine;
    this.versionGroup = versionGroup;
  }

  /**
   **/
  public ItemDetailMachinesInner machine(URI machine) {
    this.machine = machine;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "machine")
  @NotNull public URI getMachine() {
    return machine;
  }

  @JsonProperty(required = true, value = "machine")
  public void setMachine(URI machine) {
    this.machine = machine;
  }

  /**
   **/
  public ItemDetailMachinesInner versionGroup(AbilityDetailPokemonInnerPokemon versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public AbilityDetailPokemonInnerPokemon getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
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
    ItemDetailMachinesInner itemDetailMachinesInner = (ItemDetailMachinesInner) o;
    return Objects.equals(this.machine, itemDetailMachinesInner.machine) &&
        Objects.equals(this.versionGroup, itemDetailMachinesInner.versionGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(machine, versionGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDetailMachinesInner {\n");
    
    sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
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

