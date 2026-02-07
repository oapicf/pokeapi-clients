package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatDetailAffectingNatures;
import org.openapitools.model.PokeathlonStatName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokeathlonStatDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokeathlonStatDetail   {
  private Integer id;
  private String name;
  private PokeathlonStatDetailAffectingNatures affectingNatures;
  private @Valid List<@Valid PokeathlonStatName> names = new ArrayList<>();

  public PokeathlonStatDetail() {
  }

  @JsonCreator
  public PokeathlonStatDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "affecting_natures") PokeathlonStatDetailAffectingNatures affectingNatures,
    @JsonProperty(required = true, value = "names") List<@Valid PokeathlonStatName> names
  ) {
    this.id = id;
    this.name = name;
    this.affectingNatures = affectingNatures;
    this.names = names;
  }

  /**
   **/
  public PokeathlonStatDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public PokeathlonStatDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public PokeathlonStatDetail affectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "affecting_natures")
  @NotNull @Valid public PokeathlonStatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  @JsonProperty(required = true, value = "affecting_natures")
  public void setAffectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  /**
   **/
  public PokeathlonStatDetail names(List<@Valid PokeathlonStatName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid PokeathlonStatName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid PokeathlonStatName> names) {
    this.names = names;
  }

  public PokeathlonStatDetail addNamesItem(PokeathlonStatName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public PokeathlonStatDetail removeNamesItem(PokeathlonStatName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

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

