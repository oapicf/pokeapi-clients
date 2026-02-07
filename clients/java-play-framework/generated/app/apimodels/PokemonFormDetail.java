package apimodels;

import apimodels.PokemonDetailTypesInner;
import apimodels.PokemonFormDetailFormNamesInner;
import apimodels.PokemonFormDetailSprites;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-02-07T04:17:12.303882205Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PokemonFormDetail   {
  @JsonProperty("id")
  @NotNull

  private Integer id;

  @JsonProperty("name")
  @NotNull
@Size(max=100)

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

  private PokemonFormDetailSprites sprites;

  @JsonProperty("version_group")
  @NotNull
@Valid

  private VersionGroupSummary versionGroup;

  @JsonProperty("form_names")
  @NotNull
@Valid

  private List<@Valid PokemonFormDetailFormNamesInner> formNames = new ArrayList<>();

  @JsonProperty("names")
  @NotNull
@Valid

  private List<@Valid PokemonFormDetailFormNamesInner> names = new ArrayList<>();

  @JsonProperty("types")
  @NotNull
@Valid

  private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

  public PokemonFormDetail id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
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
   * Get name
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
   * Get order
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
   * Get formOrder
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
   * Get isDefault
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
   * Get isBattleOnly
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
   * Get isMega
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
   * Get formName
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
   * Get pokemon
   * @return pokemon
  **/
  public PokemonSummary getPokemon() {
    return pokemon;
  }

  public void setPokemon(PokemonSummary pokemon) {
    this.pokemon = pokemon;
  }

  public PokemonFormDetail sprites(PokemonFormDetailSprites sprites) {
    this.sprites = sprites;
    return this;
  }

   /**
   * Get sprites
   * @return sprites
  **/
  public PokemonFormDetailSprites getSprites() {
    return sprites;
  }

  public void setSprites(PokemonFormDetailSprites sprites) {
    this.sprites = sprites;
  }

  public PokemonFormDetail versionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
    return this;
  }

   /**
   * Get versionGroup
   * @return versionGroup
  **/
  public VersionGroupSummary getVersionGroup() {
    return versionGroup;
  }

  public void setVersionGroup(VersionGroupSummary versionGroup) {
    this.versionGroup = versionGroup;
  }

  public PokemonFormDetail formNames(List<@Valid PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
    return this;
  }

  public PokemonFormDetail addFormNamesItem(PokemonFormDetailFormNamesInner formNamesItem) {
    if (this.formNames == null) {
      this.formNames = new ArrayList<>();
    }
    this.formNames.add(formNamesItem);
    return this;
  }

   /**
   * Get formNames
   * @return formNames
  **/
  public List<@Valid PokemonFormDetailFormNamesInner> getFormNames() {
    return formNames;
  }

  public void setFormNames(List<@Valid PokemonFormDetailFormNamesInner> formNames) {
    this.formNames = formNames;
  }

  public PokemonFormDetail names(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
    return this;
  }

  public PokemonFormDetail addNamesItem(PokemonFormDetailFormNamesInner namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  public List<@Valid PokemonFormDetailFormNamesInner> getNames() {
    return names;
  }

  public void setNames(List<@Valid PokemonFormDetailFormNamesInner> names) {
    this.names = names;
  }

  public PokemonFormDetail types(List<@Valid PokemonDetailTypesInner> types) {
    this.types = types;
    return this;
  }

  public PokemonFormDetail addTypesItem(PokemonDetailTypesInner typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  public List<@Valid PokemonDetailTypesInner> getTypes() {
    return types;
  }

  public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
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

