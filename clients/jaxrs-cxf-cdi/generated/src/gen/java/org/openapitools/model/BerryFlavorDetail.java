package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BerryFlavorDetail   {
  
  private Integer id;

  private String name;

  private List<@Valid BerryFlavorDetailBerriesInner> berries = new ArrayList<>();

  private ContestTypeSummary contestType;

  private List<@Valid BerryFlavorName> names = new ArrayList<>();

  /**
   **/
  public BerryFlavorDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  /**
   **/
  public BerryFlavorDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public BerryFlavorDetail berries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("berries")
  @NotNull
  public List<@Valid BerryFlavorDetailBerriesInner> getBerries() {
    return berries;
  }
  public void setBerries(List<@Valid BerryFlavorDetailBerriesInner> berries) {
    this.berries = berries;
  }

  public BerryFlavorDetail addBerriesItem(BerryFlavorDetailBerriesInner berriesItem) {
    if (this.berries == null) {
      this.berries = new ArrayList<>();
    }
    this.berries.add(berriesItem);
    return this;
  }


  /**
   **/
  public BerryFlavorDetail contestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("contest_type")
  @NotNull
  public ContestTypeSummary getContestType() {
    return contestType;
  }
  public void setContestType(ContestTypeSummary contestType) {
    this.contestType = contestType;
  }


  /**
   **/
  public BerryFlavorDetail names(List<@Valid BerryFlavorName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid BerryFlavorName> getNames() {
    return names;
  }
  public void setNames(List<@Valid BerryFlavorName> names) {
    this.names = names;
  }

  public BerryFlavorDetail addNamesItem(BerryFlavorName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

