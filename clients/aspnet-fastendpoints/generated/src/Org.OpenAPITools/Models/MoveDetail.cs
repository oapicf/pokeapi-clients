namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MoveDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int Accuracy { get; set; }
    public int EffectChance { get; set; }
    public int Pp { get; set; }
    public int Priority { get; set; }
    public int Power { get; set; }
    public MoveDetailContestCombos ContestCombos { get; set; }
    public ContestTypeSummary ContestType { get; set; }
    public ContestEffectSummary ContestEffect { get; set; }
    public MoveDamageClassSummary DamageClass { get; set; }
    public List<MoveChangeEffectEntriesInner> EffectEntries { get; set; }
    public List<MoveDetailEffectChangesInner> EffectChanges { get; set; }
    public GenerationSummary Generation { get; set; }
    public MoveMeta Meta { get; set; }
    public List<MoveName> Names { get; set; }
    public List<MoveChange> PastValues { get; set; }
    public List<MoveDetailStatChangesInner> StatChanges { get; set; }
    public SuperContestEffectSummary SuperContestEffect { get; set; }
    public MoveTargetSummary Target { get; set; }
    public TypeSummary Type { get; set; }
    public List<MoveDetailMachinesInner> Machines { get; set; }
    public List<MoveFlavorText> FlavorTextEntries { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> LearnedByPokemon { get; set; }
}


