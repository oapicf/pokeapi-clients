package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.MoveLearnMethodDescription;
import org.openapitools.vertxweb.server.model.MoveLearnMethodName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MoveLearnMethodDetail   {
  
  private Integer id;
  private String name;
  private List<MoveLearnMethodName> names = new ArrayList<>();
  private List<MoveLearnMethodDescription> descriptions = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public MoveLearnMethodDetail () {

  }

  public MoveLearnMethodDetail (Integer id, String name, List<MoveLearnMethodName> names, List<MoveLearnMethodDescription> descriptions, List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.descriptions = descriptions;
    this.versionGroups = versionGroups;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("names")
  public List<MoveLearnMethodName> getNames() {
    return names;
  }
  public void setNames(List<MoveLearnMethodName> names) {
    this.names = names;
  }

    
  @JsonProperty("descriptions")
  public List<MoveLearnMethodDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
  }

    
  @JsonProperty("version_groups")
  public List<AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }
  public void setVersionGroups(List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
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
    return Objects.equals(id, moveLearnMethodDetail.id) &&
        Objects.equals(name, moveLearnMethodDetail.name) &&
        Objects.equals(names, moveLearnMethodDetail.names) &&
        Objects.equals(descriptions, moveLearnMethodDetail.descriptions) &&
        Objects.equals(versionGroups, moveLearnMethodDetail.versionGroups);
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
