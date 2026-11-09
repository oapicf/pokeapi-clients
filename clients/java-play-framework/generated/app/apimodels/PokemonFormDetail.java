package apimodels;

import apimodels.PokemonFormFlavorText;
import apimodels.PokemonFormName;
import apimodels.PokemonFormSprites;
import apimodels.PokemonFormTriggerCondition;
import apimodels.PokemonFormType;
import apimodels.PokemonSummary;
import apimodels.VersionGroupSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PokemonFormDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-11-09T13:49:31.462302702Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonFormDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=200)

  private String name;

  @JsonProperty("order")
  @Min(-2147483648)
@Max(2147483647)

  private Integer order;

  @JsonProperty("form_order")
  @Min(-2147483648)
@Max(2147483647)

  private Integer formOrder;

  @JsonProperty("is_default")
  
  private Boolean isDefault;

  @JsonProperty("is_battle_only")
  
  private Boolean isBattleOnly;

  @JsonProperty("is_mega")
  
  private Boolean isMega;

  @JsonProperty("form_name")
  @NotNull
@Size(max=30)

  private String formName;

  @JsonProperty("pokemon")
  @NotNull
@Valid

  private PokemonSummary pokemon;

  @JsonProperty("sprites")
  @NotNull
@Valid

  private PokemonFormSprites sprites;

  @JsonProperty("version_group")
  @NotNull
@Valid

  private VersionGroupSummary versionGroup;

  @JsonProperty("form_names")
  @NotNull
@Valid

  private List<@Valid PokemonFormName> formNames = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid PokemonFormName> names = new ArrayList<>();

  @JsonProperty("types")
  @NotNull
@Valid

  private List<@Valid PokemonFormType> types = new ArrayList<>();

  @JsonProperty("trigger_conditions")
  @NotNull
@Valid

  private List<@Valid PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();

  @JsonProperty("flavor_text_entries")
  @NotNull
@Valid

  private List<@Valid PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();

  public PokemonFormDetail id(Integer id) {
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

  public PokemonFormDetail name(String name) {
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
  **/
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
  **/
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public PokemonFormDetail formNames(List<@Valid PokemonFormName> formNames) {
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
  **/
  public List<@Valid PokemonFormName> getFormNames() {
    return formNames;
  }

  public void setFormNames(List<@Valid PokemonFormName> formNames) {
    this.formNames = formNames;
  }

  public PokemonFormDetail names(List<@Valid PokemonFormName> names) {
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
  **/
  public List<@Valid PokemonFormName> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonFormName> names) {
    this.names = names;
  }

  public PokemonFormDetail types(List<@Valid PokemonFormType> types) {
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
  **/
  public List<@Valid PokemonFormType> getTypes() {
    return types;
  }

  public void setTypes(List<@Valid PokemonFormType> types) {
    this.types = types;
  }

  public PokemonFormDetail triggerConditions(List<@Valid PokemonFormTriggerCondition> triggerConditions) {
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
  **/
  public List<@Valid PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }

  public void setTriggerConditions(List<@Valid PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
  }

  public PokemonFormDetail flavorTextEntries(List<@Valid PokemonFormFlavorText> flavorTextEntries) {
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

