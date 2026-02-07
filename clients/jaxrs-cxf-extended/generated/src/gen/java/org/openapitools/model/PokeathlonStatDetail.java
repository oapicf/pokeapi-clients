package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PokeathlonStatDetailAffectingNatures;
import org.openapitools.model.PokeathlonStatName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokeathlonStatDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokeathlonStatDetailAffectingNatures affectingNatures;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokeathlonStatName> names = new ArrayList<>();
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
  public PokeathlonStatDetail id(Integer id) {
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
  public PokeathlonStatDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get affectingNatures
  * @return affectingNatures
  */
  @JsonProperty("affecting_natures")
  @NotNull
  public PokeathlonStatDetailAffectingNatures getAffectingNatures() {
    return affectingNatures;
  }

  /**
   * Sets the <code>affectingNatures</code> property.
   */
 public void setAffectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
  }

  /**
   * Sets the <code>affectingNatures</code> property.
   */
  public PokeathlonStatDetail affectingNatures(PokeathlonStatDetailAffectingNatures affectingNatures) {
    this.affectingNatures = affectingNatures;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokeathlonStatName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid PokeathlonStatName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public PokeathlonStatDetail names(List<@Valid PokeathlonStatName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public PokeathlonStatDetail addNamesItem(PokeathlonStatName namesItem) {
    this.names.add(namesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

