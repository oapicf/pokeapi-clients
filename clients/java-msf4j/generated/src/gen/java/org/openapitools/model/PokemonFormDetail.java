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

/**
 * PokemonFormDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-11-09T13:49:25.341948748Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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
  private List<@Valid PokemonFormName> formNames = new ArrayList<>();

  @JsonProperty("names")
  private List<@Valid PokemonFormName> names = new ArrayList<>();

  @JsonProperty("types")
  private List<@Valid PokemonFormType> types = new ArrayList<>();

  @JsonProperty("trigger_conditions")
  private List<@Valid PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  private List<@Valid PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();

   /**
   * The identifier for this resource.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  public Integer getId() {
    return id;
  }

  public PokemonFormDetail name(String name) {
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

  public PokemonFormDetail order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  @ApiModelProperty(required = true, value = "The Pokémon that can take on this form.")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

   /**
   * A set of sprites used to depict this Pokémon form in the game.
   * @return sprites
  **/
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon form in the game.")
  public PokemonFormSprites getSprites() {
    return sprites;
  }

  public PokemonFormDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * The version group this Pokémon form was introduced in.
   * @return versionGroup
  **/
  @ApiModelProperty(required = true, value = "The version group this Pokémon form was introduced in.")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

   /**
   * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
   * @return formNames
  **/
  @ApiModelProperty(required = true, value = "The form specific form name of this Pokémon form, or empty if the form does not have a specific name.")
  public List<@Valid PokemonFormName> getFormNames() {
    return formNames;
  }

   /**
   * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
   * @return names
  **/
  @ApiModelProperty(required = true, value = "The form specific full name of this Pokémon form, or empty if the form does not have a specific name.")
  public List<@Valid PokemonFormName> getNames() {
    return names;
  }

   /**
   * A list of details showing types this Pokémon form has.
   * @return types
  **/
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon form has.")
  public List<@Valid PokemonFormType> getTypes() {
    return types;
  }

   /**
   * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
   * @return triggerConditions
  **/
  @ApiModelProperty(required = true, value = "The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.")
  public List<@Valid PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }

   /**
   * The flavor text of this form listed in different languages and versions.
   * @return flavorTextEntries
  **/
  @ApiModelProperty(required = true, value = "The flavor text of this form listed in different languages and versions.")
  public List<@Valid PokemonFormFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
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

