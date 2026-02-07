package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorDetailBerriesInner;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFlavorDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<BerryFlavorDetailBerriesInner> berries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private ContestTypeSummary contestType;

  @ApiModelProperty(required = true, value = "")

  private List<BerryFlavorName> names = new ArrayList<>();
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BerryFlavorDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get berries
   * @return berries
  **/
  @JsonProperty("berries")
  public List<BerryFlavorDetailBerriesInner> getBerries() {
    return berries;
  }

  public void setBerries(List<BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
  }

  public BerryFlavorDetail berries(List<BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
    return this;
  }

  public BerryFlavorDetail addBerriesItem(BerryFlavorDetailBerriesInner berriesItem) {
    this.berries.add(berriesItem);
    return this;
  }

 /**
   * Get contestType
   * @return contestType
  **/
  @JsonProperty("contest_type")
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  public BerryFlavorDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<BerryFlavorName> getNames() {
    return names;
  }

  public void setNames(List<BerryFlavorName> names) {
    this.names = names;
  }

  public BerryFlavorDetail names(List<BerryFlavorName> names) {
    this.names = names;
    return this;
  }

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

