package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.LocationAreaSummary;
import org.openapitools.vertxweb.server.model.LocationGameIndex;
import org.openapitools.vertxweb.server.model.LocationName;
import org.openapitools.vertxweb.server.model.RegionSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationDetail   {
  
  private Integer id;
  private String name;
  private RegionSummary region;
  private List<LocationName> names = new ArrayList<>();
  private List<LocationGameIndex> gameIndices = new ArrayList<>();
  private List<LocationAreaSummary> areas = new ArrayList<>();

  public LocationDetail () {

  }

  public LocationDetail (Integer id, String name, RegionSummary region, List<LocationName> names, List<LocationGameIndex> gameIndices, List<LocationAreaSummary> areas) {
    this.id = id;
    this.name = name;
    this.region = region;
    this.names = names;
    this.gameIndices = gameIndices;
    this.areas = areas;
  }

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }
  public void setRegion(RegionSummary region) {
    this.region = region;
  }

    
  @JsonProperty("names")
  public List<LocationName> getNames() {
    return names;
  }
  public void setNames(List<LocationName> names) {
    this.names = names;
  }

    
  @JsonProperty("game_indices")
  public List<LocationGameIndex> getGameIndices() {
    return gameIndices;
  }
  public void setGameIndices(List<LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

    
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
