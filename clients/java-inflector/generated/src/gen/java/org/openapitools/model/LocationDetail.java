package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.LocationGameIndex;
import org.openapitools.model.LocationName;
import org.openapitools.model.RegionSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   **/
  public LocationDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public LocationDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public LocationDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  /**
   **/
  public LocationDetail names(List<LocationName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<LocationName> getNames() {
    return names;
  }
  public void setNames(List<LocationName> names) {
    this.names = names;
  }

  /**
   **/
  public LocationDetail gameIndices(List<LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_indices")
  public List<LocationGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  /**
   **/
  public LocationDetail areas(List<LocationAreaSummary> areas) {
    this.areas = areas;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("areas")
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
    return Objects.equals(id, locationDetail.id) &&
        Objects.equals(name, locationDetail.name) &&
        Objects.equals(region, locationDetail.region) &&
        Objects.equals(names, locationDetail.names) &&
        Objects.equals(gameIndices, locationDetail.gameIndices) &&
        Objects.equals(areas, locationDetail.areas);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

