/*
 * PokéAPI
 *
 * All the Pokémon data you'll ever need in one place, easily accessible through a modern free open-source RESTful API.  ## What is this?  This is a full RESTful API linked to an extensive database detailing everything about the Pokémon main game series.  We've covered everything from Pokémon to Berry Flavors.  ## Where do I start?  We have awesome [documentation](https://pokeapi.co/docs/v2) on how to use this API. It takes minutes to get started.  This API will always be publicly available and will never require any extensive setup process to consume.  Created by [**Paul Hallett**](https://github.com/phalt) and other [**PokéAPI contributors**](https://github.com/PokeAPI/pokeapi#contributing) around the world. Pokémon and Pokémon character names are trademarks of Nintendo.
 *
 * OpenAPI document version: 2.10.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-11-09T13:49:34.675912514Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  private List<PokemonFormName> formNames = new ArrayList<>();
  private List<PokemonFormName> names = new ArrayList<>();
  private List<PokemonFormType> types = new ArrayList<>();
  private List<PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();
  private List<PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();

  /**
   * The identifier for this resource.
   */
  public PokemonFormDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   */
  public PokemonFormDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public PokemonFormDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The order in which forms should be sorted within a species' forms.
   * minimum: -2147483648
   * maximum: 2147483647
   */
  public PokemonFormDetail formOrder(Integer formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  
  @ApiModelProperty(value = "The order in which forms should be sorted within a species' forms.")
  @JsonProperty("form_order")
  public Integer getFormOrder() {
    return formOrder;
  }
  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * True for exactly one form used as the default for each Pokémon.
   */
  public PokemonFormDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
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
   */
  public PokemonFormDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  
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
   */
  public PokemonFormDetail isMega(Boolean isMega) {
    this.isMega = isMega;
    return this;
  }

  
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
   */
  public PokemonFormDetail formName(String formName) {
    this.formName = formName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this form.")
  @JsonProperty("form_name")
  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   * The Pokémon that can take on this form.
   */
  public PokemonFormDetail pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon that can take on this form.")
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A set of sprites used to depict this Pokémon form in the game.
   */
  public PokemonFormDetail sprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon form in the game.")
  @JsonProperty("sprites")
  public PokemonFormSprites getSprites() {
    return sprites;
  }
  public void setSprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * The version group this Pokémon form was introduced in.
   */
  public PokemonFormDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group this Pokémon form was introduced in.")
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
   */
  public PokemonFormDetail formNames(List<PokemonFormName> formNames) {
    this.formNames = formNames;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The form specific form name of this Pokémon form, or empty if the form does not have a specific name.")
  @JsonProperty("form_names")
  public List<PokemonFormName> getFormNames() {
    return formNames;
  }
  public void setFormNames(List<PokemonFormName> formNames) {
    this.formNames = formNames;
  }

  /**
   * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
   */
  public PokemonFormDetail names(List<PokemonFormName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The form specific full name of this Pokémon form, or empty if the form does not have a specific name.")
  @JsonProperty("names")
  public List<PokemonFormName> getNames() {
    return names;
  }
  public void setNames(List<PokemonFormName> names) {
    this.names = names;
  }

  /**
   * A list of details showing types this Pokémon form has.
   */
  public PokemonFormDetail types(List<PokemonFormType> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon form has.")
  @JsonProperty("types")
  public List<PokemonFormType> getTypes() {
    return types;
  }
  public void setTypes(List<PokemonFormType> types) {
    this.types = types;
  }

  /**
   * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
   */
  public PokemonFormDetail triggerConditions(List<PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.")
  @JsonProperty("trigger_conditions")
  public List<PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }
  public void setTriggerConditions(List<PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
  }

  /**
   * The flavor text of this form listed in different languages and versions.
   */
  public PokemonFormDetail flavorTextEntries(List<PokemonFormFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The flavor text of this form listed in different languages and versions.")
  @JsonProperty("flavor_text_entries")
  public List<PokemonFormFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }
  public void setFlavorTextEntries(List<PokemonFormFlavorText> flavorTextEntries) {
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
    return Objects.equals(id, pokemonFormDetail.id) &&
        Objects.equals(name, pokemonFormDetail.name) &&
        Objects.equals(order, pokemonFormDetail.order) &&
        Objects.equals(formOrder, pokemonFormDetail.formOrder) &&
        Objects.equals(isDefault, pokemonFormDetail.isDefault) &&
        Objects.equals(isBattleOnly, pokemonFormDetail.isBattleOnly) &&
        Objects.equals(isMega, pokemonFormDetail.isMega) &&
        Objects.equals(formName, pokemonFormDetail.formName) &&
        Objects.equals(pokemon, pokemonFormDetail.pokemon) &&
        Objects.equals(sprites, pokemonFormDetail.sprites) &&
        Objects.equals(versionGroup, pokemonFormDetail.versionGroup) &&
        Objects.equals(formNames, pokemonFormDetail.formNames) &&
        Objects.equals(names, pokemonFormDetail.names) &&
        Objects.equals(types, pokemonFormDetail.types) &&
        Objects.equals(triggerConditions, pokemonFormDetail.triggerConditions) &&
        Objects.equals(flavorTextEntries, pokemonFormDetail.flavorTextEntries);
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

