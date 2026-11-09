package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ContestEffectSummary;
import org.openapitools.server.model.ContestTypeSummary;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.ItemMachine;
import org.openapitools.server.model.MoveChange;
import org.openapitools.server.model.MoveCombos;
import org.openapitools.server.model.MoveDamageClassSummary;
import org.openapitools.server.model.MoveEffectChange;
import org.openapitools.server.model.MoveEffectEffectText;
import org.openapitools.server.model.MoveFlavorText;
import org.openapitools.server.model.MoveMeta;
import org.openapitools.server.model.MoveMetaStatChange;
import org.openapitools.server.model.MoveName;
import org.openapitools.server.model.MoveTargetSummary;
import org.openapitools.server.model.PokemonSummary;
import org.openapitools.server.model.SuperContestEffectSummary;
import org.openapitools.server.model.TypeSummary;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MoveDetail   {

    private Integer id;
    private String name;
    private Integer accuracy;
    private Integer effectChance;
    private Integer pp;
    private Integer priority;
    private Integer power;
    private MoveCombos contestCombos;
    private ContestTypeSummary contestType;
    private ContestEffectSummary contestEffect;
    private MoveDamageClassSummary damageClass;
    private List<@Valid MoveEffectEffectText> effectEntries = new ArrayList<>();
    private List<@Valid MoveEffectChange> effectChanges = new ArrayList<>();
    private GenerationSummary generation;
    private MoveMeta meta;
    private List<@Valid MoveName> names = new ArrayList<>();
    private List<@Valid MoveChange> pastValues = new ArrayList<>();
    private List<@Valid MoveMetaStatChange> statChanges = new ArrayList<>();
    private SuperContestEffectSummary superContestEffect;
    private MoveTargetSummary target;
    private TypeSummary type;
    private List<@Valid ItemMachine> machines = new ArrayList<>();
    private List<@Valid MoveFlavorText> flavorTextEntries = new ArrayList<>();
    private List<@Valid PokemonSummary> learnedByPokemon = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveDetail.
     *
     * @param id The identifier for this resource.
     * @param name The name for this resource.
     * @param accuracy The percent value of how likely this move is to be successful.
     * @param effectChance The percent value of how likely it is this moves effect will happen.
     * @param pp Power points. The number of times this move can be used.
     * @param priority A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
     * @param power The base power of this move, or null if it has no fixed base power.
     * @param contestCombos A detail of normal and super contest combos that require this move.
     * @param contestType The type of appeal this move gives a Pokémon when used in a contest.
     * @param contestEffect The effect the move has when used in a contest.
     * @param damageClass The type of damage the move inflicts on the target, e.g. physical.
     * @param effectEntries The effect of this move listed in different languages.
     * @param effectChanges The list of previous effects this move has had across version groups of the games.
     * @param generation The generation in which this move was introduced.
     * @param meta Metadata about this move
     * @param names The name of this resource listed in different languages.
     * @param pastValues A list of move resource value changes across version groups of the game.
     * @param statChanges A list of stats this moves effects and how much it effects them.
     * @param superContestEffect The effect the move has when used in a super contest.
     * @param target The type of target that will receive the effects of the attack.
     * @param type The elemental type of this move.
     * @param machines A list of the machines that teach this move.
     * @param flavorTextEntries The flavor text of this move listed in different languages.
     * @param learnedByPokemon List of Pokemon that can learn the move
     */
    public MoveDetail(
        Integer id, 
        String name, 
        Integer accuracy, 
        Integer effectChance, 
        Integer pp, 
        Integer priority, 
        Integer power, 
        MoveCombos contestCombos, 
        ContestTypeSummary contestType, 
        ContestEffectSummary contestEffect, 
        MoveDamageClassSummary damageClass, 
        List<@Valid MoveEffectEffectText> effectEntries, 
        List<@Valid MoveEffectChange> effectChanges, 
        GenerationSummary generation, 
        MoveMeta meta, 
        List<@Valid MoveName> names, 
        List<@Valid MoveChange> pastValues, 
        List<@Valid MoveMetaStatChange> statChanges, 
        SuperContestEffectSummary superContestEffect, 
        MoveTargetSummary target, 
        TypeSummary type, 
        List<@Valid ItemMachine> machines, 
        List<@Valid MoveFlavorText> flavorTextEntries, 
        List<@Valid PokemonSummary> learnedByPokemon
    ) {
        this.id = id;
        this.name = name;
        this.accuracy = accuracy;
        this.effectChance = effectChance;
        this.pp = pp;
        this.priority = priority;
        this.power = power;
        this.contestCombos = contestCombos;
        this.contestType = contestType;
        this.contestEffect = contestEffect;
        this.damageClass = damageClass;
        this.effectEntries = effectEntries;
        this.effectChanges = effectChanges;
        this.generation = generation;
        this.meta = meta;
        this.names = names;
        this.pastValues = pastValues;
        this.statChanges = statChanges;
        this.superContestEffect = superContestEffect;
        this.target = target;
        this.type = type;
        this.machines = machines;
        this.flavorTextEntries = flavorTextEntries;
        this.learnedByPokemon = learnedByPokemon;
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
     * The percent value of how likely this move is to be successful.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return accuracy
     */
    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * The percent value of how likely it is this moves effect will happen.
     * @return effectChance
     */
    public Integer getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    /**
     * Power points. The number of times this move can be used.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return pp
     */
    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    /**
     * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * The base power of this move, or null if it has no fixed base power.
     * minimum: -2147483648
     * maximum: 2147483647
     * @return power
     */
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * A detail of normal and super contest combos that require this move.
     * @return contestCombos
     */
    public MoveCombos getContestCombos() {
        return contestCombos;
    }

    public void setContestCombos(MoveCombos contestCombos) {
        this.contestCombos = contestCombos;
    }

    /**
     * The type of appeal this move gives a Pokémon when used in a contest.
     * @return contestType
     */
    public ContestTypeSummary getContestType() {
        return contestType;
    }

    public void setContestType(ContestTypeSummary contestType) {
        this.contestType = contestType;
    }

    /**
     * The effect the move has when used in a contest.
     * @return contestEffect
     */
    public ContestEffectSummary getContestEffect() {
        return contestEffect;
    }

    public void setContestEffect(ContestEffectSummary contestEffect) {
        this.contestEffect = contestEffect;
    }

    /**
     * The type of damage the move inflicts on the target, e.g. physical.
     * @return damageClass
     */
    public MoveDamageClassSummary getDamageClass() {
        return damageClass;
    }

    public void setDamageClass(MoveDamageClassSummary damageClass) {
        this.damageClass = damageClass;
    }

    /**
     * The effect of this move listed in different languages.
     * @return effectEntries
     */
    public List<@Valid MoveEffectEffectText> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid MoveEffectEffectText> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * The list of previous effects this move has had across version groups of the games.
     * @return effectChanges
     */
    public List<@Valid MoveEffectChange> getEffectChanges() {
        return effectChanges;
    }

    public void setEffectChanges(List<@Valid MoveEffectChange> effectChanges) {
        this.effectChanges = effectChanges;
    }

    /**
     * The generation in which this move was introduced.
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * Metadata about this move
     * @return meta
     */
    public MoveMeta getMeta() {
        return meta;
    }

    public void setMeta(MoveMeta meta) {
        this.meta = meta;
    }

    /**
     * The name of this resource listed in different languages.
     * @return names
     */
    public List<@Valid MoveName> getNames() {
        return names;
    }

    public void setNames(List<@Valid MoveName> names) {
        this.names = names;
    }

    /**
     * A list of move resource value changes across version groups of the game.
     * @return pastValues
     */
    public List<@Valid MoveChange> getPastValues() {
        return pastValues;
    }

    public void setPastValues(List<@Valid MoveChange> pastValues) {
        this.pastValues = pastValues;
    }

    /**
     * A list of stats this moves effects and how much it effects them.
     * @return statChanges
     */
    public List<@Valid MoveMetaStatChange> getStatChanges() {
        return statChanges;
    }

    public void setStatChanges(List<@Valid MoveMetaStatChange> statChanges) {
        this.statChanges = statChanges;
    }

    /**
     * The effect the move has when used in a super contest.
     * @return superContestEffect
     */
    public SuperContestEffectSummary getSuperContestEffect() {
        return superContestEffect;
    }

    public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
        this.superContestEffect = superContestEffect;
    }

    /**
     * The type of target that will receive the effects of the attack.
     * @return target
     */
    public MoveTargetSummary getTarget() {
        return target;
    }

    public void setTarget(MoveTargetSummary target) {
        this.target = target;
    }

    /**
     * The elemental type of this move.
     * @return type
     */
    public TypeSummary getType() {
        return type;
    }

    public void setType(TypeSummary type) {
        this.type = type;
    }

    /**
     * A list of the machines that teach this move.
     * @return machines
     */
    public List<@Valid ItemMachine> getMachines() {
        return machines;
    }

    public void setMachines(List<@Valid ItemMachine> machines) {
        this.machines = machines;
    }

    /**
     * The flavor text of this move listed in different languages.
     * @return flavorTextEntries
     */
    public List<@Valid MoveFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * List of Pokemon that can learn the move
     * @return learnedByPokemon
     */
    public List<@Valid PokemonSummary> getLearnedByPokemon() {
        return learnedByPokemon;
    }

    public void setLearnedByPokemon(List<@Valid PokemonSummary> learnedByPokemon) {
        this.learnedByPokemon = learnedByPokemon;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveDetail {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
        sb.append("    effectChance: ").append(toIndentedString(effectChance)).append("\n");
        sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    contestCombos: ").append(toIndentedString(contestCombos)).append("\n");
        sb.append("    contestType: ").append(toIndentedString(contestType)).append("\n");
        sb.append("    contestEffect: ").append(toIndentedString(contestEffect)).append("\n");
        sb.append("    damageClass: ").append(toIndentedString(damageClass)).append("\n");
        sb.append("    effectEntries: ").append(toIndentedString(effectEntries)).append("\n");
        sb.append("    effectChanges: ").append(toIndentedString(effectChanges)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    names: ").append(toIndentedString(names)).append("\n");
        sb.append("    pastValues: ").append(toIndentedString(pastValues)).append("\n");
        sb.append("    statChanges: ").append(toIndentedString(statChanges)).append("\n");
        sb.append("    superContestEffect: ").append(toIndentedString(superContestEffect)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
        sb.append("    flavorTextEntries: ").append(toIndentedString(flavorTextEntries)).append("\n");
        sb.append("    learnedByPokemon: ").append(toIndentedString(learnedByPokemon)).append("\n");
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

