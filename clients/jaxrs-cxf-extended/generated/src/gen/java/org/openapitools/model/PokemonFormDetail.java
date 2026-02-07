package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PokemonDetailTypesInner;
import org.openapitools.model.PokemonFormDetailFormNamesInner;
import org.openapitools.model.PokemonFormDetailSprites;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.VersionGroupSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PokemonFormDetail  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer id;

  @ApiModelProperty(required = true, value = "")
  private String name;

  @ApiModelProperty(value = "")
  private Integer order;

  @ApiModelProperty(value = "")
  private Integer formOrder;

  @ApiModelProperty(value = "")
  private Boolean isDefault;

  @ApiModelProperty(value = "")
  private Boolean isBattleOnly;

  @ApiModelProperty(value = "")
  private Boolean isMega;

  @ApiModelProperty(required = true, value = "")
  private String formName;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonSummary pokemon;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private PokemonFormDetailSprites sprites;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private VersionGroupSummary versionGroup;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonFormDetailFormNamesInner> formNames = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonFormDetailFormNamesInner> names = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();
 /**
  * Get id
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
  * Get name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
 @Size(max=100)  public String getName() {
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
  * Get order
  * @return order
  */
  @JsonProperty("order")
  public Integer getOrder() {
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
  * Get formOrder
  * @return formOrder
  */
  @JsonProperty("form_order")
  public Integer getFormOrder() {
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
  * Get isDefault
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
  * Get isBattleOnly
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
  * Get isMega
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
  * Get formName
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
  * Get pokemon
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
  * Get sprites
  * @return sprites
  */
  @JsonProperty("sprites")
  @NotNull
  public PokemonFormDetailSprites getSprites() {
    return sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   */
 public void setSprites(PokemonFormDetailSprites sprites) {
    this.sprites = sprites;
  }

  /**
   * Sets the <code>sprites</code> property.
   */
  public PokemonFormDetail sprites(PokemonFormDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

 /**
  * Get versionGroup
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
  * Get formNames
  * @return formNames
  */
  @JsonProperty("form_names")
  @NotNull
  public List<@Valid PokemonFormDetailFormNamesInner> getFormNames() {
    return formNames;
  }

  /**
   * Sets the <code>formNames</code> property.
   */
 public void setFormNames(List<@Valid PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
  }

  /**
   * Sets the <code>formNames</code> property.
   */
  public PokemonFormDetail formNames(List<@Valid PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
    return this;
  }

  /**
   * Adds a new item to the <code>formNames</code> list.
   */
  public PokemonFormDetail addFormNamesItem(PokemonFormDetailFormNamesInner formNamesItem) {
    this.formNames.add(formNamesItem);
    return this;
  }

 /**
  * Get names
  * @return names
  */
  @JsonProperty("names")
  @NotNull
  public List<@Valid PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }

  /**
   * Sets the <code>names</code> property.
   */
 public void setNames(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  /**
   * Sets the <code>names</code> property.
   */
  public PokemonFormDetail names(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  /**
   * Adds a new item to the <code>names</code> list.
   */
  public PokemonFormDetail addNamesItem(PokemonFormDetailFormNamesInner namesItem) {
    this.names.add(namesItem);
    return this;
  }

 /**
  * Get types
  * @return types
  */
  @JsonProperty("types")
  @NotNull
  public List<@Valid PokemonDetailTypesInner> getTypes() {
    return types;
  }

  /**
   * Sets the <code>types</code> property.
   */
 public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
  }

  /**
   * Sets the <code>types</code> property.
   */
  public PokemonFormDetail types(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  /**
   * Adds a new item to the <code>types</code> list.
   */
  public PokemonFormDetail addTypesItem(PokemonDetailTypesInner typesItem) {
    this.types.add(typesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

