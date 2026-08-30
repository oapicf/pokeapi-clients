namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RegionDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<LocationSummary> Locations { get; set; }
    public GenerationSummary MainGeneration { get; set; }
    public List<RegionName> Names { get; set; }
    public List<PokedexSummary> Pokedexes { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> VersionGroups { get; set; }
}


