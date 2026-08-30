namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GenerationDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<AbilitySummary> Abilities { get; set; }
    public RegionSummary MainRegion { get; set; }
    public List<MoveSummary> Moves { get; set; }
    public List<GenerationName> Names { get; set; }
    public List<PokemonSpeciesSummary> PokemonSpecies { get; set; }
    public List<TypeSummary> Types { get; set; }
    public List<VersionGroupSummary> VersionGroups { get; set; }
}


