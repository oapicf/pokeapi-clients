namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedEncounterConditionSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<EncounterConditionSummary> Results { get; set; }
}


