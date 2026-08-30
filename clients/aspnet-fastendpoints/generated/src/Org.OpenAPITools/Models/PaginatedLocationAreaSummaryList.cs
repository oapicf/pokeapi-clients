namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedLocationAreaSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<LocationAreaSummary> Results { get; set; }
}


