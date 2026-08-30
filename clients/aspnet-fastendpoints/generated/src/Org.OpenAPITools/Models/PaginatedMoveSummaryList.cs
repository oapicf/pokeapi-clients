namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedMoveSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<MoveSummary> Results { get; set; }
}


