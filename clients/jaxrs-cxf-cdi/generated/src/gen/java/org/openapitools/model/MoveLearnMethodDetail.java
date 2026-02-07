package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveLearnMethodDescription;
import org.openapitools.model.MoveLearnMethodName;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class MoveLearnMethodDetail   {
  
  private Integer id;

  private String name;

  private List<@Valid MoveLearnMethodName> names = new ArrayList<>();

  private List<@Valid MoveLearnMethodDescription> descriptions = new ArrayList<>();

  private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  /**
   **/
  public MoveLearnMethodDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   **/
  public MoveLearnMethodDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public MoveLearnMethodDetail names(List<@Valid MoveLearnMethodName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid MoveLearnMethodName> getNames() {
    return names;
  }
  public void setNames(List<@Valid MoveLearnMethodName> names) {
    this.names = names;
  }

  public MoveLearnMethodDetail addNamesItem(MoveLearnMethodName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }


  /**
   **/
  public MoveLearnMethodDetail descriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid MoveLearnMethodDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveLearnMethodDetail addDescriptionsItem(MoveLearnMethodDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }


  /**
   **/
  public MoveLearnMethodDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_groups")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }
  public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
  }

  public MoveLearnMethodDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
    this.versionGroups.add(versionGroupsItem);
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
    MoveLearnMethodDetail moveLearnMethodDetail = (MoveLearnMethodDetail) o;
    return Objects.equals(this.id, moveLearnMethodDetail.id) &&
        Objects.equals(this.name, moveLearnMethodDetail.name) &&
        Objects.equals(this.names, moveLearnMethodDetail.names) &&
        Objects.equals(this.descriptions, moveLearnMethodDetail.descriptions) &&
        Objects.equals(this.versionGroups, moveLearnMethodDetail.versionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, descriptions, versionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveLearnMethodDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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

