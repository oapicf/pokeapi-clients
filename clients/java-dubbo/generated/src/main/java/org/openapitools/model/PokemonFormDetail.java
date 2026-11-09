package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonFormFlavorText;
import org.openapitools.model.PokemonFormName;
import org.openapitools.model.PokemonFormSprites;
import org.openapitools.model.PokemonFormTriggerCondition;
import org.openapitools.model.PokemonFormType;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.26.0")

public class PokemonFormDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier for this resource.
   */
  @JsonProperty("id")
  private Integer id;

  /**
   * The name for this resource.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   */
  @JsonProperty("order")
  private Integer order;

  /**
   * The order in which forms should be sorted within a species&#39; forms.
   */
  @JsonProperty("form_order")
  private Integer formOrder;

  /**
   * True for exactly one form used as the default for each Pokémon.
   */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /**
   * Whether or not this form can only happen during battle.
   */
  @JsonProperty("is_battle_only")
  private Boolean isBattleOnly;

  /**
   * Whether or not this form requires mega evolution.
   */
  @JsonProperty("is_mega")
  private Boolean isMega;

  /**
   * The name of this form.
   */
  @JsonProperty("form_name")
  private String formName;

  /**
   * The Pokémon that can take on this form.
   */
  @JsonProperty("pokemon")
  private PokemonSummary pokemon;

  /**
   * A set of sprites used to depict this Pokémon form in the game.
   */
  @JsonProperty("sprites")
  private PokemonFormSprites sprites;

  /**
   * The version group this Pokémon form was introduced in.
   */
  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  /**
   * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
   */
  @JsonProperty("form_names")
  private List<PokemonFormName> formNames = new ArrayList<>();

  /**
   * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
   */
  @JsonProperty("names")
  private List<PokemonFormName> names = new ArrayList<>();

  /**
   * A list of details showing types this Pokémon form has.
   */
  @JsonProperty("types")
  private List<PokemonFormType> types = new ArrayList<>();

  /**
   * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
   */
  @JsonProperty("trigger_conditions")
  private List<PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();

  /**
   * The flavor text of this form listed in different languages and versions.
   */
  @JsonProperty("flavor_text_entries")
  private List<PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();

  /**
   * The identifier for this resource.
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   * @return order
   */
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The order in which forms should be sorted within a species&#39; forms.
   * @return formOrder
   */
  public Integer getFormOrder() {
    return formOrder;
  }

  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * True for exactly one form used as the default for each Pokémon.
   * @return isDefault
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Whether or not this form can only happen during battle.
   * @return isBattleOnly
   */
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * Whether or not this form requires mega evolution.
   * @return isMega
   */
  public Boolean getIsMega() {
    return isMega;
  }

  public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

  /**
   * The name of this form.
   * @return formName
   */
  public String getFormName() {
    return formName;
  }

  public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   * The Pokémon that can take on this form.
   * @return pokemon
   */
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A set of sprites used to depict this Pokémon form in the game.
   * @return sprites
   */
  public PokemonFormSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * The version group this Pokémon form was introduced in.
   * @return versionGroup
   */
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
   * @return formNames
   */
  public List<PokemonFormName> getFormNames() {
    return formNames;
  }

  public void setFormNames(List<PokemonFormName> formNames) {
    this.formNames = formNames;
  }

  /**
   * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
   * @return names
   */
  public List<PokemonFormName> getNames() {
    return names;
  }

  public void setNames(List<PokemonFormName> names) {
    this.names = names;
  }

  /**
   * A list of details showing types this Pokémon form has.
   * @return types
   */
  public List<PokemonFormType> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonFormType> types) {
    this.types = types;
  }

  /**
   * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
   * @return triggerConditions
   */
  public List<PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }

  public void setTriggerConditions(List<PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
  }

  /**
   * The flavor text of this form listed in different languages and versions.
   * @return flavorTextEntries
   */
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
