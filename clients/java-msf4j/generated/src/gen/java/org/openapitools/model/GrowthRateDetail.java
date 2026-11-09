package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Experience;
import org.openapitools.model.GrowthRateDescription;
import org.openapitools.model.PokemonSpeciesSummary;

/**
 * GrowthRateDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GrowthRateDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("formula")
  private String formula;

  @JsonProperty("descriptions")
  private List<@Valid GrowthRateDescription> descriptions = new ArrayList<>();

  @JsonProperty("levels")
  private List<@Valid Experience> levels = new ArrayList<>();

  @JsonProperty("pokemon_species")
  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public GrowthRateDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this resource.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GrowthRateDetail formula(String formula) {
    this.formula = formula;
    return this;
  }

   /**
   * The formula used to calculate the rate at which the Pokémon species gains level.
   * @return formula
  **/
  @ApiModelProperty(required = true, value = "The formula used to calculate the rate at which the Pokémon species gains level.")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

   /**
   * The descriptions of this characteristic listed in different languages.
   * @return descriptions
  **/
  @ApiModelProperty(required = true, value = "The descriptions of this characteristic listed in different languages.")
  public List<@Valid GrowthRateDescription> getDescriptions() {
    return descriptions;
  }

   /**
   * A list of levels and the amount of experienced needed to atain them based on this growth rate.
   * @return levels
  **/
  @ApiModelProperty(required = true, value = "A list of levels and the amount of experienced needed to atain them based on this growth rate.")
  public List<@Valid Experience> getLevels() {
    return levels;
  }

   /**
   * A list of Pokémon species that gain levels at this growth rate.
   * @return pokemonSpecies
  **/
  @ApiModelProperty(required = true, value = "A list of Pokémon species that gain levels at this growth rate.")
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
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

