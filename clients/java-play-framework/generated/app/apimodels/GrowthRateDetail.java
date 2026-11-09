package apimodels;

import apimodels.Experience;
import apimodels.GrowthRateDescription;
import apimodels.PokemonSpeciesSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GrowthRateDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GrowthRateDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("formula")
  @NotNull
@Size(max=500)

  private String formula;

  @JsonProperty("descriptions")
  @NotNull
@Valid

  private List<@Valid GrowthRateDescription> descriptions = new ArrayList<>();

  @JsonProperty("levels")
  @NotNull
@Valid

  private List<@Valid Experience> levels = new ArrayList<>();

  @JsonProperty("pokemon_species")
  @NotNull
@Valid

  private List<@Valid PokemonSpeciesSummary> pokemonSpecies = new ArrayList<>();

  public GrowthRateDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier for this resource.
   * @return id
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

