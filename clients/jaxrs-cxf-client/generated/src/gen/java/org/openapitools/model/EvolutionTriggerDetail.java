package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EvolutionTriggerName;
import org.openapitools.model.PokemonSpeciesSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EvolutionTriggerDetail  {
  
 /**
  * The identifier for this resource.
  */
  @ApiModelProperty(required = true, value = "The identifier for this resource.")

  private Integer id;

 /**
  * The name for this resource.
  */
  @ApiModelProperty(required = true, value = "The name for this resource.")

  private String name;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<EvolutionTriggerName> names = new ArrayList<>();

 /**
  * A list of pokemon species that result from this evolution trigger.
  */
  @ApiModelProperty(required = true, value = "A list of pokemon species that result from this evolution trigger.")

  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EvolutionTriggerDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  public List<EvolutionTriggerName> getNames() {
    return names;
  }


 /**
   * A list of pokemon species that result from this evolution trigger.
   * @return pokemonSpecies
  **/
  @JsonProperty("pokemon_species")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

