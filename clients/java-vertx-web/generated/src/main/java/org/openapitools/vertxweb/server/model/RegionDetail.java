package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.vertxweb.server.model.GenerationSummary;
import org.openapitools.vertxweb.server.model.LocationSummary;
import org.openapitools.vertxweb.server.model.PokedexSummary;
import org.openapitools.vertxweb.server.model.RegionName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RegionDetail   {
  
  private Integer id;
  private String name;
  private List<LocationSummary> locations = new ArrayList<>();
  private GenerationSummary mainGeneration;
  private List<RegionName> names = new ArrayList<>();
  private List<PokedexSummary> pokedexes = new ArrayList<>();
  private List<AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public RegionDetail () {

  }

  public RegionDetail (Integer id, String name, List<LocationSummary> locations, GenerationSummary mainGeneration, List<RegionName> names, List<PokedexSummary> pokedexes, List<AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.id = id;
    this.name = name;
    this.locations = locations;
    this.mainGeneration = mainGeneration;
    this.names = names;
    this.pokedexes = pokedexes;
    this.versionGroups = versionGroups;
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

    
  @JsonProperty("locations")
  public List<LocationSummary> getLocations() {
    return locations;
  }
  public void setLocations(List<LocationSummary> locations) {
    this.locations = locations;
  }

    
  @JsonProperty("main_generation")
  public GenerationSummary getMainGeneration() {
    return mainGeneration;
  }
  public void setMainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
  }

    
  @JsonProperty("names")
  public List<RegionName> getNames() {
    return names;
  }
  public void setNames(List<RegionName> names) {
    this.names = names;
  }

    
  @JsonProperty("pokedexes")
  public List<PokedexSummary> getPokedexes() {
    return pokedexes;
  }
  public void setPokedexes(List<PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

    
  @JsonProperty("version_groups")
  public List<AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }
  public void setVersionGroups(List<AbilityDetailPokemonInnerPokemon> versionGroups) {
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
    return Objects.equals(id, regionDetail.id) &&
        Objects.equals(name, regionDetail.name) &&
        Objects.equals(locations, regionDetail.locations) &&
        Objects.equals(mainGeneration, regionDetail.mainGeneration) &&
        Objects.equals(names, regionDetail.names) &&
        Objects.equals(pokedexes, regionDetail.pokedexes) &&
        Objects.equals(versionGroups, regionDetail.versionGroups);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
