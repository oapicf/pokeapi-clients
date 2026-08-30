namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedEvolutionTriggerSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<EvolutionTriggerSummary> Results { get; set; }
}


