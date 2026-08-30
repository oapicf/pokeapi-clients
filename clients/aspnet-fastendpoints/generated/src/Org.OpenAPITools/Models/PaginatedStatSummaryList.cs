namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedStatSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<StatSummary> Results { get; set; }
}


