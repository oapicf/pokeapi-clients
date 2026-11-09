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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonFormFlavorText;
import org.openapitools.model.PokemonFormName;
import org.openapitools.model.PokemonFormSprites;
import org.openapitools.model.PokemonFormTriggerCondition;
import org.openapitools.model.PokemonFormType;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-11-09T13:50:03.149615362Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormDetail   {
  
  private Integer id;
  private String name;
  private Integer order;
  private Integer formOrder;
  private Boolean isDefault;
  private Boolean isBattleOnly;
  private Boolean isMega;
  private String formName;
  private PokemonSummary pokemon;
  private PokemonFormSprites sprites;
  private VersionGroupSummary versionGroup;
  private List<@Valid PokemonFormName> formNames = new ArrayList<>();
  private List<@Valid PokemonFormName> names = new ArrayList<>();
  private List<@Valid PokemonFormType> types = new ArrayList<>();
  private List<@Valid PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();
  private List<@Valid PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();

  /**
   * The identifier for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.")
  @JsonProperty("order")
 @Min(-2147483648) @Max(2147483647)  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The order in which forms should be sorted within a species&#39; forms.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  
  @ApiModelProperty(value = "The order in which forms should be sorted within a species' forms.")
  @JsonProperty("form_order")
 @Min(-2147483648) @Max(2147483647)  public Integer getFormOrder() {
    return formOrder;
  }
  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * True for exactly one form used as the default for each Pokémon.
   **/
  
  @ApiModelProperty(value = "True for exactly one form used as the default for each Pokémon.")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Whether or not this form can only happen during battle.
   **/
  
  @ApiModelProperty(value = "Whether or not this form can only happen during battle.")
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * Whether or not this form requires mega evolution.
   **/
  
  @ApiModelProperty(value = "Whether or not this form requires mega evolution.")
  @JsonProperty("is_mega")
  public Boolean getIsMega() {
    return isMega;
  }
  public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

  /**
   * The name of this form.
   **/
  
  @ApiModelProperty(required = true, value = "The name of this form.")
  @JsonProperty("form_name")
  @NotNull
 @Size(max=30)  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   * The Pokémon that can take on this form.
   **/
  
  @ApiModelProperty(required = true, value = "The Pokémon that can take on this form.")
  @JsonProperty("pokemon")
  @NotNull
  public PokemonSummary getPokemon() {
    return pokemon;
  }
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A set of sprites used to depict this Pokémon form in the game.
   **/
  
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon form in the game.")
  @JsonProperty("sprites")
  @NotNull
  public PokemonFormSprites getSprites() {
    return sprites;
  }
  public void setSprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * The version group this Pokémon form was introduced in.
   **/
  
  @ApiModelProperty(required = true, value = "The version group this Pokémon form was introduced in.")
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
   **/
  
  @ApiModelProperty(required = true, value = "The form specific form name of this Pokémon form, or empty if the form does not have a specific name.")
  @JsonProperty("form_names")
  @NotNull
  public List<@Valid PokemonFormName> getFormNames() {
    return formNames;
  }
  public void setFormNames(List<@Valid PokemonFormName> formNames) {
    this.formNames = formNames;
  }

  /**
   * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
   **/
  
  @ApiModelProperty(required = true, value = "The form specific full name of this Pokémon form, or empty if the form does not have a specific name.")
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokemonFormName> getNames() {
    return names;
  }
  public void setNames(List<@Valid PokemonFormName> names) {
    this.names = names;
  }

  /**
   * A list of details showing types this Pokémon form has.
   **/
  
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon form has.")
  @JsonProperty("types")
  @NotNull
  public List<@Valid PokemonFormType> getTypes() {
    return types;
  }
  public void setTypes(List<@Valid PokemonFormType> types) {
    this.types = types;
  }

  /**
   * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
   **/
  
  @ApiModelProperty(required = true, value = "The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.")
  @JsonProperty("trigger_conditions")
  @NotNull
  public List<@Valid PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }
  public void setTriggerConditions(List<@Valid PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
  }

  /**
   * The flavor text of this form listed in different languages and versions.
   **/
  
  @ApiModelProperty(required = true, value = "The flavor text of this form listed in different languages and versions.")
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid PokemonFormFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<@Valid PokemonFormFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonFormDetail pokemonFormDetail = (PokemonFormDetail) o;
    return Objects.equals(this.id, pokemonFormDetail.id) &&
        Objects.equals(this.name, pokemonFormDetail.name) &&
        Objects.equals(this.order, pokemonFormDetail.order) &&
        Objects.equals(this.formOrder, pokemonFormDetail.formOrder) &&
        Objects.equals(this.isDefault, pokemonFormDetail.isDefault) &&
        Objects.equals(this.isBattleOnly, pokemonFormDetail.isBattleOnly) &&
        Objects.equals(this.isMega, pokemonFormDetail.isMega) &&
        Objects.equals(this.formName, pokemonFormDetail.formName) &&
        Objects.equals(this.pokemon, pokemonFormDetail.pokemon) &&
        Objects.equals(this.sprites, pokemonFormDetail.sprites) &&
        Objects.equals(this.versionGroup, pokemonFormDetail.versionGroup) &&
        Objects.equals(this.formNames, pokemonFormDetail.formNames) &&
        Objects.equals(this.names, pokemonFormDetail.names) &&
        Objects.equals(this.types, pokemonFormDetail.types) &&
        Objects.equals(this.triggerConditions, pokemonFormDetail.triggerConditions) &&
        Objects.equals(this.flavorTextEntries, pokemonFormDetail.flavorTextEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, formOrder, isDefault, isBattleOnly, isMega, formName, pokemon, sprites, versionGroup, formNames, names, types, triggerConditions, flavorTextEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonFormDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    formOrder: ").append(toIndentedString(formOrder)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isBattleOnly: ").append(toIndentedString(isBattleOnly)).append("\n");
    sb.append("    isMega: ").append(toIndentedString(isMega)).append("\n");
    sb.append("    formName: ").append(toIndentedString(formName)).append("\n");
    sb.append("    pokemon: ").append(toIndentedString(pokemon)).append("\n");
    sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
    sb.append("    versionGroup: ").append(toIndentedString(versionGroup)).append("\n");
    sb.append("    formNames: ").append(toIndentedString(formNames)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    triggerConditions: ").append(toIndentedString(triggerConditions)).append("\n");
    sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
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

