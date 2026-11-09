package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Experience;
import org.openapitools.model.GrowthRateDescription;
import org.openapitools.model.PokemonSpeciesSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GrowthRateDetail  {
  
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
  * The formula used to calculate the rate at which the Pokémon species gains level.
  */
  @ApiModelProperty(required = true, value = "The formula used to calculate the rate at which the Pokémon species gains level.")

  private String formula;

 /**
  * The descriptions of this characteristic listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The descriptions of this characteristic listed in different languages.")

  private List<@Valid GrowthRateDescription> descriptions = new ArrayList<>();

 /**
  * A list of levels and the amount of experienced needed to atain them based on this growth rate.
  */
  @ApiModelProperty(required = true, value = "A list of levels and the amount of experienced needed to atain them based on this growth rate.")

  private List<@Valid Experience> levels = new ArrayList<>();

 /**
  * A list of Pokémon species that gain levels at this growth rate.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon species that gain levels at this growth rate.")

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();
 /**
   * The identifier for this resource.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }


 /**
   * The name for this resource.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GrowthRateDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The formula used to calculate the rate at which the Pokémon species gains level.
   * @return formula
  **/
  @JsonProperty("formula")
  @NotNull
 @Size(max=500)  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public GrowthRateDetail formula(String formula) {
    this.formula = formula;
    return this;
  }

 /**
   * The descriptions of this characteristic listed in different languages.
   * @return descriptions
  **/
  @JsonProperty("descriptions")
  @NotNull
  public List<@Valid GrowthRateDescription> getDescriptions() {
    return descriptions;
  }


 /**
   * A list of levels and the amount of experienced needed to atain them based on this growth rate.
   * @return levels
  **/
  @JsonProperty("levels")
  @NotNull
  public List<@Valid Experience> getLevels() {
    return levels;
  }


 /**
   * A list of Pokémon species that gain levels at this growth rate.
   * @return pokemonSpecies
  **/
  @JsonProperty("pokemon_species")
  @NotNull
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

