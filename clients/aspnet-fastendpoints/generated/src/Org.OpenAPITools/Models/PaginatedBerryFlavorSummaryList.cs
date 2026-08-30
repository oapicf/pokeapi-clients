namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedBerryFlavorSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<BerryFlavorSummary> Results { get; set; }
}


