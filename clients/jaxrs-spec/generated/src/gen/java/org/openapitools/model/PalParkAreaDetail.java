package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PalParkAreaName;
import org.openapitools.model.PalParkEncounter;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PalParkAreaDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PalParkAreaDetail   {
  private Integer id;
  private String name;
  private List<@Valid PalParkAreaName> names = new ArrayList<>();
  private List<@Valid PalParkEncounter> pokemonEncounters = new ArrayList<>();

  public PalParkAreaDetail() {
  }

  @JsonCreator
  public PalParkAreaDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "names") List<@Valid PalParkAreaName> names,
    @JsonProperty(required = true, value = "pokemon_encounters") List<@Valid PalParkEncounter> pokemonEncounters
  ) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.pokemonEncounters = pokemonEncounters;
  }

  /**
   * The identifier for this resource.
   **/
  public PalParkAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public PalParkAreaDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The name of this resource listed in different languages.
   **/
  public PalParkAreaDetail names(List<@Valid PalParkAreaName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")
  @JsonProperty(required = true, value = "names")
  public List<@Valid PalParkAreaName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid PalParkAreaName> names) {
    this.names = names;
  }

  public PalParkAreaDetail addNamesItem(PalParkAreaName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public PalParkAreaDetail removeNamesItem(PalParkAreaName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   * A list of Pokémon encountered in thi pal park area along with details.
   **/
  public PalParkAreaDetail pokemonEncounters(List<@Valid PalParkEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of Pokémon encountered in thi pal park area along with details.")
  @JsonProperty(required = true, value = "pokemon_encounters")
  public List<@Valid PalParkEncounter> getPokemonEncounters() {
    return pokemonEncounters;
  }

  @JsonProperty(required = true, value = "pokemon_encounters")
  public void setPokemonEncounters(List<@Valid PalParkEncounter> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }

  public PalParkAreaDetail addPokemonEncountersItem(PalParkEncounter pokemonEncountersItem) {
    if (this.pokemonEncounters == null) {
      this.pokemonEncounters = new ArrayList<>();
    }

    this.pokemonEncounters.add(pokemonEncountersItem);
    return this;
  }

  public PalParkAreaDetail removePokemonEncountersItem(PalParkEncounter pokemonEncountersItem) {
    if (pokemonEncountersItem != null && this.pokemonEncounters != null) {
      this.pokemonEncounters.remove(pokemonEncountersItem);
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
    PalParkAreaDetail palParkAreaDetail = (PalParkAreaDetail) o;
    return Objects.equals(this.id, palParkAreaDetail.id) &&
        Objects.equals(this.name, palParkAreaDetail.name) &&
        Objects.equals(this.names, palParkAreaDetail.names) &&
        Objects.equals(this.pokemonEncounters, palParkAreaDetail.pokemonEncounters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, pokemonEncounters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalParkAreaDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonEncounters: ").append(toIndentedString(pokemonEncounters)).append("\n");
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
