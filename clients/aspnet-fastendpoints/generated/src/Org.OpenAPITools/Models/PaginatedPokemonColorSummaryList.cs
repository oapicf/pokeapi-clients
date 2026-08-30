namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedPokemonColorSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<PokemonColorSummary> Results { get; set; }
}


