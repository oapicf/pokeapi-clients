package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PokemonFormFlavorText;
import org.openapitools.server.model.PokemonFormName;
import org.openapitools.server.model.PokemonFormSprites;
import org.openapitools.server.model.PokemonFormTriggerCondition;
import org.openapitools.server.model.PokemonFormType;
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
    private PokemonFormSprites sprites;
    private VersionGroupSummary versionGroup;
    private List<@Valid PokemonFormName> formNames = new ArrayList<>();
    private List<@Valid PokemonFormName> names = new ArrayList<>();
    private List<@Valid PokemonFormType> types = new ArrayList<>();
    private List<@Valid PokemonFormTriggerCondition> triggerConditions = new ArrayList<>();
    private List<@Valid PokemonFormFlavorText> flavorTextEntries = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PokemonFormDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create PokemonFormDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param order The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
     * @param formOrder The order in which forms should be sorted within a species&#39; forms.
     * @param isDefault True for exactly one form used as the default for each Pokémon.
     * @param isBattleOnly Whether or not this form can only happen during battle.
     * @param isMega Whether or not this form requires mega evolution.
     * @param formName The name of this form.
     * @param pokemon The Pokémon that can take on this form.
     * @param sprites A set of sprites used to depict this Pokémon form in the game.
     * @param versionGroup The version group this Pokémon form was introduced in.
     * @param formNames The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
     * @param names The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
     * @param types A list of details showing types this Pokémon form has.
     * @param triggerConditions The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
     * @param flavorTextEntries The flavor text of this form listed in different languages and versions.
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
        PokemonFormSprites sprites, 
        VersionGroupSummary versionGroup, 
        List<@Valid PokemonFormName> formNames, 
        List<@Valid PokemonFormName> names, 
        List<@Valid PokemonFormType> types, 
        List<@Valid PokemonFormTriggerCondition> triggerConditions, 
        List<@Valid PokemonFormFlavorText> flavorTextEntries
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
        this.triggerConditions = triggerConditions;
        this.flavorTextEntries = flavorTextEntries;
    }



    /**
     * The identifier for this resource.
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The name for this resource.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * The order in which forms should be sorted within a species' forms.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return formOrder
     */
    public Integer getFormOrder() {
        return formOrder;
    }

    public void setFormOrder(Integer formOrder) {
        this.formOrder = formOrder;
    }

    /**
     * True for exactly one form used as the default for each Pokémon.
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Whether or not this form can only happen during battle.
     * @return isBattleOnly
     */
    public Boolean getIsBattleOnly() {
        return isBattleOnly;
    }

    public void setIsBattleOnly(Boolean isBattleOnly) {
        this.isBattleOnly = isBattleOnly;
    }

    /**
     * Whether or not this form requires mega evolution.
     * @return isMega
     */
    public Boolean getIsMega() {
        return isMega;
    }

    public void setIsMega(Boolean isMega) {
        this.isMega = isMega;
    }

    /**
     * The name of this form.
     * @return formName
     */
    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    /**
     * The Pokémon that can take on this form.
     * @return pokemon
     */
    public PokemonSummary getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonSummary pokemon) {
        this.pokemon = pokemon;
    }

    /**
     * A set of sprites used to depict this Pokémon form in the game.
     * @return sprites
     */
    public PokemonFormSprites getSprites() {
        return sprites;
    }

    public void setSprites(PokemonFormSprites sprites) {
        this.sprites = sprites;
    }

    /**
     * The version group this Pokémon form was introduced in.
     * @return versionGroup
     */
    public VersionGroupSummary getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroupSummary versionGroup) {
        this.versionGroup = versionGroup;
    }

    /**
     * The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
     * @return formNames
     */
    public List<@Valid PokemonFormName> getFormNames() {
        return formNames;
    }

    public void setFormNames(List<@Valid PokemonFormName> formNames) {
        this.formNames = formNames;
    }

    /**
     * The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
     * @return names
     */
    public List<@Valid PokemonFormName> getNames() {
        return names;
    }

    public void setNames(List<@Valid PokemonFormName> names) {
        this.names = names;
    }

    /**
     * A list of details showing types this Pokémon form has.
     * @return types
     */
    public List<@Valid PokemonFormType> getTypes() {
        return types;
    }

    public void setTypes(List<@Valid PokemonFormType> types) {
        this.types = types;
    }

    /**
     * The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
     * @return triggerConditions
     */
    public List<@Valid PokemonFormTriggerCondition> getTriggerConditions() {
        return triggerConditions;
    }

    public void setTriggerConditions(List<@Valid PokemonFormTriggerCondition> triggerConditions) {
        this.triggerConditions = triggerConditions;
    }

    /**
     * The flavor text of this form listed in different languages and versions.
     * @return flavorTextEntries
     */
    public List<@Valid PokemonFormFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid PokemonFormFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
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
        sb.append("    triggerConditions: ").append(toIndentedString(triggerConditions)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
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

