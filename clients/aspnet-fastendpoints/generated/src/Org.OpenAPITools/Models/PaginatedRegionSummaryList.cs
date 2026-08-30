namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedRegionSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<RegionSummary> Results { get; set; }
}


