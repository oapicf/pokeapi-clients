package org.openapitools.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("LocationDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationDetail   {
  private Integer id;
  private String name;
  private RegionSummary region;
  private @Valid List<@Valid LocationName> names = new ArrayList<>();
  private @Valid List<@Valid LocationGameIndex> gameIndices = new ArrayList<>();
  private @Valid List<@Valid LocationAreaSummary> areas = new ArrayList<>();

  public LocationDetail() {
  }

  @JsonCreator
  public LocationDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "region") RegionSummary region,
    @JsonProperty(required = true, value = "names") List<@Valid LocationName> names,
    @JsonProperty(required = true, value = "game_indices") List<@Valid LocationGameIndex> gameIndices,
    @JsonProperty(required = true, value = "areas") List<@Valid LocationAreaSummary> areas
  ) {
    this.id = id;
    this.name = name;
    this.region = region;
    this.names = names;
    this.gameIndices = gameIndices;
    this.areas = areas;
  }

  /**
   **/
  public LocationDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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
  @JsonProperty(required = true, value = "region")
  @NotNull @Valid public RegionSummary getRegion() {
    return region;
  }

  @JsonProperty(required = true, value = "region")
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
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid LocationName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
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

  public LocationDetail removeNamesItem(LocationName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   **/
  public LocationDetail gameIndices(List<@Valid LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "game_indices")
  @NotNull @Valid public List<@Valid LocationGameIndex> getGameIndices() {
    return gameIndices;
  }

  @JsonProperty(required = true, value = "game_indices")
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

  public LocationDetail removeGameIndicesItem(LocationGameIndex gameIndicesItem) {
    if (gameIndicesItem != null && this.gameIndices != null) {
      this.gameIndices.remove(gameIndicesItem);
    }

    return this;
  }
  /**
   **/
  public LocationDetail areas(List<@Valid LocationAreaSummary> areas) {
    this.areas = areas;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "areas")
  @NotNull @Valid public List<@Valid LocationAreaSummary> getAreas() {
    return areas;
  }

  @JsonProperty(required = true, value = "areas")
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

  public LocationDetail removeAreasItem(LocationAreaSummary areasItem) {
    if (areasItem != null && this.areas != null) {
      this.areas.remove(areasItem);
    }

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

