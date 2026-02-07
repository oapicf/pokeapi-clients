package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("RegionDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RegionDetail   {
  private Integer id;
  private String name;
  private @Valid List<@Valid LocationSummary> locations = new ArrayList<>();
  private GenerationSummary mainGeneration;
  private @Valid List<@Valid RegionName> names = new ArrayList<>();
  private @Valid List<@Valid PokedexSummary> pokedexes = new ArrayList<>();
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public RegionDetail() {
  }

  @JsonCreator
  public RegionDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "locations") List<@Valid LocationSummary> locations,
    @JsonProperty(required = true, value = "main_generation") GenerationSummary mainGeneration,
    @JsonProperty(required = true, value = "names") List<@Valid RegionName> names,
    @JsonProperty(required = true, value = "pokedexes") List<@Valid PokedexSummary> pokedexes,
    @JsonProperty(required = true, value = "version_groups") List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups
  ) {
    this.id = id;
    this.name = name;
    this.locations = locations;
    this.mainGeneration = mainGeneration;
    this.names = names;
    this.pokedexes = pokedexes;
    this.versionGroups = versionGroups;
  }

  /**
   **/
  public RegionDetail id(Integer id) {
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
  public RegionDetail name(String name) {
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
  public RegionDetail locations(List<@Valid LocationSummary> locations) {
    this.locations = locations;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "locations")
  @NotNull @Valid public List<@Valid LocationSummary> getLocations() {
    return locations;
  }

  @JsonProperty(required = true, value = "locations")
  public void setLocations(List<@Valid LocationSummary> locations) {
    this.locations = locations;
  }

  public RegionDetail addLocationsItem(LocationSummary locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }

    this.locations.add(locationsItem);
    return this;
  }

  public RegionDetail removeLocationsItem(LocationSummary locationsItem) {
    if (locationsItem != null && this.locations != null) {
      this.locations.remove(locationsItem);
    }

    return this;
  }
  /**
   **/
  public RegionDetail mainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "main_generation")
  @Valid public GenerationSummary getMainGeneration() {
    return mainGeneration;
  }

  @JsonProperty(required = true, value = "main_generation")
  public void setMainGeneration(GenerationSummary mainGeneration) {
    this.mainGeneration = mainGeneration;
  }

  /**
   **/
  public RegionDetail names(List<@Valid RegionName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid RegionName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid RegionName> names) {
    this.names = names;
  }

  public RegionDetail addNamesItem(RegionName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public RegionDetail removeNamesItem(RegionName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   **/
  public RegionDetail pokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokedexes")
  @NotNull @Valid public List<@Valid PokedexSummary> getPokedexes() {
    return pokedexes;
  }

  @JsonProperty(required = true, value = "pokedexes")
  public void setPokedexes(List<@Valid PokedexSummary> pokedexes) {
    this.pokedexes = pokedexes;
  }

  public RegionDetail addPokedexesItem(PokedexSummary pokedexesItem) {
    if (this.pokedexes == null) {
      this.pokedexes = new ArrayList<>();
    }

    this.pokedexes.add(pokedexesItem);
    return this;
  }

  public RegionDetail removePokedexesItem(PokedexSummary pokedexesItem) {
    if (pokedexesItem != null && this.pokedexes != null) {
      this.pokedexes.remove(pokedexesItem);
    }

    return this;
  }
  /**
   **/
  public RegionDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "version_groups")
  @NotNull @Valid public List<@Valid AbilityDetailPokemonInnerPokemon> getVersionGroups() {
    return versionGroups;
  }

  @JsonProperty(required = true, value = "version_groups")
  public void setVersionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
    this.versionGroups = versionGroups;
  }

  public RegionDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }

    this.versionGroups.add(versionGroupsItem);
    return this;
  }

  public RegionDetail removeVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
    if (versionGroupsItem != null && this.versionGroups != null) {
      this.versionGroups.remove(versionGroupsItem);
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

