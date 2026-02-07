package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorDetailBerriesInner;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFlavorDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid BerryFlavorDetailBerriesInner> berries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ContestTypeSummary contestType;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid BerryFlavorName> names = new ArrayList<>();
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
  public BerryFlavorDetail id(Integer id) {
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
  public BerryFlavorDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get berries
  * @return berries
  */
  @JsonProperty("berries")
  @NotNull
  public List<@Valid BerryFlavorDetailBerriesInner> getBerries() {
    return berries;
  }

  /**
   * Sets the <code>berries</code> property.
   */
 public void setBerries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
  }

  /**
   * Sets the <code>berries</code> property.
   */
  public BerryFlavorDetail berries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
    return this;
  }

  /**
   * Adds a new item to the <code>berries</code> list.
   */
  public BerryFlavorDetail addBerriesItem(BerryFlavorDetailBerriesInner berriesItem) {
    this.berries.add(berriesItem);
    return this;
  }

 /**
  * Get contestType
  * @return contestType
  */
  @JsonProperty("contest_type")
  @NotNull
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  /**
   * Sets the <code>contestType</code> property.
   */
 public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  /**
   * Sets the <code>contestType</code> property.
   */
  public BerryFlavorDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid BerryFlavorName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid BerryFlavorName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public BerryFlavorDetail names(List<@Valid BerryFlavorName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public BerryFlavorDetail addNamesItem(BerryFlavorName namesItem) {
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
    BerryFlavorDetail berryFlavorDetail = (BerryFlavorDetail) o;
    return Objects.equals(this.id, berryFlavorDetail.id) &&
        Objects.equals(this.name, berryFlavorDetail.name) &&
        Objects.equals(this.berries, berryFlavorDetail.berries) &&
        Objects.equals(this.contestType, berryFlavorDetail.contestType) &&
        Objects.equals(this.names, berryFlavorDetail.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, berries, contestType, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BerryFlavorDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    berries: ").append(toIndentedString(berries)).append("\n");
    sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
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

