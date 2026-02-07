package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.MoveLearnMethodDescription;
import org.openapitools.model.MoveLearnMethodName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MoveLearnMethodDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MoveLearnMethodName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MoveLearnMethodDescription> descriptions = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public MoveLearnMethodDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public MoveLearnMethodDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid MoveLearnMethodName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid MoveLearnMethodName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public MoveLearnMethodDetail names(List<@Valid MoveLearnMethodName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public MoveLearnMethodDetail addNamesItem(MoveLearnMethodName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get descriptions
  * @return descriptions
  */
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid MoveLearnMethodDescription> getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   */
 public void setDescriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * Sets the <code>descriptions</code> property.
   */
  public MoveLearnMethodDetail descriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  /**
   * Adds a new item to the <code>descriptions</code> list.
   */
  public MoveLearnMethodDetail addDescriptionsItem(MoveLearnMethodDescription descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

 /**
  * Get versionGroups
  * @return versionGroups
  */
  @JsonProperty("version_groups")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }

  /**
   * Sets the <code>versionGroups</code> property.
   */
 public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
  }

  /**
   * Sets the <code>versionGroups</code> property.
   */
  public MoveLearnMethodDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>versionGroups</code> list.
   */
  public MoveLearnMethodDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

