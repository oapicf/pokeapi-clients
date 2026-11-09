package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorBerryMap;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFlavorDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  private String name;

 /**
  * A list of the berries with this flavor.
  */
  @ApiModelProperty(required = true, value = "A list of the berries with this flavor.")
  private List<@Valid BerryFlavorBerryMap> berries = new ArrayList<>();

 /**
  * The contest type that correlates with this berry flavor.
  */
  @ApiModelProperty(required = true, value = "The contest type that correlates with this berry flavor.")
  @Valid
  private ContestTypeSummary contestType;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  private List<@Valid BerryFlavorName> names = new ArrayList<>();
 /**
  * The identifier for this resource.
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
  * The name for this resource.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
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
  * A list of the berries with this flavor.
  * @return berries
  */
  @JsonProperty("berries")
  @NotNull
  public List<@Valid BerryFlavorBerryMap> getBerries() {
    return berries;
  }

  /**
   * Sets the <code>berries</code> property.
   * <br><em>N.B. <code>berries</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setBerries(List<@Valid BerryFlavorBerryMap> berries) {
    this.berries = berries;
  }

  /**
   * Sets the <code>berries</code> property.
   * <br><em>N.B. <code>berries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BerryFlavorDetail berries(List<@Valid BerryFlavorBerryMap> berries) {
    this.berries = berries;
    return this;
  }

  /**
   * Adds a new item to the <code>berries</code> list.
   * <br><em>N.B. <code>berries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BerryFlavorDetail addBerriesItem(BerryFlavorBerryMap berriesItem) {
    this.berries.add(berriesItem);
    return this;
  }

 /**
  * The contest type that correlates with this berry flavor.
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
  * The name of this resource listed in different languages.
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid BerryFlavorName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNames(List<@Valid BerryFlavorName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BerryFlavorDetail names(List<@Valid BerryFlavorName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

