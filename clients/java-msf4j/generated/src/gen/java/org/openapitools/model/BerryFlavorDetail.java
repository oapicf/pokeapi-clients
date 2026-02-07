package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFlavorDetailBerriesInner;
import org.openapitools.model.BerryFlavorName;
import org.openapitools.model.ContestTypeSummary;

/**
 * BerryFlavorDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-02-07T04:17:01.559585484Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BerryFlavorDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("berries")
  private List<@Valid BerryFlavorDetailBerriesInner> berries = new ArrayList<>();

  @JsonProperty("contest_type")
  private ContestTypeSummary contestType;

  @JsonProperty("names")
  private List<@Valid BerryFlavorName> names = new ArrayList<>();

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public BerryFlavorDetail name(String name) {
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

  public BerryFlavorDetail berries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
    return this;
  }

  public BerryFlavorDetail addBerriesItem(BerryFlavorDetailBerriesInner berriesItem) {
    this.berries.add(berriesItem);
    return this;
  }

   /**
   * Get berries
   * @return berries
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid BerryFlavorDetailBerriesInner> getBerries() {
    return berries;
  }

  public void setBerries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
  }

  public BerryFlavorDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

   /**
   * Get contestType
   * @return contestType
  **/
  @ApiModelProperty(required = true, value = "")
  public ContestTypeSummary getContestType() {
    return contestType;
  }

  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }

  public BerryFlavorDetail names(List<@Valid BerryFlavorName> names) {
    this.names = names;
    return this;
  }

  public BerryFlavorDetail addNamesItem(BerryFlavorName namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(required = true, value = "")
  public List<@Valid BerryFlavorName> getNames() {
    return names;
  }

  public void setNames(List<@Valid BerryFlavorName> names) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

