namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedPokemonFormSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<PokemonFormSummary> Results { get; set; }
}


