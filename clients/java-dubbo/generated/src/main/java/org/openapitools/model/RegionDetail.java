package org.openapitools.model;

import org.openapitools.model.GenerationSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionName;
import org.openapitools.model.VersionGroupSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class RegionDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * A list of locations that can be found in this region.
   */
  @JsonProperty("locations")
  private List<LocationSummary> locations = new ArrayList<>();

  /**
   * The generation this region was introduced in.
   */
  @JsonProperty("main_generation")
  private GenerationSummary mainGeneration;

  /**
   * The name of this resource listed in different languages.
   */
  @JsonProperty("names")
  private List<RegionName> names = new ArrayList<>();

  /**
   * A list of pokédexes that catalogue Pokémon in this region.
   */
  @JsonProperty("pokedexes")
  private List<PokedexSummary> pokedexes = new ArrayList<>();

  /**
   * A list of version groups where this region can be visited.
   */
  @JsonProperty("version_groups")
  private List<VersionGroupSummary> versionGroups = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of locations that can be found in this region.
   * @return locations
   */
  public List<LocationSummary> getLocations() {
    return locations;
  }

  public void setLocations(List<LocationSummary> locations) {
    this.locations = locations;
  }

  /**
   * The generation this region was introduced in.
   * @return mainGeneration
   */
  public GenerationSummary getMainGeneration() {
    return mainGeneration;
  }

  public void setMainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
  }

  /**
   * The name of this resource listed in different languages.
   * @return names
   */
  public List<RegionName> getNames() {
    return names;
  }

  public void setNames(List<RegionName> names) {
    this.names = names;
  }

  /**
   * A list of pokédexes that catalogue Pokémon in this region.
   * @return pokedexes
   */
  public List<PokedexSummary> getPokedexes() {
    return pokedexes;
  }

  public void setPokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  /**
   * A list of version groups where this region can be visited.
   * @return versionGroups
   */
  public List<VersionGroupSummary> getVersionGroups() {
    return versionGroups;
  }

  public void setVersionGroups(List<VersionGroupSummary> versionGroups) {
    this.versionGroups = versionGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionDetail regionDetail = (RegionDetail) o;
    return Objects.equals(this.id, regionDetail.id) &&
        Objects.equals(this.name, regionDetail.name) &&
        Objects.equals(this.locations, regionDetail.locations) &&
        Objects.equals(this.mainGeneration, regionDetail.mainGeneration) &&
        Objects.equals(this.names, regionDetail.names) &&
        Objects.equals(this.pokedexes, regionDetail.pokedexes) &&
        Objects.equals(this.versionGroups, regionDetail.versionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, locations, mainGeneration, names, pokedexes, versionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    mainGeneration: ").append(toIndentedString(mainGeneration)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokedexes: ").append(toIndentedString(pokedexes)).append("\n");
    sb.append("    versionGroups: ").append(toIndentedString(versionGroups)).append("\n");
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
