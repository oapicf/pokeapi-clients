package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Experience;
import org.openapitools.model.GrowthRateDescription;
import org.openapitools.model.PokemonSpeciesSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * GrowthRateDetail
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-11-09T13:49:41.168612095Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class GrowthRateDetail {

  private Integer id;

  private String name;

  private String formula;

  private List<@Valid GrowthRateDescription> descriptions = new ArrayList<>();

  private List<@Valid Experience> levels = new ArrayList<>();

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public GrowthRateDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GrowthRateDetail(Integer id, String name, String formula, List<@Valid GrowthRateDescription> descriptions, List<@Valid Experience> levels, List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.id = id;
    this.name = name;
    this.formula = formula;
    this.descriptions = descriptions;
    this.levels = levels;
    this.pokemonSpecies = pokemonSpecies;
  }

  public GrowthRateDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The identifier for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GrowthRateDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   */
  @NotNull @Size(max = 500) 
  @Schema(name = "formula", description = "The formula used to calculate the rate at which the Pokémon species gains level.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("formula")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public GrowthRateDetail descriptions(List<@Valid GrowthRateDescription> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public GrowthRateDetail addDescriptionsItem(GrowthRateDescription descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

  /**
   * The descriptions of this characteristic listed in different languages.
   * @return descriptions
   */
  
  @Schema(name = "descriptions", accessMode = Schema.AccessMode.READ_ONLY, description = "The descriptions of this characteristic listed in different languages.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("descriptions")
  public List<@Valid GrowthRateDescription> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<@Valid GrowthRateDescription> descriptions) {
    this.descriptions = descriptions;
  }

  public GrowthRateDetail levels(List<@Valid Experience> levels) {
    this.levels = levels;
    return this;
  }

  public GrowthRateDetail addLevelsItem(Experience levelsItem) {
    if (this.levels == null) {
      this.levels = new ArrayList<>();
    }
    this.levels.add(levelsItem);
    return this;
  }

  /**
   * A list of levels and the amount of experienced needed to atain them based on this growth rate.
   * @return levels
   */
  
  @Schema(name = "levels", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of levels and the amount of experienced needed to atain them based on this growth rate.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("levels")
  public List<@Valid Experience> getLevels() {
    return levels;
  }

  public void setLevels(List<@Valid Experience> levels) {
    this.levels = levels;
  }

  public GrowthRateDetail pokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
    this.pokemonSpecies = pokemonSpecies;
    return this;
  }

  public GrowthRateDetail addPokemonSpeciesItem(PokemonSpeciesSummary pokemonSpeciesItem) {
    if (this.pokemonSpecies == null) {
      this.pokemonSpecies = new ArrayList<>();
    }
    this.pokemonSpecies.add(pokemonSpeciesItem);
    return this;
  }

  /**
   * A list of Pokémon species that gain levels at this growth rate.
   * @return pokemonSpecies
   */
  
  @Schema(name = "pokemon_species", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of Pokémon species that gain levels at this growth rate.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon_species")
  public List<@Valid PokemonSpeciesSummary> getPokemonSpecies() {
    return pokemonSpecies;
  }

  public void setPokemonSpecies(List<@Valid PokemonSpeciesSummary> pokemonSpecies) {
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

