namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AbilityDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public bool IsMainSeries { get; set; }
    public GenerationSummary Generation { get; set; }
    public List<AbilityName> Names { get; set; }
    public List<AbilityEffectText> EffectEntries { get; set; }
    public List<AbilityChange> EffectChanges { get; set; }
    public List<AbilityFlavorText> FlavorTextEntries { get; set; }
    public List<AbilityDetailPokemonInner> Pokemon { get; set; }
}


