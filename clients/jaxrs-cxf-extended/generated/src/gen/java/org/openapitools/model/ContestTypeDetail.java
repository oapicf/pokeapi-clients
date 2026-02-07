package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorSummary;
import org.openapitools.model.ContestTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ContestTypeDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BerryFlavorSummary berryFlavor;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid ContestTypeName> names = new ArrayList<>();
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
  public ContestTypeDetail id(Integer id) {
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
  public ContestTypeDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get berryFlavor
  * @return berryFlavor
  */
  @JsonProperty("berry_flavor")
  @NotNull
  public BerryFlavorSummary getBerryFlavor() {
    return berryFlavor;
  }

  /**
   * Sets the <code>berryFlavor</code> property.
   * <br><em>N.B. <code>berryFlavor</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setBerryFlavor(BerryFlavorSummary berryFlavor) {
    this.berryFlavor = berryFlavor;
  }

  /**
   * Sets the <code>berryFlavor</code> property.
   * <br><em>N.B. <code>berryFlavor</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public ContestTypeDetail berryFlavor(BerryFlavorSummary berryFlavor) {
    this.berryFlavor = berryFlavor;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid ContestTypeName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid ContestTypeName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public ContestTypeDetail names(List<@Valid ContestTypeName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public ContestTypeDetail addNamesItem(ContestTypeName namesItem) {
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
    ContestTypeDetail contestTypeDetail = (ContestTypeDetail) o;
    return Objects.equals(this.id, contestTypeDetail.id) &&
        Objects.equals(this.name, contestTypeDetail.name) &&
        Objects.equals(this.berryFlavor, contestTypeDetail.berryFlavor) &&
        Objects.equals(this.names, contestTypeDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, berryFlavor, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestTypeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    berryFlavor: ").append(toIndentedString(berryFlavor)).append("\n");
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

