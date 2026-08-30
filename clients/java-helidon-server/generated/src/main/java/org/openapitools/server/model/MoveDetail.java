package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AbilityDetailPokemonInnerPokemon;
import org.openapitools.server.model.ContestEffectSummary;
import org.openapitools.server.model.ContestTypeSummary;
import org.openapitools.server.model.GenerationSummary;
import org.openapitools.server.model.MoveChange;
import org.openapitools.server.model.MoveChangeEffectEntriesInner;
import org.openapitools.server.model.MoveDamageClassSummary;
import org.openapitools.server.model.MoveDetailContestCombos;
import org.openapitools.server.model.MoveDetailEffectChangesInner;
import org.openapitools.server.model.MoveDetailMachinesInner;
import org.openapitools.server.model.MoveDetailStatChangesInner;
import org.openapitools.server.model.MoveFlavorText;
import org.openapitools.server.model.MoveMeta;
import org.openapitools.server.model.MoveName;
import org.openapitools.server.model.MoveTargetSummary;
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
    private MoveDetailContestCombos contestCombos;
    private ContestTypeSummary contestType;
    private ContestEffectSummary contestEffect;
    private MoveDamageClassSummary damageClass;
    private List<@Valid MoveChangeEffectEntriesInner> effectEntries = new ArrayList<>();
    private List<@Valid MoveDetailEffectChangesInner> effectChanges = new ArrayList<>();
    private GenerationSummary generation;
    private MoveMeta meta;
    private List<@Valid MoveName> names = new ArrayList<>();
    private List<@Valid MoveChange> pastValues = new ArrayList<>();
    private List<@Valid MoveDetailStatChangesInner> statChanges = new ArrayList<>();
    private SuperContestEffectSummary superContestEffect;
    private MoveTargetSummary target;
    private TypeSummary type;
    private List<@Valid MoveDetailMachinesInner> machines = new ArrayList<>();
    private List<@Valid MoveFlavorText> flavorTextEntries = new ArrayList<>();
    private List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MoveDetail() {
    // JSON-B / Jackson
    }

    /**
     * Create MoveDetail.
     *
     * @param id id
     * @param name name
     * @param accuracy accuracy
     * @param effectChance effectChance
     * @param pp pp
     * @param priority priority
     * @param power power
     * @param contestCombos contestCombos
     * @param contestType contestType
     * @param contestEffect contestEffect
     * @param damageClass damageClass
     * @param effectEntries effectEntries
     * @param effectChanges effectChanges
     * @param generation generation
     * @param meta meta
     * @param names names
     * @param pastValues pastValues
     * @param statChanges statChanges
     * @param superContestEffect superContestEffect
     * @param target target
     * @param type type
     * @param machines machines
     * @param flavorTextEntries flavorTextEntries
     * @param learnedByPokemon learnedByPokemon
     */
    public MoveDetail(
        Integer id, 
        String name, 
        Integer accuracy, 
        Integer effectChance, 
        Integer pp, 
        Integer priority, 
        Integer power, 
        MoveDetailContestCombos contestCombos, 
        ContestTypeSummary contestType, 
        ContestEffectSummary contestEffect, 
        MoveDamageClassSummary damageClass, 
        List<@Valid MoveChangeEffectEntriesInner> effectEntries, 
        List<@Valid MoveDetailEffectChangesInner> effectChanges, 
        GenerationSummary generation, 
        MoveMeta meta, 
        List<@Valid MoveName> names, 
        List<@Valid MoveChange> pastValues, 
        List<@Valid MoveDetailStatChangesInner> statChanges, 
        SuperContestEffectSummary superContestEffect, 
        MoveTargetSummary target, 
        TypeSummary type, 
        List<@Valid MoveDetailMachinesInner> machines, 
        List<@Valid MoveFlavorText> flavorTextEntries, 
        List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon
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
     * Get accuracy
     * @return accuracy
     */
    public Integer getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Integer accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * Get effectChance
     * @return effectChance
     */
    public Integer getEffectChance() {
        return effectChance;
    }

    public void setEffectChance(Integer effectChance) {
        this.effectChance = effectChance;
    }

    /**
     * Get pp
     * @return pp
     */
    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    /**
     * Get priority
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Get power
     * @return power
     */
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * Get contestCombos
     * @return contestCombos
     */
    public MoveDetailContestCombos getContestCombos() {
        return contestCombos;
    }

    public void setContestCombos(MoveDetailContestCombos contestCombos) {
        this.contestCombos = contestCombos;
    }

    /**
     * Get contestType
     * @return contestType
     */
    public ContestTypeSummary getContestType() {
        return contestType;
    }

    public void setContestType(ContestTypeSummary contestType) {
        this.contestType = contestType;
    }

    /**
     * Get contestEffect
     * @return contestEffect
     */
    public ContestEffectSummary getContestEffect() {
        return contestEffect;
    }

    public void setContestEffect(ContestEffectSummary contestEffect) {
        this.contestEffect = contestEffect;
    }

    /**
     * Get damageClass
     * @return damageClass
     */
    public MoveDamageClassSummary getDamageClass() {
        return damageClass;
    }

    public void setDamageClass(MoveDamageClassSummary damageClass) {
        this.damageClass = damageClass;
    }

    /**
     * Get effectEntries
     * @return effectEntries
     */
    public List<@Valid MoveChangeEffectEntriesInner> getEffectEntries() {
        return effectEntries;
    }

    public void setEffectEntries(List<@Valid MoveChangeEffectEntriesInner> effectEntries) {
        this.effectEntries = effectEntries;
    }

    /**
     * Get effectChanges
     * @return effectChanges
     */
    public List<@Valid MoveDetailEffectChangesInner> getEffectChanges() {
        return effectChanges;
    }

    public void setEffectChanges(List<@Valid MoveDetailEffectChangesInner> effectChanges) {
        this.effectChanges = effectChanges;
    }

    /**
     * Get generation
     * @return generation
     */
    public GenerationSummary getGeneration() {
        return generation;
    }

    public void setGeneration(GenerationSummary generation) {
        this.generation = generation;
    }

    /**
     * Get meta
     * @return meta
     */
    public MoveMeta getMeta() {
        return meta;
    }

    public void setMeta(MoveMeta meta) {
        this.meta = meta;
    }

    /**
     * Get names
     * @return names
     */
    public List<@Valid MoveName> getNames() {
        return names;
    }

    public void setNames(List<@Valid MoveName> names) {
        this.names = names;
    }

    /**
     * Get pastValues
     * @return pastValues
     */
    public List<@Valid MoveChange> getPastValues() {
        return pastValues;
    }

    public void setPastValues(List<@Valid MoveChange> pastValues) {
        this.pastValues = pastValues;
    }

    /**
     * Get statChanges
     * @return statChanges
     */
    public List<@Valid MoveDetailStatChangesInner> getStatChanges() {
        return statChanges;
    }

    public void setStatChanges(List<@Valid MoveDetailStatChangesInner> statChanges) {
        this.statChanges = statChanges;
    }

    /**
     * Get superContestEffect
     * @return superContestEffect
     */
    public SuperContestEffectSummary getSuperContestEffect() {
        return superContestEffect;
    }

    public void setSuperContestEffect(SuperContestEffectSummary superContestEffect) {
        this.superContestEffect = superContestEffect;
    }

    /**
     * Get target
     * @return target
     */
    public MoveTargetSummary getTarget() {
        return target;
    }

    public void setTarget(MoveTargetSummary target) {
        this.target = target;
    }

    /**
     * Get type
     * @return type
     */
    public TypeSummary getType() {
        return type;
    }

    public void setType(TypeSummary type) {
        this.type = type;
    }

    /**
     * Get machines
     * @return machines
     */
    public List<@Valid MoveDetailMachinesInner> getMachines() {
        return machines;
    }

    public void setMachines(List<@Valid MoveDetailMachinesInner> machines) {
        this.machines = machines;
    }

    /**
     * Get flavorTextEntries
     * @return flavorTextEntries
     */
    public List<@Valid MoveFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    public void setFlavorTextEntries(List<@Valid MoveFlavorText> flavorTextEntries) {
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * Get learnedByPokemon
     * @return learnedByPokemon
     */
    public List<@Valid AbilityDetailPokemonInnerPokemon> getLearnedByPokemon() {
        return learnedByPokemon;
    }

    public void setLearnedByPokemon(List<@Valid AbilityDetailPokemonInnerPokemon> learnedByPokemon) {
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

