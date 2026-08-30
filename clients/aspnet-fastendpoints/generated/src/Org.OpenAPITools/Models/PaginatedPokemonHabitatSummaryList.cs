namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedPokemonHabitatSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<PokemonHabitatSummary> Results { get; set; }
}


