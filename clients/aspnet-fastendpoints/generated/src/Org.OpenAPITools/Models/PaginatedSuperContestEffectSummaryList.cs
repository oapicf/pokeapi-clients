namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedSuperContestEffectSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<SuperContestEffectSummary> Results { get; set; }
}


