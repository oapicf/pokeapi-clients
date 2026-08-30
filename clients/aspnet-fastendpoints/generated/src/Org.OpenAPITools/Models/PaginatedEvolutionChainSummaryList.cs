namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedEvolutionChainSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<EvolutionChainSummary> Results { get; set; }
}


