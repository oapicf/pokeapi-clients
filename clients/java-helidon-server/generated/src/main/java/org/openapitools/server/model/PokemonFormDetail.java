package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PokemonDetailTypesInner;
import org.openapitools.server.model.PokemonFormDetailFormNamesInner;
import org.openapitools.server.model.PokemonFormDetailSprites;
import org.openapitools.server.model.PokemonSummary;
import org.openapitools.server.model.VersionGroupSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
    private List<@Valid PokemonFormDetailFormNamesInner> formNames = new ArrayList<>();
    private List<@Valid PokemonFormDetailFormNamesInner> names = new ArrayList<>();
    private List<@Valid PokemonDetailTypesInner> types = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonFormDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonFormDetail.
     *
     * @param id id
     * @param name name
     * @param order order
     * @param formOrder formOrder
     * @param isDefault isDefault
     * @param isBattleOnly isBattleOnly
     * @param isMega isMega
     * @param formName formName
     * @param pokemon pokemon
     * @param sprites sprites
     * @param versionGroup versionGroup
     * @param formNames formNames
     * @param names names
     * @param types types
     */
    public PokemonFormDetail(
        Integer id, 
        String name, 
        Integer order, 
        Integer formOrder, 
        Boolean isDefault, 
        Boolean isBattleOnly, 
        Boolean isMega, 
        String formName, 
        PokemonSummary pokemon, 
        PokemonFormDetailSprites sprites, 
        VersionGroupSummary versionGroup, 
        List<@Valid PokemonFormDetailFormNamesInner> formNames, 
        List<@Valid PokemonFormDetailFormNamesInner> names, 
        List<@Valid PokemonDetailTypesInner> types
    ) {
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
    }



    /**
     * Get id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get order
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * Get formOrder
     * @return formOrder
     */
    public Integer getFormOrder() {
        return formOrder;
    }

    public void setFormOrder(Integer formOrder) {
        this.formOrder = formOrder;
    }

    /**
     * Get isDefault
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Get isBattleOnly
     * @return isBattleOnly
     */
    public Boolean getIsBattleOnly() {
        return isBattleOnly;
    }

    public void setIsBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    /**
     * Get isMega
     * @return isMega
     */
    public Boolean getIsMega() {
        return isMega;
    }

    public void setIsMega(Boolean isMega) {
        this.isMega = isMega;
    }

    /**
     * Get formName
     * @return formName
     */
    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    /**
     * Get pokemon
     * @return pokemon
     */
    public PokemonSummary getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonSummary pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * Get sprites
     * @return sprites
     */
    public PokemonFormDetailSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonFormDetailSprites sprites) {
        this.sprites = sprites;
    }

    /**
     * Get versionGroup
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * Get formNames
     * @return formNames
     */
    public List<@Valid PokemonFormDetailFormNamesInner> getFormNames() {
        return formNames;
    }

    public void setFormNames(List<@Valid PokemonFormDetailFormNamesInner> formNames) {
        this.formNames = formNames;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid PokemonFormDetailFormNamesInner> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokemonFormDetailFormNamesInner> names) {
        this.names = names;
    }

    /**
     * Get types
     * @return types
     */
    public List<@Valid PokemonDetailTypesInner> getTypes() {
        return types;
    }

    public void setTypes(List<@Valid PokemonDetailTypesInner> types) {
        this.types = types;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

