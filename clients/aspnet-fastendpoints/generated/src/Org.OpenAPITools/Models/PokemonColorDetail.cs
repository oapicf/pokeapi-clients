namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonColorDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<PokemonColorName> Names { get; set; }
    public List<PokemonSpeciesSummary> PokemonSpecies { get; set; }
}


