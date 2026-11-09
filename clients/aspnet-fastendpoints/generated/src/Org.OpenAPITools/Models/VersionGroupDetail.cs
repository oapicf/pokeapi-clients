namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class VersionGroupDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int Order { get; set; }
    public GenerationSummary Generation { get; set; }
    public List<MoveLearnMethodSummary> MoveLearnMethods { get; set; }
    public List<PokedexSummary> Pokedexes { get; set; }
    public List<RegionSummary> Regions { get; set; }
    public List<VersionSummary> Versions { get; set; }
}


