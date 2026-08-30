namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedMoveBattleStyleSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<MoveBattleStyleSummary> Results { get; set; }
}


