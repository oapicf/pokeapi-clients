package org.openapitools.model;

import org.openapitools.model.Experience;
import org.openapitools.model.GrowthRateDescription;
import org.openapitools.model.PokemonSpeciesSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class GrowthRateDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The formula used to calculate the rate at which the Pokémon species gains level.
   */
  @JsonProperty("formula")
  private String formula;

  /**
   * The descriptions of this characteristic listed in different languages.
   */
  @JsonProperty("descriptions")
  private List<GrowthRateDescription> descriptions = new ArrayList<>();

  /**
   * A list of levels and the amount of experienced needed to atain them based on this growth rate.
   */
  @JsonProperty("levels")
  private List<Experience> levels = new ArrayList<>();

  /**
   * A list of Pokémon species that gain levels at this growth rate.
   */
  @JsonProperty("pokemon_species")
  private List<PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The formula used to calculate the rate at which the Pokémon species gains level.
   * @return formula
   */
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  /**
   * The descriptions of this characteristic listed in different languages.
   * @return descriptions
   */
  public List<GrowthRateDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<GrowthRateDescription> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * A list of levels and the amount of experienced needed to atain them based on this growth rate.
   * @return levels
   */
  public List<Experience> getLevels() {
    return levels;
  }

  public void setLevels(List<Experience> levels) {
    this.levels = levels;
  }

  /**
   * A list of Pokémon species that gain levels at this growth rate.
   * @return pokemonSpecies
   */
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
    return Objects.equals(this.id, growthRateDetail.id) &&
        Objects.equals(this.name, growthRateDetail.name) &&
        Objects.equals(this.formula, growthRateDetail.formula) &&
        Objects.equals(this.descriptions, growthRateDetail.descriptions) &&
        Objects.equals(this.levels, growthRateDetail.levels) &&
        Objects.equals(this.pokemonSpecies, growthRateDetail.pokemonSpecies);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
