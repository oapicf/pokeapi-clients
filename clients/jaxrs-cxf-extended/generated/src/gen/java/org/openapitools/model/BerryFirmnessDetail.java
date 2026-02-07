package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFirmnessName;
import org.openapitools.model.BerrySummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFirmnessDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid BerrySummary> berries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid BerryFirmnessName> names = new ArrayList<>();
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
  public BerryFirmnessDetail id(Integer id) {
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
  public BerryFirmnessDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get berries
  * @return berries
  */
  @JsonProperty("berries")
  @NotNull
  public List<@Valid BerrySummary> getBerries() {
    return berries;
  }

  /**
   * Sets the <code>berries</code> property.
   */
 public void setBerries(List<@Valid BerrySummary> berries) {
    this.berries = berries;
  }

  /**
   * Sets the <code>berries</code> property.
   */
  public BerryFirmnessDetail berries(List<@Valid BerrySummary> berries) {
    this.berries = berries;
    return this;
  }

  /**
   * Adds a new item to the <code>berries</code> list.
   */
  public BerryFirmnessDetail addBerriesItem(BerrySummary berriesItem) {
    this.berries.add(berriesItem);
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid BerryFirmnessName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid BerryFirmnessName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public BerryFirmnessDetail names(List<@Valid BerryFirmnessName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public BerryFirmnessDetail addNamesItem(BerryFirmnessName namesItem) {
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
    BerryFirmnessDetail berryFirmnessDetail = (BerryFirmnessDetail) o;
    return Objects.equals(this.id, berryFirmnessDetail.id) &&
        Objects.equals(this.name, berryFirmnessDetail.name) &&
        Objects.equals(this.berries, berryFirmnessDetail.berries) &&
        Objects.equals(this.names, berryFirmnessDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, berries, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFirmnessDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
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

