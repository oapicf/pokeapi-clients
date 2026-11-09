package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonFormDetail  {
  
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
  * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
  */
  @ApiModelProperty(value = "The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.")
  private Integer order;

 /**
  * The order in which forms should be sorted within a species' forms.
  */
  @ApiModelProperty(value = "The order in which forms should be sorted within a species' forms.")
  private Integer formOrder;

 /**
  * True for exactly one form used as the default for each Pokémon.
  */
  @ApiModelProperty(value = "True for exactly one form used as the default for each Pokémon.")
  private Boolean isDefault;

 /**
  * Whether or not this form can only happen during battle.
  */
  @ApiModelProperty(value = "Whether or not this form can only happen during battle.")
  private Boolean isBattleOnly;

 /**
  * Whether or not this form requires mega evolution.
  */
  @ApiModelProperty(value = "Whether or not this form requires mega evolution.")
  private Boolean isMega;

 /**
  * The name of this form.
  */
  @ApiModelProperty(required = true, value = "The name of this form.")
  private String formName;

 /**
  * The Pokémon that can take on this form.
  */
  @ApiModelProperty(required = true, value = "The Pokémon that can take on this form.")
  @Valid
  private PokemonSummary pokemon;

 /**
  * A set of sprites used to depict this Pokémon form in the game.
  */
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon form in the game.")
  @Valid
  private PokemonFormSprites sprites;

 /**
  * The version group this Pokémon form was introduced in.
  */
  @ApiModelProperty(required = true, value = "The version group this Pokémon form was introduced in.")
  @Valid
  private VersionGroupSummary versionGroup;

 /**
  * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
  */
  @ApiModelProperty(required = true, value = "The form specific form name of this Pokémon form, or empty if the form does not have a specific name.")
  private List<@Valid PokemonFormName> formNames = new ArrayList<>();

 /**
  * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
  */
  @ApiModelProperty(required = true, value = "The form specific full name of this Pokémon form, or empty if the form does not have a specific name.")
  private List<@Valid PokemonFormName> names = new ArrayList<>();

 /**
  * A list of details showing types this Pokémon form has.
  */
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon form has.")
  private List<@Valid PokemonFormType> types = new ArrayList<>();

 /**
  * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
  */
  @ApiModelProperty(required = true, value = "The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.")
  private List<@Valid PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();

 /**
  * The flavor text of this form listed in different languages and versions.
  */
  @ApiModelProperty(required = true, value = "The flavor text of this form listed in different languages and versions.")
  private List<@Valid PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();
 /**
  * The identifier for this resource.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public Integer getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail id(Integer id) {
    this.id = id;
    return this;
  }

 /**
  * The name for this resource.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=200)  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public PokemonFormDetail name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return order
  */
  @JsonProperty("order")
 @Min(-2147483648) @Max(2147483647)  public Integer getOrder() {
    return order;
  }

  /**
   * Sets the <code>order</code> property.
   */
 public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * Sets the <code>order</code> property.
   */
  public PokemonFormDetail order(Integer order) {
    this.order = order;
    return this;
  }

 /**
  * The order in which forms should be sorted within a species&#39; forms.
  * minimum: -2147483648
  * maximum: 2147483647
  * @return formOrder
  */
  @JsonProperty("form_order")
 @Min(-2147483648) @Max(2147483647)  public Integer getFormOrder() {
    return formOrder;
  }

  /**
   * Sets the <code>formOrder</code> property.
   */
 public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * Sets the <code>formOrder</code> property.
   */
  public PokemonFormDetail formOrder(Integer formOrder) {
    this.formOrder = formOrder;
    return this;
  }

 /**
  * True for exactly one form used as the default for each Pokémon.
  * @return isDefault
  */
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
 public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Sets the <code>isDefault</code> property.
   */
  public PokemonFormDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

 /**
  * Whether or not this form can only happen during battle.
  * @return isBattleOnly
  */
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  /**
   * Sets the <code>isBattleOnly</code> property.
   */
 public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * Sets the <code>isBattleOnly</code> property.
   */
  public PokemonFormDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

 /**
  * Whether or not this form requires mega evolution.
  * @return isMega
  */
  @JsonProperty("is_mega")
  public Boolean getIsMega() {
    return isMega;
  }

  /**
   * Sets the <code>isMega</code> property.
   */
 public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

  /**
   * Sets the <code>isMega</code> property.
   */
  public PokemonFormDetail isMega(Boolean isMega) {
    this.isMega = isMega;
    return this;
  }

 /**
  * The name of this form.
  * @return formName
  */
  @JsonProperty("form_name")
  @NotNull
 @Size(max=30)  public String getFormName() {
    return formName;
  }

  /**
   * Sets the <code>formName</code> property.
   */
 public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   * Sets the <code>formName</code> property.
   */
  public PokemonFormDetail formName(String formName) {
    this.formName = formName;
    return this;
  }

 /**
  * The Pokémon that can take on this form.
  * @return pokemon
  */
  @JsonProperty("pokemon")
  @NotNull
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
 public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * Sets the <code>pokemon</code> property.
   */
  public PokemonFormDetail pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

 /**
  * A set of sprites used to depict this Pokémon form in the game.
  * @return sprites
  */
  @JsonProperty("sprites")
  @NotNull
  public PokemonFormSprites getSprites() {
    return sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   * <br><em>N.B. <code>sprites</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setSprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   * <br><em>N.B. <code>sprites</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail sprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
    return this;
  }

 /**
  * The version group this Pokémon form was introduced in.
  * @return versionGroup
  */
  @JsonProperty("version_group")
  @NotNull
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
 public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * Sets the <code>versionGroup</code> property.
   */
  public PokemonFormDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

 /**
  * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
  * @return formNames
  */
  @JsonProperty("form_names")
  @NotNull
  public List<@Valid PokemonFormName> getFormNames() {
    return formNames;
  }

  /**
   * Sets the <code>formNames</code> property.
   * <br><em>N.B. <code>formNames</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setFormNames(List<@Valid PokemonFormName> formNames) {
    this.formNames = formNames;
  }

  /**
   * Sets the <code>formNames</code> property.
   * <br><em>N.B. <code>formNames</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail formNames(List<@Valid PokemonFormName> formNames) {
    this.formNames = formNames;
    return this;
  }

  /**
   * Adds a new item to the <code>formNames</code> list.
   * <br><em>N.B. <code>formNames</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail addFormNamesItem(PokemonFormName formNamesItem) {
    this.formNames.add(formNamesItem);
    return this;
  }

 /**
  * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokemonFormName> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNames(List<@Valid PokemonFormName> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail names(List<@Valid PokemonFormName> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   * <br><em>N.B. <code>names</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail addNamesItem(PokemonFormName namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * A list of details showing types this Pokémon form has.
  * @return types
  */
  @JsonProperty("types")
  @NotNull
  public List<@Valid PokemonFormType> getTypes() {
    return types;
  }

  /**
   * Sets the <code>types</code> property.
   * <br><em>N.B. <code>types</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setTypes(List<@Valid PokemonFormType> types) {
    this.types = types;
  }

  /**
   * Sets the <code>types</code> property.
   * <br><em>N.B. <code>types</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail types(List<@Valid PokemonFormType> types) {
    this.types = types;
    return this;
  }

  /**
   * Adds a new item to the <code>types</code> list.
   * <br><em>N.B. <code>types</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail addTypesItem(PokemonFormType typesItem) {
    this.types.add(typesItem);
    return this;
  }

 /**
  * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
  * @return triggerConditions
  */
  @JsonProperty("trigger_conditions")
  @NotNull
  public List<@Valid PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }

  /**
   * Sets the <code>triggerConditions</code> property.
   * <br><em>N.B. <code>triggerConditions</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setTriggerConditions(List<@Valid PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
  }

  /**
   * Sets the <code>triggerConditions</code> property.
   * <br><em>N.B. <code>triggerConditions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail triggerConditions(List<@Valid PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
    return this;
  }

  /**
   * Adds a new item to the <code>triggerConditions</code> list.
   * <br><em>N.B. <code>triggerConditions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail addTriggerConditionsItem(PokemonFormTriggerCondition triggerConditionsItem) {
    this.triggerConditions.add(triggerConditionsItem);
    return this;
  }

 /**
  * The flavor text of this form listed in different languages and versions.
  * @return flavorTextEntries
  */
  @JsonProperty("flavor_text_entries")
  @NotNull
  public List<@Valid PokemonFormFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   * <br><em>N.B. <code>flavorTextEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setFlavorTextEntries(List<@Valid PokemonFormFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  /**
   * Sets the <code>flavorTextEntries</code> property.
   * <br><em>N.B. <code>flavorTextEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail flavorTextEntries(List<@Valid PokemonFormFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  /**
   * Adds a new item to the <code>flavorTextEntries</code> list.
   * <br><em>N.B. <code>flavorTextEntries</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public PokemonFormDetail addFlavorTextEntriesItem(PokemonFormFlavorText flavorTextEntriesItem) {
    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

