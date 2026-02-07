package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.LocationGameIndex;
import org.openapitools.model.LocationName;
import org.openapitools.model.RegionSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LocationDetail  {
  
  @ApiModelProperty(required = true, value = "")

  private Integer id;

  @ApiModelProperty(required = true, value = "")

  private String name;

  @ApiModelProperty(required = true, value = "")

  private RegionSummary region;

  @ApiModelProperty(required = true, value = "")

  private List<LocationName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<LocationGameIndex> gameIndices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")

  private List<LocationAreaSummary> areas = new ArrayList<>();
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

  public LocationDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get region
   * @return region
  **/
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }

  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  public LocationDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

 /**
   * Get names
   * @return names
  **/
  @JsonProperty("names")
  public List<LocationName> getNames() {
    return names;
  }

  public void setNames(List<LocationName> names) {
    this.names = names;
  }

  public LocationDetail names(List<LocationName> names) {
    this.names = names;
    return this;
  }

  public LocationDetail addNamesItem(LocationName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
   * Get gameIndices
   * @return gameIndices
  **/
  @JsonProperty("game_indices")
  public List<LocationGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public LocationDetail gameIndices(List<LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public LocationDetail addGameIndicesItem(LocationGameIndex gameIndicesItem) {
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

 /**
   * Get areas
   * @return areas
  **/
  @JsonProperty("areas")
  public List<LocationAreaSummary> getAreas() {
    return areas;
  }

  public void setAreas(List<LocationAreaSummary> areas) {
    this.areas = areas;
  }

  public LocationDetail areas(List<LocationAreaSummary> areas) {
    this.areas = areas;
    return this;
  }

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

