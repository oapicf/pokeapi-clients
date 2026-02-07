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
import org.openapitools.model.PokemonDetailTypesInner;
import org.openapitools.model.PokemonFormDetailFormNamesInner;
import org.openapitools.model.PokemonFormDetailSprites;
import org.openapitools.model.PokemonSummary;
import org.openapitools.model.VersionGroupSummary;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-02-07T04:16:44.910526458Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
   **/
  public PokemonFormDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  public PokemonFormDetail name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public PokemonFormDetail order(Integer order) {
    this.order = order;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  /**
   **/
  public PokemonFormDetail formOrder(Integer formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("form_order")
  public Integer getFormOrder() {
    return formOrder;
  }
  public void setFormOrder(Integer formOrder) {
    this.formOrder = formOrder;
  }

  /**
   **/
  public PokemonFormDetail isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   **/
  public PokemonFormDetail isBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_battle_only")
  public Boolean getIsBattleOnly() {
    return isBattleOnly;
  }
  public void setIsBattleOnly(Boolean isBattleOnly) {
    this.isBattleOnly = isBattleOnly;
  }

  /**
   **/
  public PokemonFormDetail isMega(Boolean isMega) {
    this.isMega = isMega;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("is_mega")
  public Boolean getIsMega() {
    return isMega;
  }
  public void setIsMega(Boolean isMega) {
    this.isMega = isMega;
  }

  /**
   **/
  public PokemonFormDetail formName(String formName) {
    this.formName = formName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("form_name")
  public String getFormName() {
    return formName;
  }
  public void setFormName(String formName) {
    this.formName = formName;
  }

  /**
   **/
  public PokemonFormDetail pokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pokemon")
  public PokemonSummary getPokemon() {
    return pokemon;
  }
  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  /**
   **/
  public PokemonFormDetail sprites(PokemonFormDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("sprites")
  public PokemonFormDetailSprites getSprites() {
    return sprites;
  }
  public void setSprites(PokemonFormDetailSprites sprites) {
    this.sprites = sprites;
  }

  /**
   **/
  public PokemonFormDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("version_group")
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   **/
  public PokemonFormDetail formNames(List<PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("form_names")
  public List<PokemonFormDetailFormNamesInner> getFormNames() {
    return formNames;
  }
  public void setFormNames(List<PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
  }

  /**
   **/
  public PokemonFormDetail names(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("names")
  public List<PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }
  public void setNames(List<PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  /**
   **/
  public PokemonFormDetail types(List<PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("types")
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
        Objects.equals(types, pokemonFormDetail.types);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

