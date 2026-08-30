namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedItemCategorySummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<ItemCategorySummary> Results { get; set; }
}


