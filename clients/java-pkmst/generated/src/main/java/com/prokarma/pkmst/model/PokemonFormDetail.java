package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.PokemonFormFlavorText;
import com.prokarma.pkmst.model.PokemonFormName;
import com.prokarma.pkmst.model.PokemonFormSprites;
import com.prokarma.pkmst.model.PokemonFormTriggerCondition;
import com.prokarma.pkmst.model.PokemonFormType;
import com.prokarma.pkmst.model.PokemonSummary;
import com.prokarma.pkmst.model.VersionGroupSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PokemonFormDetail
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-11-09T13:49:28.343088631Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormDetail   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("order")
  private Integer order;

  @JsonProperty("form_order")
  private Integer formOrder;

  @JsonProperty("is_default")
  private Boolean isDefault;

  @JsonProperty("is_battle_only")
  private Boolean isBattleOnly;

  @JsonProperty("is_mega")
  private Boolean isMega;

  @JsonProperty("form_name")
  private String formName;

  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  @JsonProperty("sprites")
  private PokemonFormSprites sprites;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("form_names")
  
  private List<PokemonFormName> formNames = new ArrayList<>();

  @JsonProperty("names")
  
  private List<PokemonFormName> names = new ArrayList<>();

  @JsonProperty("types")
  
  private List<PokemonFormType> types = new ArrayList<>();

  @JsonProperty("trigger_conditions")
  
  private List<PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  
  private List<PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();

  public PokemonFormDetail id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier for this resource.
   * @return id
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PokemonFormDetail name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name for this resource.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name for this resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonFormDetail order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
   */
  @ApiModelProperty(value = "The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public PokemonFormDetail formOrder(Integer formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  /**
   * The order in which forms should be sorted within a species' forms.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return formOrder
   */
  @ApiModelProperty(value = "The order in which forms should be sorted within a species' forms.")
  public Integer getFormOrder() {
    return formOrder;
  }

  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  public PokemonFormDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * True for exactly one form used as the default for each Pokémon.
   * @return isDefault
   */
  @ApiModelProperty(value = "True for exactly one form used as the default for each Pokémon.")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonFormDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  /**
   * Whether or not this form can only happen during battle.
   * @return isBattleOnly
   */
  @ApiModelProperty(value = "Whether or not this form can only happen during battle.")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  public PokemonFormDetail isMega(Boolean isMega) {
    this.isMega = isMega;
    return this;
  }

  /**
   * Whether or not this form requires mega evolution.
   * @return isMega
   */
  @ApiModelProperty(value = "Whether or not this form requires mega evolution.")
  public Boolean getIsMega() {
    return isMega;
  }

  public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

  public PokemonFormDetail formName(String formName) {
    this.formName = formName;
    return this;
  }

  /**
   * The name of this form.
   * @return formName
   */
  @ApiModelProperty(required = true, value = "The name of this form.")
  public String getFormName() {
    return formName;
  }

  public void setFormName(String formName) {
    this.formName = formName;
  }

  public PokemonFormDetail pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  /**
   * The Pokémon that can take on this form.
   * @return pokemon
   */
  @ApiModelProperty(required = true, value = "The Pokémon that can take on this form.")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  public PokemonFormDetail sprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  /**
   * A set of sprites used to depict this Pokémon form in the game.
   * @return sprites
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A set of sprites used to depict this Pokémon form in the game.")
  public PokemonFormSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
  }

  public PokemonFormDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  /**
   * The version group this Pokémon form was introduced in.
   * @return versionGroup
   */
  @ApiModelProperty(required = true, value = "The version group this Pokémon form was introduced in.")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public PokemonFormDetail formNames(List<PokemonFormName> formNames) {
    this.formNames = formNames;
    return this;
  }

  public PokemonFormDetail addFormNamesItem(PokemonFormName formNamesItem) {
    if (this.formNames == null) {
      this.formNames = new ArrayList<>();
    }
    this.formNames.add(formNamesItem);
    return this;
  }

  /**
   * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
   * @return formNames
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The form specific form name of this Pokémon form, or empty if the form does not have a specific name.")
  public List<PokemonFormName> getFormNames() {
    return formNames;
  }

  public void setFormNames(List<PokemonFormName> formNames) {
    this.formNames = formNames;
  }

  public PokemonFormDetail names(List<PokemonFormName> names) {
    this.names = names;
    return this;
  }

  public PokemonFormDetail addNamesItem(PokemonFormName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
   * @return names
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The form specific full name of this Pokémon form, or empty if the form does not have a specific name.")
  public List<PokemonFormName> getNames() {
    return names;
  }

  public void setNames(List<PokemonFormName> names) {
    this.names = names;
  }

  public PokemonFormDetail types(List<PokemonFormType> types) {
    this.types = types;
    return this;
  }

  public PokemonFormDetail addTypesItem(PokemonFormType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * A list of details showing types this Pokémon form has.
   * @return types
   */
  @ApiModelProperty(required = true, readOnly = true, value = "A list of details showing types this Pokémon form has.")
  public List<PokemonFormType> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonFormType> types) {
    this.types = types;
  }

  public PokemonFormDetail triggerConditions(List<PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
    return this;
  }

  public PokemonFormDetail addTriggerConditionsItem(PokemonFormTriggerCondition triggerConditionsItem) {
    if (this.triggerConditions == null) {
      this.triggerConditions = new ArrayList<>();
    }
    this.triggerConditions.add(triggerConditionsItem);
    return this;
  }

  /**
   * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
   * @return triggerConditions
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.")
  public List<PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }

  public void setTriggerConditions(List<PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
  }

  public PokemonFormDetail flavorTextEntries(List<PokemonFormFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  public PokemonFormDetail addFlavorTextEntriesItem(PokemonFormFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  /**
   * The flavor text of this form listed in different languages and versions.
   * @return flavorTextEntries
   */
  @ApiModelProperty(required = true, readOnly = true, value = "The flavor text of this form listed in different languages and versions.")
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

