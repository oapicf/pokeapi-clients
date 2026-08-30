namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedVersionSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<VersionSummary> Results { get; set; }
}


