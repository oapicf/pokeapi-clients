namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedPokemonSpeciesSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<PokemonSpeciesSummary> Results { get; set; }
}


