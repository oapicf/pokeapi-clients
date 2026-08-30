namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedItemPocketSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<ItemPocketSummary> Results { get; set; }
}


