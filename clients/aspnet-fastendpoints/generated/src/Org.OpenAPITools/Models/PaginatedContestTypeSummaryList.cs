namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedContestTypeSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<ContestTypeSummary> Results { get; set; }
}


