package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PalParkAreaDetailPokemonEncountersInner;
import org.openapitools.model.PalParkAreaName;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PalParkAreaDetail   {
  private Integer id;
  private String name;
  private @Valid List<@Valid PalParkAreaName> names = new ArrayList<>();
  private @Valid List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

  public PalParkAreaDetail() {
  }

  @JsonCreator
  public PalParkAreaDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "names") List<@Valid PalParkAreaName> names,
    @JsonProperty(required = true, value = "pokemon_encounters") List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters
  ) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.pokemonEncounters = pokemonEncounters;
  }

  /**
   **/
  public PalParkAreaDetail id(Integer id) {
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
  public PalParkAreaDetail name(String name) {
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
  public PalParkAreaDetail names(List<@Valid PalParkAreaName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid PalParkAreaName> getNames() {
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
   **/
  public PalParkAreaDetail pokemonEncounters(List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "pokemon_encounters")
  @NotNull @Valid public List<@Valid PalParkAreaDetailPokemonEncountersInner> getPokemonEncounters() {
    return pokemonEncounters;
  }

  @JsonProperty(required = true, value = "pokemon_encounters")
  public void setPokemonEncounters(List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }

  public PalParkAreaDetail addPokemonEncountersItem(PalParkAreaDetailPokemonEncountersInner pokemonEncountersItem) {
    if (this.pokemonEncounters == null) {
      this.pokemonEncounters = new ArrayList<>();
    }

    this.pokemonEncounters.add(pokemonEncountersItem);
    return this;
  }

  public PalParkAreaDetail removePokemonEncountersItem(PalParkAreaDetailPokemonEncountersInner pokemonEncountersItem) {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

