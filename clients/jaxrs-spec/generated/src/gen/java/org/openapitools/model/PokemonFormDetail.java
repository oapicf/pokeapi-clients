package org.openapitools.model;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-02-07T04:17:57.915073257Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
  private PokemonFormDetailSprites sprites;
  private VersionGroupSummary versionGroup;
  private @Valid List<@Valid PokemonFormDetailFormNamesInner> formNames = new ArrayList<>();
  private @Valid List<@Valid PokemonFormDetailFormNamesInner> names = new ArrayList<>();
  private @Valid List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

  public PokemonFormDetail() {
  }

  @JsonCreator
  public PokemonFormDetail(
    @JsonProperty(required = true, value = "id") Integer id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "form_name") String formName,
    @JsonProperty(required = true, value = "pokemon") PokemonSummary pokemon,
    @JsonProperty(required = true, value = "sprites") PokemonFormDetailSprites sprites,
    @JsonProperty(required = true, value = "version_group") VersionGroupSummary versionGroup,
    @JsonProperty(required = true, value = "form_names") List<@Valid PokemonFormDetailFormNamesInner> formNames,
    @JsonProperty(required = true, value = "names") List<@Valid PokemonFormDetailFormNamesInner> names,
    @JsonProperty(required = true, value = "types") List<@Valid PokemonDetailTypesInner> types
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
  }

  /**
   **/
  public PokemonFormDetail id(Integer id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  public Integer getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "name")
  @NotNull  @Size(max=100)public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
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

  @JsonProperty("order")
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

  @JsonProperty("form_order")
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

  @JsonProperty("is_default")
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

  @JsonProperty("is_battle_only")
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

  @JsonProperty("is_mega")
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
  @JsonProperty(required = true, value = "form_name")
  @NotNull  @Size(max=30)public String getFormName() {
    return formName;
  }

  @JsonProperty(required = true, value = "form_name")
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
  @JsonProperty(required = true, value = "pokemon")
  @NotNull @Valid public PokemonSummary getPokemon() {
    return pokemon;
  }

  @JsonProperty(required = true, value = "pokemon")
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
  @JsonProperty(required = true, value = "sprites")
  @NotNull @Valid public PokemonFormDetailSprites getSprites() {
    return sprites;
  }

  @JsonProperty(required = true, value = "sprites")
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
  @JsonProperty(required = true, value = "version_group")
  @NotNull @Valid public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  @JsonProperty(required = true, value = "version_group")
  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  /**
   **/
  public PokemonFormDetail formNames(List<@Valid PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "form_names")
  @NotNull @Valid public List<@Valid PokemonFormDetailFormNamesInner> getFormNames() {
    return formNames;
  }

  @JsonProperty(required = true, value = "form_names")
  public void setFormNames(List<@Valid PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
  }

  public PokemonFormDetail addFormNamesItem(PokemonFormDetailFormNamesInner formNamesItem) {
    if (this.formNames == null) {
      this.formNames = new ArrayList<>();
    }

    this.formNames.add(formNamesItem);
    return this;
  }

  public PokemonFormDetail removeFormNamesItem(PokemonFormDetailFormNamesInner formNamesItem) {
    if (formNamesItem != null && this.formNames != null) {
      this.formNames.remove(formNamesItem);
    }

    return this;
  }
  /**
   **/
  public PokemonFormDetail names(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "names")
  @NotNull @Valid public List<@Valid PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }

  @JsonProperty(required = true, value = "names")
  public void setNames(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  public PokemonFormDetail addNamesItem(PokemonFormDetailFormNamesInner namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }

    this.names.add(namesItem);
    return this;
  }

  public PokemonFormDetail removeNamesItem(PokemonFormDetailFormNamesInner namesItem) {
    if (namesItem != null && this.names != null) {
      this.names.remove(namesItem);
    }

    return this;
  }
  /**
   **/
  public PokemonFormDetail types(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "types")
  @NotNull @Valid public List<@Valid PokemonDetailTypesInner> getTypes() {
    return types;
  }

  @JsonProperty(required = true, value = "types")
  public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
  }

  public PokemonFormDetail addTypesItem(PokemonDetailTypesInner typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }

    this.types.add(typesItem);
    return this;
  }

  public PokemonFormDetail removeTypesItem(PokemonDetailTypesInner typesItem) {
    if (typesItem != null && this.types != null) {
      this.types.remove(typesItem);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

