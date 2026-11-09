package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokeathlonStatAffectingNatures;
import com.prokarma.pkmst.model.PokeathlonStatName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokeathlonStatDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokeathlonStatDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("affecting_natures")
  private PokeathlonStatAffectingNatures affectingNatures;

  @JsonProperty("names")
  
  private List<PokeathlonStatName> names = new ArrayList<>();

  public PokeathlonStatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PokeathlonStatDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokeathlonStatDetail affectingNatures(PokeathlonStatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  /**
   * A detail of natures which affect this Pokéathlon stat positively or negatively.
   * @return affectingNatures
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A detail of natures which affect this Pokéathlon stat positively or negatively.")
  public PokeathlonStatAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  public void setAffectingNatures(PokeathlonStatAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  public PokeathlonStatDetail names(List<PokeathlonStatName> names) {
    this.names = names;
    return this;
  }

  public PokeathlonStatDetail addNamesItem(PokeathlonStatName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<PokeathlonStatName> getNames() {
    return names;
  }

  public void setNames(List<PokeathlonStatName> names) {
    this.names = names;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokeathlonStatDetail pokeathlonStatDetail = (PokeathlonStatDetail) o;
    return Objects.equals(this.id, pokeathlonStatDetail.id) &&
        Objects.equals(this.name, pokeathlonStatDetail.name) &&
        Objects.equals(this.affectingNatures, pokeathlonStatDetail.affectingNatures) &&
        Objects.equals(this.names, pokeathlonStatDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, affectingNatures, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokeathlonStatDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    affectingNatures: ").append(toIndentedString(affectingNatures)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

