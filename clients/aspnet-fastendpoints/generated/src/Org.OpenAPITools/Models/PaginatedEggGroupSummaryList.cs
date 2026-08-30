namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedEggGroupSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<EggGroupSummary> Results { get; set; }
}


