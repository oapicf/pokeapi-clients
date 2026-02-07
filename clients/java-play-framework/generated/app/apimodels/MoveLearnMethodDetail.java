package apimodels;

import apimodels.AbilityDetailPokemonInnerPokemon;
import apimodels.MoveLearnMethodDescription;
import apimodels.MoveLearnMethodName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * MoveLearnMethodDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T15:23:19.397731995Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MoveLearnMethodDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

  private String name;

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid MoveLearnMethodName> names = new ArrayList<>();

  @JsonProperty("descriptions")
  @NotNull
@Valid

  private List<@Valid MoveLearnMethodDescription> descriptions = new ArrayList<>();

  @JsonProperty("version_groups")
  @NotNull
@Valid

  private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public MoveLearnMethodDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MoveLearnMethodDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MoveLearnMethodDetail names(List<@Valid MoveLearnMethodName> names) {
    this.names = names;
    return this;
  }

  public MoveLearnMethodDetail addNamesItem(MoveLearnMethodName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  public List<@Valid MoveLearnMethodName> getNames() {
    return names;
  }

  public void setNames(List<@Valid MoveLearnMethodName> names) {
    this.names = names;
  }

  public MoveLearnMethodDetail descriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public MoveLearnMethodDetail addDescriptionsItem(MoveLearnMethodDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  public List<@Valid MoveLearnMethodDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid MoveLearnMethodDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public MoveLearnMethodDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  public MoveLearnMethodDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }
    this.versionGroups.add(versionGroupsItem);
    return this;
  }

   /**
   * Get versionGroups
   * @return versionGroups
  **/
  public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }

  public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

