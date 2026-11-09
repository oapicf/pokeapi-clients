package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PokemonFormDetail
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-09T13:53:47.069318184Z[Etc/UTC]", comments = "Generator version: 7.26.0")
public class PokemonFormDetail {

  private Integer id;

  private String name;

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> order = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> formOrder = JsonNullable.<Integer>undefined();

  private @Nullable Boolean isDefault;

  private @Nullable Boolean isBattleOnly;

  private @Nullable Boolean isMega;

  private String formName;

  private PokemonSummary pokemon;

  private PokemonFormSprites sprites;

  private VersionGroupSummary versionGroup;

  private List<@Valid PokemonFormName> formNames = new ArrayList<>();

  private List<@Valid PokemonFormName> names = new ArrayList<>();

  private List<@Valid PokemonFormType> types = new ArrayList<>();

  private List<@Valid PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();

  private List<@Valid PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();

  public PokemonFormDetail() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PokemonFormDetail(Integer id, String name, String formName, PokemonSummary pokemon, PokemonFormSprites sprites, VersionGroupSummary versionGroup, List<@Valid PokemonFormName> formNames, List<@Valid PokemonFormName> names, List<@Valid PokemonFormType> types, List<@Valid PokemonFormTriggerCondition> triggerConditions, List<@Valid PokemonFormFlavorText> flavorTextEntries) {
    this.id = id;
    this.name = name;
    this.formName = formName;
    this.pokemon = pokemon;
    this.sprites = sprites;
    this.versionGroup = versionGroup;
    this.formNames = formNames;
    this.names = names;
    this.types = types;
    this.triggerConditions = triggerConditions;
    this.flavorTextEntries = flavorTextEntries;
  }

  public PokemonFormDetail id(Integer id) {
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

  @JsonProperty("id")
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
  @NotNull @Size(max = 200) 
  @Schema(name = "name", description = "The name for this resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public PokemonFormDetail order(Integer order) {
    this.order = JsonNullable.of(order);
    return this;
  }

  /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return order
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "order", description = "The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("order")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getOrder() {
    return order;
  }

  public void setOrder(JsonNullable<Integer> order) {
    this.order = order;
  }

  public PokemonFormDetail formOrder(Integer formOrder) {
    this.formOrder = JsonNullable.of(formOrder);
    return this;
  }

  /**
   * The order in which forms should be sorted within a species' forms.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return formOrder
   */
  @Min(value = -2147483648) @Max(value = 2147483647) 
  @Schema(name = "form_order", description = "The order in which forms should be sorted within a species' forms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("form_order")
  public JsonNullable<@Min(value = -2147483648) @Max(value = 2147483647) Integer> getFormOrder() {
    return formOrder;
  }

  public void setFormOrder(JsonNullable<Integer> formOrder) {
    this.formOrder = formOrder;
  }

  public PokemonFormDetail isDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * True for exactly one form used as the default for each Pokémon.
   * @return isDefault
   */
  
  @Schema(name = "is_default", description = "True for exactly one form used as the default for each Pokémon.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_default")
  public @Nullable Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("is_default")
  public void setIsDefault(@Nullable Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public PokemonFormDetail isBattleOnly(@Nullable Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  /**
   * Whether or not this form can only happen during battle.
   * @return isBattleOnly
   */
  
  @Schema(name = "is_battle_only", description = "Whether or not this form can only happen during battle.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_battle_only")
  public @Nullable Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  @JsonProperty("is_battle_only")
  public void setIsBattleOnly(@Nullable Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  public PokemonFormDetail isMega(@Nullable Boolean isMega) {
    this.isMega = isMega;
    return this;
  }

  /**
   * Whether or not this form requires mega evolution.
   * @return isMega
   */
  
  @Schema(name = "is_mega", description = "Whether or not this form requires mega evolution.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_mega")
  public @Nullable Boolean getIsMega() {
    return isMega;
  }

  @JsonProperty("is_mega")
  public void setIsMega(@Nullable Boolean isMega) {
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
  @NotNull @Size(max = 30) 
  @Schema(name = "form_name", description = "The name of this form.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("form_name")
  public String getFormName() {
    return formName;
  }

  @JsonProperty("form_name")
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
  @NotNull @Valid 
  @Schema(name = "pokemon", description = "The Pokémon that can take on this form.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  @JsonProperty("pokemon")
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
  @Valid 
  @Schema(name = "sprites", accessMode = Schema.AccessMode.READ_ONLY, description = "A set of sprites used to depict this Pokémon form in the game.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sprites")
  public PokemonFormSprites getSprites() {
    return sprites;
  }

  @JsonProperty("sprites")
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
  @NotNull @Valid 
  @Schema(name = "version_group", description = "The version group this Pokémon form was introduced in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty("version_group")
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
   */
  
  @Schema(name = "form_names", accessMode = Schema.AccessMode.READ_ONLY, description = "The form specific form name of this Pokémon form, or empty if the form does not have a specific name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("form_names")
  public List<@Valid PokemonFormName> getFormNames() {
    return formNames;
  }

  @JsonProperty("form_names")
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
   */
  
  @Schema(name = "names", accessMode = Schema.AccessMode.READ_ONLY, description = "The form specific full name of this Pokémon form, or empty if the form does not have a specific name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("names")
  public List<@Valid PokemonFormName> getNames() {
    return names;
  }

  @JsonProperty("names")
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
   */
  
  @Schema(name = "types", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of details showing types this Pokémon form has.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("types")
  public List<@Valid PokemonFormType> getTypes() {
    return types;
  }

  @JsonProperty("types")
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
   */
  
  @Schema(name = "trigger_conditions", accessMode = Schema.AccessMode.READ_ONLY, description = "The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trigger_conditions")
  public List<@Valid PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }

  @JsonProperty("trigger_conditions")
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
   */
  
  @Schema(name = "flavor_text_entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The flavor text of this form listed in different languages and versions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("flavor_text_entries")
  public List<@Valid PokemonFormFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  @JsonProperty("flavor_text_entries")
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
        equalsNullable(this.order, pokemonFormDetail.order) &&
        equalsNullable(this.formOrder, pokemonFormDetail.formOrder) &&
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, hashCodeNullable(order), hashCodeNullable(formOrder), isDefault, isBattleOnly, isMega, formName, pokemon, sprites, versionGroup, formNames, names, types, triggerConditions, flavorTextEntries);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

