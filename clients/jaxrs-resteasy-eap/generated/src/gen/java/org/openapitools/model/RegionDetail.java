package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.GenerationSummary;
import org.openapitools.model.LocationSummary;
import org.openapitools.model.PokedexSummary;
import org.openapitools.model.RegionName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RegionDetail   {
  
  private Integer id;
  private String name;
  private List<@Valid LocationSummary> locations = new ArrayList<>();
  private GenerationSummary mainGeneration;
  private List<@Valid RegionName> names = new ArrayList<>();
  private List<@Valid PokedexSummary> pokedexes = new ArrayList<>();
  private List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("locations")
  @NotNull
  public List<@Valid LocationSummary> getLocations() {
    return locations;
  }
  public void setLocations(List<@Valid LocationSummary> locations) {
    this.locations = locations;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("main_generation")
  @NotNull
  public GenerationSummary getMainGeneration() {
    return mainGeneration;
  }
  public void setMainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  @NotNull
  public List<@Valid RegionName> getNames() {
    return names;
  }
  public void setNames(List<@Valid RegionName> names) {
    this.names = names;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokedexes")
  @NotNull
  public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }
  public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_groups")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }
  public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

