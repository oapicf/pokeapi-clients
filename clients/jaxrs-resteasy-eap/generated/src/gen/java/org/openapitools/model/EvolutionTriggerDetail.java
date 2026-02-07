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
import org.openapitools.model.EvolutionTriggerName;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-02-07T04:17:52.397146649Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class EvolutionTriggerDetail   {
  
  private Integer id;
  private String name;
  private List<@Valid EvolutionTriggerName> names = new ArrayList<>();
  private List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies = new ArrayList<>();

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
  @JsonProperty("names")
  @NotNull
  public List<@Valid EvolutionTriggerName> getNames() {
    return names;
  }
  public void setNames(List<@Valid EvolutionTriggerName> names) {
    this.names = names;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon_species")
  @NotNull
  public List<@Valid AbilityDetailPokemonInnerPokemon> getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(List<@Valid AbilityDetailPokemonInnerPokemon> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvolutionTriggerDetail evolutionTriggerDetail = (EvolutionTriggerDetail) o;
    return Objects.equals(this.id, evolutionTriggerDetail.id) &&
        Objects.equals(this.name, evolutionTriggerDetail.name) &&
        Objects.equals(this.names, evolutionTriggerDetail.names) &&
        Objects.equals(this.pokemonSpecies, evolutionTriggerDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, names, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvolutionTriggerDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    pokemonSpecies: ").append(toIndentedString(pokemonSpecies)).append("\n");
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

