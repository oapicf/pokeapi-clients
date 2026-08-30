package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonDetailTypesInner;
import org.openapitools.model.PokemonFormDetailFormNamesInner;
import org.openapitools.model.PokemonFormDetailSprites;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.VersionGroupSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PokemonFormDetail implements Serializable {
  private static final long serialVersionUID = 1L;

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
  private PokemonFormDetailSprites sprites;

  @JsonProperty("version_group")
  private VersionGroupSummary versionGroup;

  @JsonProperty("form_names")
  private List<PokemonFormDetailFormNamesInner> formNames = new ArrayList<>();

  @JsonProperty("names")
  private List<PokemonFormDetailFormNamesInner> names = new ArrayList<>();

  @JsonProperty("types")
  private List<PokemonDetailTypesInner> types = new ArrayList<>();

  /**
   * 
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * 
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return order
   */
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   * 
   * @return formOrder
   */
  public Integer getFormOrder() {
    return formOrder;
  }

  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * 
   * @return isDefault
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * 
   * @return isBattleOnly
   */
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }

  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   * 
   * @return isMega
   */
  public Boolean getIsMega() {
    return isMega;
  }

  public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

  /**
   * 
   * @return formName
   */
  public String getFormName() {
    return formName;
  }

  public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   * 
   * @return pokemon
   */
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   * 
   * @return sprites
   */
  public PokemonFormDetailSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonFormDetailSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * 
   * @return versionGroup
   */
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   * 
   * @return formNames
   */
  public List<PokemonFormDetailFormNamesInner> getFormNames() {
    return formNames;
  }

  public void setFormNames(List<PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
  }

  /**
   * 
   * @return names
   */
  public List<PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }

  public void setNames(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  /**
   * 
   * @return types
   */
  public List<PokemonDetailTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<PokemonDetailTypesInner> types) {
    this.types = types;
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
        Objects.equals(this.types, pokemonFormDetail.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, formOrder, isDefault, isBattleOnly, isMega, formName, pokemon, sprites, versionGroup, formNames, names, types);
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
