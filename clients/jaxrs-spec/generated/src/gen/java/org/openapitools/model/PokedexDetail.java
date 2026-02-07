package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.model.PokedexDescription;
import org.openapitools.model.PokedexDetailPokemonEntriesInner;
import org.openapitools.model.PokedexName;
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



@JsonTypeName("PokedexDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T15:24:06.001755207Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PokedexDetail   {
  private Integer id;
  private String name;
  private Boolean isMainSeries;
  private @Valid List<@Valid PokedexDescription> descriptions = new ArrayList<>();
  private @Valid List<@Valid PokedexName> names = new ArrayList<>();
  private @Valid List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries = new ArrayList<>();
  private RegionSummary region;
  private @Valid List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups = new ArrayList<>();

  public PokedexDetail() {
  }

  @JsonCreator
  public PokedexDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "descriptions") List<@Valid PokedexDescription> descriptions,
    @JsonProperty(required = true, value = "names") List<@Valid PokedexName> names,
    @JsonProperty(required = true, value = "pokemon_entries") List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries,
    @JsonProperty(required = true, value = "region") RegionSummary region,
    @JsonProperty(required = true, value = "version_groups") List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups
  ) {
    this.id = id;
    this.name = name;
    this.descriptions = descriptions;
    this.names = names;
    this.pokemonEntries = pokemonEntries;
    this.region = region;
    this.versionGroups = versionGroups;
  }

  /**
   **/
  public PokedexDetail id(Integer id) {
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
  public PokedexDetail name(String name) {
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
  public PokedexDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  @JsonProperty("is_main_series")
  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  /**
   **/
  public PokedexDetail descriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "descriptions")
  @NotNull @Valid public List<@Valid PokedexDescription> getDescriptions() {
    return descriptions;
  }

  @JsonProperty(required = true, value = "descriptions")
  public void setDescriptions(List<@Valid PokedexDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public PokedexDetail addDescriptionsItem(PokedexDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }

    this.descriptions.add(descriptionsItem);
    return this;
  }

  public PokedexDetail removeDescriptionsItem(PokedexDescription descriptionsItem) {
    if (descriptionsItem != null && this.descriptions != null) {
      this.descriptions.remove(descriptionsItem);
    }

    return this;
  }
  /**
   **/
  public PokedexDetail names(List<@Valid PokedexName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid PokedexName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid PokedexName> names) {
    this.names = names;
  }

  public PokedexDetail addNamesItem(PokedexName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public PokedexDetail removeNamesItem(PokedexName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   **/
  public PokedexDetail pokemonEntries(List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokemon_entries")
  @NotNull @Valid public List<@Valid PokedexDetailPokemonEntriesInner> getPokemonEntries() {
    return pokemonEntries;
  }

  @JsonProperty(required = true, value = "pokemon_entries")
  public void setPokemonEntries(List<@Valid PokedexDetailPokemonEntriesInner> pokemonEntries) {
    this.pokemonEntries = pokemonEntries;
  }

  public PokedexDetail addPokemonEntriesItem(PokedexDetailPokemonEntriesInner pokemonEntriesItem) {
    if (this.pokemonEntries == null) {
      this.pokemonEntries = new ArrayList<>();
    }

    this.pokemonEntries.add(pokemonEntriesItem);
    return this;
  }

  public PokedexDetail removePokemonEntriesItem(PokedexDetailPokemonEntriesInner pokemonEntriesItem) {
    if (pokemonEntriesItem != null && this.pokemonEntries != null) {
      this.pokemonEntries.remove(pokemonEntriesItem);
    }

    return this;
  }
  /**
   **/
  public PokedexDetail region(RegionSummary region) {
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
  public PokedexDetail versionGroups(List<@Valid AbilityDetailPokemonInnerPokemon> versionGroups) {
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

  public PokedexDetail addVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
    if (this.versionGroups == null) {
      this.versionGroups = new ArrayList<>();
    }

    this.versionGroups.add(versionGroupsItem);
    return this;
  }

  public PokedexDetail removeVersionGroupsItem(AbilityDetailPokemonInnerPokemon versionGroupsItem) {
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
    PokedexDetail pokedexDetail = (PokedexDetail) o;
    return Objects.equals(this.id, pokedexDetail.id) &&
        Objects.equals(this.name, pokedexDetail.name) &&
        Objects.equals(this.isMainSeries, pokedexDetail.isMainSeries) &&
        Objects.equals(this.descriptions, pokedexDetail.descriptions) &&
        Objects.equals(this.names, pokedexDetail.names) &&
        Objects.equals(this.pokemonEntries, pokedexDetail.pokemonEntries) &&
        Objects.equals(this.region, pokedexDetail.region) &&
        Objects.equals(this.versionGroups, pokedexDetail.versionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isMainSeries, descriptions, names, pokemonEntries, region, versionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokedexDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonEntries: ").append(toIndentedString(pokemonEntries)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

