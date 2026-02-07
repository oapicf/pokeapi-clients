package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.Experience;
import org.openapitools.vertxweb.server.model.GrowthRateDescription;
import org.openapitools.vertxweb.server.model.PokemonSpeciesSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrowthRateDetail   {
  
  private Integer id;
  private String name;
  private String formula;
  private List<GrowthRateDescription> descriptions = new ArrayList<>();
  private List<Experience> levels = new ArrayList<>();
  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public GrowthRateDetail () {

  }

  public GrowthRateDetail (Integer id, String name, String formula, List<GrowthRateDescription> descriptions, List<Experience> levels, List<PokemonSpeciesSummary> pokemonSpecies) {
    this.id = id;
    this.name = name;
    this.formula = formula;
    this.descriptions = descriptions;
    this.levels = levels;
    this.pokemonSpecies = pokemonSpecies;
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

    
  @JsonProperty("formula")
  public String getFormula() {
    return formula;
  }
  public void setFormula(String formula) {
    this.formula = formula;
  }

    
  @JsonProperty("descriptions")
  public List<GrowthRateDescription> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<GrowthRateDescription> descriptions) {
    this.descriptions = descriptions;
  }

    
  @JsonProperty("levels")
  public List<Experience> getLevels() {
    return levels;
  }
  public void setLevels(List<Experience> levels) {
    this.levels = levels;
  }

    
  @JsonProperty("pokemon_species")
  public List<PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }
  public void setPokemonSpecies(List<PokemonSpeciesSummary> pokemonSpecies) {
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
    GrowthRateDetail growthRateDetail = (GrowthRateDetail) o;
    return Objects.equals(id, growthRateDetail.id) &&
        Objects.equals(name, growthRateDetail.name) &&
        Objects.equals(formula, growthRateDetail.formula) &&
        Objects.equals(descriptions, growthRateDetail.descriptions) &&
        Objects.equals(levels, growthRateDetail.levels) &&
        Objects.equals(pokemonSpecies, growthRateDetail.pokemonSpecies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, formula, descriptions, levels, pokemonSpecies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrowthRateDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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
