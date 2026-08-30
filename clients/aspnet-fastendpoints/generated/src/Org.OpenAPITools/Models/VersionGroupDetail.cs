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
    public List<AbilityDetailPokemonInnerPokemon> MoveLearnMethods { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> Pokedexes { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> Regions { get; set; }
    public List<VersionSummary> Versions { get; set; }
}


