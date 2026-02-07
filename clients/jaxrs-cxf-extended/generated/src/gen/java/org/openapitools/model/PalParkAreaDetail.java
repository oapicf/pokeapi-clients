package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PalParkAreaDetailPokemonEncountersInner;
import org.openapitools.model.PalParkAreaName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PalParkAreaDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PalParkAreaName> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PalParkAreaDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public PalParkAreaDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid PalParkAreaName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid PalParkAreaName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public PalParkAreaDetail names(List<@Valid PalParkAreaName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public PalParkAreaDetail addNamesItem(PalParkAreaName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get pokemonEncounters
  * @return pokemonEncounters
  */
  @JsonProperty("pokemon_encounters")
  @NotNull
  public List<@Valid PalParkAreaDetailPokemonEncountersInner> getPokemonEncounters() {
    return pokemonEncounters;
  }

  /**
   * Sets the <code>pokemonEncounters</code> property.
   */
 public void setPokemonEncounters(List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
  }

  /**
   * Sets the <code>pokemonEncounters</code> property.
   */
  public PalParkAreaDetail pokemonEncounters(List<@Valid PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
    return this;
  }

  /**
   * Adds a new item to the <code>pokemonEncounters</code> list.
   */
  public PalParkAreaDetail addPokemonEncountersItem(PalParkAreaDetailPokemonEncountersInner pokemonEncountersItem) {
    this.pokemonEncounters.add(pokemonEncountersItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

