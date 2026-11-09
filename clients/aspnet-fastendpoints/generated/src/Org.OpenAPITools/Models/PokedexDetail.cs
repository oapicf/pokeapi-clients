namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokedexDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public bool IsMainSeries { get; set; }
    public List<PokedexDescription> Descriptions { get; set; }
    public List<PokedexName> Names { get; set; }
    public List<PokemonDexNumber> PokemonEntries { get; set; }
    public RegionSummary Region { get; set; }
    public List<VersionGroupSummary> VersionGroups { get; set; }
}


