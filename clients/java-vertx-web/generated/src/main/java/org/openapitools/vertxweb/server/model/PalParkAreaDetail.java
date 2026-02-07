package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PalParkAreaDetailPokemonEncountersInner;
import org.openapitools.vertxweb.server.model.PalParkAreaName;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PalParkAreaDetail   {
  
  private Integer id;
  private String name;
  private List<PalParkAreaName> names = new ArrayList<>();
  private List<PalParkAreaDetailPokemonEncountersInner> pokemonEncounters = new ArrayList<>();

  public PalParkAreaDetail () {

  }

  public PalParkAreaDetail (Integer id, String name, List<PalParkAreaName> names, List<PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.id = id;
    this.name = name;
    this.names = names;
    this.pokemonEncounters = pokemonEncounters;
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

    
  @JsonProperty("names")
  public List<PalParkAreaName> getNames() {
    return names;
  }
  public void setNames(List<PalParkAreaName> names) {
    this.names = names;
  }

    
  @JsonProperty("pokemon_encounters")
  public List<PalParkAreaDetailPokemonEncountersInner> getPokemonEncounters() {
    return pokemonEncounters;
  }
  public void setPokemonEncounters(List<PalParkAreaDetailPokemonEncountersInner> pokemonEncounters) {
    this.pokemonEncounters = pokemonEncounters;
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
    return Objects.equals(id, palParkAreaDetail.id) &&
        Objects.equals(name, palParkAreaDetail.name) &&
        Objects.equals(names, palParkAreaDetail.names) &&
        Objects.equals(pokemonEncounters, palParkAreaDetail.pokemonEncounters);
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
