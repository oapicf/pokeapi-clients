namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedItemFlingEffectSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<ItemFlingEffectSummary> Results { get; set; }
}


