namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedPokemonSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<PokemonSummary> Results { get; set; }
}


