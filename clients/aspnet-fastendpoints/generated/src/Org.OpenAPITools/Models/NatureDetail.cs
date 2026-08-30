namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class NatureDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public StatSummary DecreasedStat { get; set; }
    public StatSummary IncreasedStat { get; set; }
    public BerryFlavorSummary LikesFlavor { get; set; }
    public BerryFlavorSummary HatesFlavor { get; set; }
    public List<BerrySummary> Berries { get; set; }
    public List<NatureDetailPokeathlonStatChangesInner> PokeathlonStatChanges { get; set; }
    public List<NatureBattleStylePreference> MoveBattleStylePreferences { get; set; }
    public List<NatureName> Names { get; set; }
}


