package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatDetailAffectingNatures;
import org.openapitools.model.PokeathlonStatName;

/**
 * PokeathlonStatDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokeathlonStatDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("affecting_natures")
  private PokeathlonStatDetailAffectingNatures affectingNatures;

  @JsonProperty("names")
  private List<@Valid PokeathlonStatName> names = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public PokeathlonStatDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokeathlonStatDetail affectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

   /**
   * Get affectingNatures
   * @return affectingNatures
  **/
  @ApiModelProperty(required = true, value = "")
  public PokeathlonStatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  public void setAffectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  public PokeathlonStatDetail names(List<@Valid PokeathlonStatName> names) {
    this.names = names;
    return this;
  }

  public PokeathlonStatDetail addNamesItem(PokeathlonStatName namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid PokeathlonStatName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokeathlonStatName> names) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

