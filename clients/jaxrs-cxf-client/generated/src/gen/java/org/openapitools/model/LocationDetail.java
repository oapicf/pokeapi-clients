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
  * The region this location can be found in.
  */
  @ApiModelProperty(required = true, value = "The region this location can be found in.")

  private RegionSummary region;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<LocationName> names = new ArrayList<>();

 /**
  * A list of game indices relevent to this location by generation.
  */
  @ApiModelProperty(required = true, value = "A list of game indices relevent to this location by generation.")

  private List<LocationGameIndex> gameIndices = new ArrayList<>();

 /**
  * Areas that can be found within this location.
  */
  @ApiModelProperty(required = true, value = "Areas that can be found within this location.")

  private List<LocationAreaSummary> areas = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
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
   * The region this location can be found in.
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
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<LocationName> getNames() {
    return names;
  }


 /**
   * A list of game indices relevent to this location by generation.
   * @return gameIndices
  **/
  @JsonProperty("game_indices")
  public List<LocationGameIndex> getGameIndices() {
    return gameIndices;
  }


 /**
   * Areas that can be found within this location.
   * @return areas
  **/
  @JsonProperty("areas")
  public List<LocationAreaSummary> getAreas() {
    return areas;
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

