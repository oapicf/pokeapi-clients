package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.PokemonFormFlavorText;
import org.openapitools.vertxweb.server.model.PokemonFormName;
import org.openapitools.vertxweb.server.model.PokemonFormSprites;
import org.openapitools.vertxweb.server.model.PokemonFormTriggerCondition;
import org.openapitools.vertxweb.server.model.PokemonFormType;
import org.openapitools.vertxweb.server.model.PokemonSummary;
import org.openapitools.vertxweb.server.model.VersionGroupSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public PokemonFormDetail () {

  }

  public PokemonFormDetail (Integer id, String name, Integer order, Integer formOrder, Boolean isDefault, Boolean isBattleOnly, Boolean isMega, String formName, PokemonSummary pokemon, PokemonFormSprites sprites, VersionGroupSummary versionGroup, List<PokemonFormName> formNames, List<PokemonFormName> names, List<PokemonFormType> types, List<PokemonFormTriggerCondition> triggerConditions, List<PokemonFormFlavorText> flavorTextEntries) {
    this.id = id;
    this.name = name;
    this.order = order;
    this.formOrder = formOrder;
    this.isDefault = isDefault;
    this.isBattleOnly = isBattleOnly;
    this.isMega = isMega;
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

    
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

    
  @JsonProperty("form_order")
  public Integer getFormOrder() {
    return formOrder;
  }
  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

    
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

    
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

    
  @JsonProperty("is_mega")
  public Boolean getIsMega() {
    return isMega;
  }
  public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

    
  @JsonProperty("form_name")
  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }

    
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

    
  @JsonProperty("sprites")
  public PokemonFormSprites getSprites() {
    return sprites;
  }
  public void setSprites(PokemonFormSprites sprites) {
    this.sprites = sprites;
  }

    
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

    
  @JsonProperty("form_names")
  public List<PokemonFormName> getFormNames() {
    return formNames;
  }
  public void setFormNames(List<PokemonFormName> formNames) {
    this.formNames = formNames;
  }

    
  @JsonProperty("names")
  public List<PokemonFormName> getNames() {
    return names;
  }
  public void setNames(List<PokemonFormName> names) {
    this.names = names;
  }

    
  @JsonProperty("types")
  public List<PokemonFormType> getTypes() {
    return types;
  }
  public void setTypes(List<PokemonFormType> types) {
    this.types = types;
  }

    
  @JsonProperty("trigger_conditions")
  public List<PokemonFormTriggerCondition> getTriggerConditions() {
    return triggerConditions;
  }
  public void setTriggerConditions(List<PokemonFormTriggerCondition> triggerConditions) {
    this.triggerConditions = triggerConditions;
  }

    
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
