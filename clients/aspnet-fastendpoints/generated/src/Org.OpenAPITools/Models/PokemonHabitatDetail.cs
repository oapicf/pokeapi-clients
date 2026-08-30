namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonHabitatDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<PokemonHabitatName> Names { get; set; }
    public List<PokemonSpeciesSummary> PokemonSpecies { get; set; }
}


