package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class LocationDetail   {
  
  private Integer id;

  private String name;

  private RegionSummary region;

  private List<@Valid LocationName> names = new ArrayList<>();

  private List<@Valid LocationGameIndex> gameIndices = new ArrayList<>();

  private List<@Valid LocationAreaSummary> areas = new ArrayList<>();

  /**
   **/
  public LocationDetail id(Integer id) {
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
  public LocationDetail name(String name) {
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
  public LocationDetail region(RegionSummary region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("region")
  @NotNull
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }


  /**
   **/
  public LocationDetail names(List<@Valid LocationName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid LocationName> getNames() {
    return names;
  }
  public void setNames(List<@Valid LocationName> names) {
    this.names = names;
  }

  public LocationDetail addNamesItem(LocationName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }


  /**
   **/
  public LocationDetail gameIndices(List<@Valid LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("game_indices")
  @NotNull
  public List<@Valid LocationGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<@Valid LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public LocationDetail addGameIndicesItem(LocationGameIndex gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<>();
    }
    this.gameIndices.add(gameIndicesItem);
    return this;
  }


  /**
   **/
  public LocationDetail areas(List<@Valid LocationAreaSummary> areas) {
    this.areas = areas;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("areas")
  @NotNull
  public List<@Valid LocationAreaSummary> getAreas() {
    return areas;
  }
  public void setAreas(List<@Valid LocationAreaSummary> areas) {
    this.areas = areas;
  }

  public LocationDetail addAreasItem(LocationAreaSummary areasItem) {
    if (this.areas == null) {
      this.areas = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

