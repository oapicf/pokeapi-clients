package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.LocationAreaSummary;
import com.prokarma.pkmst.model.LocationGameIndex;
import com.prokarma.pkmst.model.LocationName;
import com.prokarma.pkmst.model.RegionSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LocationDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class LocationDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("region")
  private RegionSummary region;

  @JsonProperty("names")
  
  private List<LocationName> names = new ArrayList<>();

  @JsonProperty("game_indices")
  
  private List<LocationGameIndex> gameIndices = new ArrayList<>();

  @JsonProperty("areas")
  
  private List<LocationAreaSummary> areas = new ArrayList<>();

  public LocationDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocationDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocationDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

  /**
   * The region this location can be found in.
   * @return region
   */
  @ApiModelProperty(required = true, value = "The region this location can be found in.")
  public RegionSummary getRegion() {
    return region;
  }

  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  public LocationDetail names(List<LocationName> names) {
    this.names = names;
    return this;
  }

  public LocationDetail addNamesItem(LocationName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The name of this resource listed in different languages.")
  public List<LocationName> getNames() {
    return names;
  }

  public void setNames(List<LocationName> names) {
    this.names = names;
  }

  public LocationDetail gameIndices(List<LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public LocationDetail addGameIndicesItem(LocationGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

  /**
   * A list of game indices relevent to this location by generation.
   * @return gameIndices
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of game indices relevent to this location by generation.")
  public List<LocationGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public LocationDetail areas(List<LocationAreaSummary> areas) {
    this.areas = areas;
    return this;
  }

  public LocationDetail addAreasItem(LocationAreaSummary areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
    this.areas.add(areasItem);
    return this;
  }

  /**
   * Areas that can be found within this location.
   * @return areas
   */
  @ApiModelProperty(required = true, readOnly = true, value = "Areas that can be found within this location.")
  public List<LocationAreaSummary> getAreas() {
    return areas;
  }

  public void setAreas(List<LocationAreaSummary> areas) {
    this.areas = areas;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

