package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AbilityChange;
import org.openapitools.model.AbilityEffectText;
import org.openapitools.model.AbilityFlavorText;
import org.openapitools.model.AbilityName;
import org.openapitools.model.AbilityPokemonDetail;
import org.openapitools.model.GenerationSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AbilityDetail  {
  
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
  * Whether or not this ability originated in the main series of the video games.
  */
  @ApiModelProperty(value = "Whether or not this ability originated in the main series of the video games.")

  private Boolean isMainSeries;

 /**
  * The generation this ability originated in.
  */
  @ApiModelProperty(required = true, value = "The generation this ability originated in.")

  @Valid

  private GenerationSummary generation;

 /**
  * The name of this resource listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The name of this resource listed in different languages.")

  private List<@Valid AbilityName> names = new ArrayList<>();

 /**
  * The effect of this ability listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The effect of this ability listed in different languages.")

  private List<@Valid AbilityEffectText> effectEntries = new ArrayList<>();

 /**
  * The list of previous effects this ability has had across version groups.
  */
  @ApiModelProperty(required = true, value = "The list of previous effects this ability has had across version groups.")

  private List<@Valid AbilityChange> effectChanges = new ArrayList<>();

 /**
  * The flavor text of this ability listed in different languages.
  */
  @ApiModelProperty(required = true, value = "The flavor text of this ability listed in different languages.")

  private List<@Valid AbilityFlavorText> flavorTextEntries = new ArrayList<>();

 /**
  * A list of Pokémon that could potentially have this ability.
  */
  @ApiModelProperty(required = true, value = "A list of Pokémon that could potentially have this ability.")

  private List<@Valid AbilityPokemonDetail> pokemon = new ArrayList<>();
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

  public AbilityDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Whether or not this ability originated in the main series of the video games.
   * @return isMainSeries
  **/
  @JsonProperty("is_main_series")
  public Boolean getIsMainSeries() {
    return isMainSeries;
  }

  public void setIsMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
  }

  public AbilityDetail isMainSeries(Boolean isMainSeries) {
    this.isMainSeries = isMainSeries;
    return this;
  }

 /**
   * The generation this ability originated in.
   * @return generation
  **/
  @JsonProperty("generation")
  @NotNull
  public GenerationSummary getGeneration() {
    return generation;
  }

  public void setGeneration(GenerationSummary generation) {
    this.generation = generation;
  }

  public AbilityDetail generation(GenerationSummary generation) {
    this.generation = generation;
    return this;
  }

 /**
   * The name of this resource listed in different languages.
   * @return names
  **/
  @JsonProperty("names")
  @NotNull
  public List<@Valid AbilityName> getNames() {
    return names;
  }


 /**
   * The effect of this ability listed in different languages.
   * @return effectEntries
  **/
  @JsonProperty("effect_entries")
  @NotNull
  public List<@Valid AbilityEffectText> getEffectEntries() {
    return effectEntries;
  }


 /**
   * The list of previous effects this ability has had across version groups.
   * @return effectChanges
  **/
  @JsonProperty("effect_changes")
  @NotNull
  public List<@Valid AbilityChange> getEffectChanges() {
    return effectChanges;
  }


 /**
   * The flavor text of this ability listed in different languages.
   * @return flavorTextEntries
  **/
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid AbilityFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }


 /**
   * A list of Pokémon that could potentially have this ability.
   * @return pokemon
  **/
  @JsonProperty("pokemon")
  @NotNull
  public List<@Valid AbilityPokemonDetail> getPokemon() {
    return pokemon;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbilityDetail abilityDetail = (AbilityDetail) o;
    return Objects.equals(this.id, abilityDetail.id) &&
        Objects.equals(this.name, abilityDetail.name) &&
        Objects.equals(this.isMainSeries, abilityDetail.isMainSeries) &&
        Objects.equals(this.generation, abilityDetail.generation) &&
        Objects.equals(this.names, abilityDetail.names) &&
        Objects.equals(this.effectEntries, abilityDetail.effectEntries) &&
        Objects.equals(this.effectChanges, abilityDetail.effectChanges) &&
        Objects.equals(this.flavorTextEntries, abilityDetail.flavorTextEntries) &&
        Objects.equals(this.pokemon, abilityDetail.pokemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isMainSeries, generation, names, effectEntries, effectChanges, flavorTextEntries, pokemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilityDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isMainSeries: ").append(toIndentedString(isMainSeries)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
    sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
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

