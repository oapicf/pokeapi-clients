package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BerryFirmnessName;
import org.openapitools.model.BerrySummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BerryFirmnessDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private List<BerrySummary> berries = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<BerryFirmnessName> names = new ArrayList<>();
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

  public BerryFirmnessDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get berries
   * @return berries
  **/
  @JsonProperty("berries")
  public List<BerrySummary> getBerries() {
    return berries;
  }

  public void setBerries(List<BerrySummary> berries) {
    this.berries = berries;
  }

  public BerryFirmnessDetail berries(List<BerrySummary> berries) {
    this.berries = berries;
    return this;
  }

  public BerryFirmnessDetail addBerriesItem(BerrySummary berriesItem) {
    this.berries.add(berriesItem);
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<BerryFirmnessName> getNames() {
    return names;
  }

  public void setNames(List<BerryFirmnessName> names) {
    this.names = names;
  }

  public BerryFirmnessDetail names(List<BerryFirmnessName> names) {
    this.names = names;
    return this;
  }

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

