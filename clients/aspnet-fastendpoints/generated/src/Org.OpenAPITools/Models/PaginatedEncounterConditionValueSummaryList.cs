namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedEncounterConditionValueSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<EncounterConditionValueSummary> Results { get; set; }
}


