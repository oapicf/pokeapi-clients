package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PokemonFormDetail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-11-09T13:50:06.168269698Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

  public PokemonFormDetail() {
  }

  @JsonCreator
  public PokemonFormDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "form_name") String formName,
    @JsonProperty(required = true, value = "pokemon") PokemonSummary pokemon,
    @JsonProperty(required = true, value = "sprites") PokemonFormSprites sprites,
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup,
    @JsonProperty(required = true, value = "form_names") List<@Valid PokemonFormName> formNames,
    @JsonProperty(required = true, value = "names") List<@Valid PokemonFormName> names,
    @JsonProperty(required = true, value = "types") List<@Valid PokemonFormType> types,
    @JsonProperty(required = true, value = "trigger_conditions") List<@Valid PokemonFormTriggerCondition> triggerConditions,
    @JsonProperty(required = true, value = "flavor_text_entries") List<@Valid PokemonFormFlavorText> flavorTextEntries
  ) {
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

  /**
   * The identifier for this resource.
   **/
  public PokemonFormDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier for this resource.")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * The name for this resource.
   **/
  public PokemonFormDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name for this resource.")
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=200)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonFormDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.")
  @JsonProperty("order")
   @Min(-2147483648) @Max(2147483647)public Integer getOrder() {
    return order;
  }

  @JsonProperty("order")
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * The order in which forms should be sorted within a species&#39; forms.
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  public PokemonFormDetail formOrder(Integer formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  
  @ApiModelProperty(value = "The order in which forms should be sorted within a species' forms.")
  @JsonProperty("form_order")
   @Min(-2147483648) @Max(2147483647)public Integer getFormOrder() {
    return formOrder;
  }

  @JsonProperty("form_order")
  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * True for exactly one form used as the default for each Pokémon.
   **/
  public PokemonFormDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(value = "True for exactly one form used as the default for each Pokémon.")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }

  @JsonProperty("is_default")
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * Whether or not this form can only happen during battle.
   **/
  public PokemonFormDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not this form can only happen during battle.")
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  @JsonProperty("is_battle_only")
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * Whether or not this form requires mega evolution.
   **/
  public PokemonFormDetail isMega(Boolean isMega) {
    this.isMega = isMega;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not this form requires mega evolution.")
  @JsonProperty("is_mega")
  public Boolean getIsMega() {
    return isMega;
  }

  @JsonProperty("is_mega")
  public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

  /**
   * The name of this form.
   **/
  public PokemonFormDetail formName(String formName) {
    this.formName = formName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of this form.")
  @JsonProperty(required = true, value = "form_name")
  @NotNull  @Size(max=30)public String getFormName() {
    return formName;
  }

  @JsonProperty(required = true, value = "form_name")
  public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   * The Pokémon that can take on this form.
   **/
  public PokemonFormDetail pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Pokémon that can take on this form.")
  @JsonProperty(required = true, value = "pokemon")
  @NotNull @Valid public PokemonSummary getPokemon() {
    return pokemon;
  }

  @JsonProperty(required = true, value = "pokemon")
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * A set of sprites used to depict this Pokémon form in the game.
   **/
  public PokemonFormDetail sprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A set of sprites used to depict this Pokémon form in the game.")
  @JsonProperty(required = true, value = "sprites")
  @Valid public PokemonFormSprites getSprites() {
    return sprites;
  }

  @JsonProperty(required = true, value = "sprites")
  public void setSprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * The version group this Pokémon form was introduced in.
   **/
  public PokemonFormDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The version group this Pokémon form was introduced in.")
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
   **/
  public PokemonFormDetail formNames(List<@Valid PokemonFormName> formNames) {
    this.formNames = formNames;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The form specific form name of this Pokémon form, or empty if the form does not have a specific name.")
  @JsonProperty(required = true, value = "form_names")
  public List<@Valid PokemonFormName> getFormNames() {
    return formNames;
  }

  @JsonProperty(required = true, value = "form_names")
  public void setFormNames(List<@Valid PokemonFormName> formNames) {
    this.formNames = formNames;
  }

  public PokemonFormDetail addFormNamesItem(PokemonFormName formNamesItem) {
    if (this.formNames == null) {
      this.formNames = new ArrayList<>();
    }

    this.formNames.add(formNamesItem);
    return this;
  }

  public PokemonFormDetail removeFormNamesItem(PokemonFormName formNamesItem) {
    if (formNamesItem != null && this.formNames != null) {
      this.formNames.remove(formNamesItem);
    }

    return this;
  }
  /**
   * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
   **/
  public PokemonFormDetail names(List<@Valid PokemonFormName> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The form specific full name of this Pokémon form, or empty if the form does not have a specific name.")
  @JsonProperty(required = true, value = "names")
  public List<@Valid PokemonFormName> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid PokemonFormName> names) {
    this.names = names;
  }

  public PokemonFormDetail addNamesItem(PokemonFormName namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public PokemonFormDetail removeNamesItem(PokemonFormName namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   * A list of details showing types this Pokémon form has.
   **/
  public PokemonFormDetail types(List<@Valid PokemonFormType> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of details showing types this Pokémon form has.")
  @JsonProperty(required = true, value = "types")
  public List<@Valid PokemonFormType> getTypes() {
    return types;
  }

  @JsonProperty(required = true, value = "types")
  public void setTypes(List<@Valid PokemonFormType> types) {
    this.types = types;
  }

  public PokemonFormDetail addTypesItem(PokemonFormType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }

    this.types.add(typesItem);
    return this;
  }

  public PokemonFormDetail removeTypesItem(PokemonFormType typesItem) {
    if (typesItem != null && this.types != null) {
      this.types.remove(typesItem);
    }

    return this;
  }
  /**
   * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
   **/
  public PokemonFormDetail triggerConditions(List<@Valid PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.")
  @JsonProperty(required = true, value = "trigger_conditions")
  public List<@Valid PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }

  @JsonProperty(required = true, value = "trigger_conditions")
  public void setTriggerConditions(List<@Valid PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
  }

  public PokemonFormDetail addTriggerConditionsItem(PokemonFormTriggerCondition triggerConditionsItem) {
    if (this.triggerConditions == null) {
      this.triggerConditions = new ArrayList<>();
    }

    this.triggerConditions.add(triggerConditionsItem);
    return this;
  }

  public PokemonFormDetail removeTriggerConditionsItem(PokemonFormTriggerCondition triggerConditionsItem) {
    if (triggerConditionsItem != null && this.triggerConditions != null) {
      this.triggerConditions.remove(triggerConditionsItem);
    }

    return this;
  }
  /**
   * The flavor text of this form listed in different languages and versions.
   **/
  public PokemonFormDetail flavorTextEntries(List<@Valid PokemonFormFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The flavor text of this form listed in different languages and versions.")
  @JsonProperty(required = true, value = "flavor_text_entries")
  public List<@Valid PokemonFormFlavorText> getFlavorTextEntries() {
    return flavorTextEntries;
  }

  @JsonProperty(required = true, value = "flavor_text_entries")
  public void setFlavorTextEntries(List<@Valid PokemonFormFlavorText> flavorTextEntries) {
    this.flavorTextEntries = flavorTextEntries;
  }

  public PokemonFormDetail addFlavorTextEntriesItem(PokemonFormFlavorText flavorTextEntriesItem) {
    if (this.flavorTextEntries == null) {
      this.flavorTextEntries = new ArrayList<>();
    }

    this.flavorTextEntries.add(flavorTextEntriesItem);
    return this;
  }

  public PokemonFormDetail removeFlavorTextEntriesItem(PokemonFormFlavorText flavorTextEntriesItem) {
    if (flavorTextEntriesItem != null && this.flavorTextEntries != null) {
      this.flavorTextEntries.remove(flavorTextEntriesItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
