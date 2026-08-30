namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedBerrySummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<BerrySummary> Results { get; set; }
}


