package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.LocationGameIndex;
import org.openapitools.model.LocationName;
import org.openapitools.model.RegionSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RegionSummary region;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid LocationName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid LocationGameIndex> gameIndices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid LocationAreaSummary> areas = new ArrayList<>();
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
  public LocationDetail id(Integer id) {
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
  public LocationDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get region
  * @return region
  */
  @JsonProperty("region")
  @NotNull
  public RegionSummary getRegion() {
    return region;
  }

  /**
   * Sets the <code>region</code> property.
   */
 public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   * Sets the <code>region</code> property.
   */
  public LocationDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid LocationName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid LocationName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public LocationDetail names(List<@Valid LocationName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public LocationDetail addNamesItem(LocationName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get gameIndices
  * @return gameIndices
  */
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid LocationGameIndex> getGameIndices() {
    return gameIndices;
  }

  /**
   * Sets the <code>gameIndices</code> property.
   */
 public void setGameIndices(List<@Valid LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   * Sets the <code>gameIndices</code> property.
   */
  public LocationDetail gameIndices(List<@Valid LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  /**
   * Adds a new item to the <code>gameIndices</code> list.
   */
  public LocationDetail addGameIndicesItem(LocationGameIndex gameIndicesItem) {
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

 /**
  * Get areas
  * @return areas
  */
  @JsonProperty("areas")
  @NotNull
  public List<@Valid LocationAreaSummary> getAreas() {
    return areas;
  }

  /**
   * Sets the <code>areas</code> property.
   */
 public void setAreas(List<@Valid LocationAreaSummary> areas) {
    this.areas = areas;
  }

  /**
   * Sets the <code>areas</code> property.
   */
  public LocationDetail areas(List<@Valid LocationAreaSummary> areas) {
    this.areas = areas;
    return this;
  }

  /**
   * Adds a new item to the <code>areas</code> list.
   */
  public LocationDetail addAreasItem(LocationAreaSummary areasItem) {
    this.areas.add(areasItem);
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
    LocationDetail locationDetail = (LocationDetail) o;
    return Objects.equals(this.id, locationDetail.id) &&
        Objects.equals(this.name, locationDetail.name) &&
        Objects.equals(this.region, locationDetail.region) &&
        Objects.equals(this.names, locationDetail.names) &&
        Objects.equals(this.gameIndices, locationDetail.gameIndices) &&
        Objects.equals(this.areas, locationDetail.areas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, region, names, gameIndices, areas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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

