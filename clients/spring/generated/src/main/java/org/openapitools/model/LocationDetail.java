package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LocationAreaSummary;
import org.openapitools.model.LocationGameIndex;
import org.openapitools.model.LocationName;
import org.openapitools.model.RegionSummary;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LocationDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-07T04:22:27.168374474Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class LocationDetail {

  private Integer id;

  private String name;

  private RegionSummary region;

  @Valid
  private List<@Valid LocationName> names = new ArrayList<>();

  @Valid
  private List<@Valid LocationGameIndex> gameIndices = new ArrayList<>();

  @Valid
  private List<@Valid LocationAreaSummary> areas = new ArrayList<>();

  public LocationDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LocationDetail(Integer id, String name, RegionSummary region, List<@Valid LocationName> names, List<@Valid LocationGameIndex> gameIndices, List<@Valid LocationAreaSummary> areas) {
    this.id = id;
    this.name = name;
    this.region = region;
    this.names = names;
    this.gameIndices = gameIndices;
    this.areas = areas;
  }

  public LocationDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   * Get name
   * @return name
   */
  @NotNull @Size(max = 100) 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   * Get region
   * @return region
   */
  @NotNull @Valid 
  @Schema(name = "region", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("region")
  public RegionSummary getRegion() {
    return region;
  }

  public void setRegion(RegionSummary region) {
    this.region = region;
  }

  public LocationDetail names(List<@Valid LocationName> names) {
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
   * Get names
   * @return names
   */
  @NotNull @Valid 
  @Schema(name = "names", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid LocationName> getNames() {
    return names;
  }

  public void setNames(List<@Valid LocationName> names) {
    this.names = names;
  }

  public LocationDetail gameIndices(List<@Valid LocationGameIndex> gameIndices) {
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
   * Get gameIndices
   * @return gameIndices
   */
  @NotNull @Valid 
  @Schema(name = "game_indices", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("game_indices")
  public List<@Valid LocationGameIndex> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<@Valid LocationGameIndex> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public LocationDetail areas(List<@Valid LocationAreaSummary> areas) {
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
   * Get areas
   * @return areas
   */
  @NotNull @Valid 
  @Schema(name = "areas", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areas")
  public List<@Valid LocationAreaSummary> getAreas() {
    return areas;
  }

  public void setAreas(List<@Valid LocationAreaSummary> areas) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

