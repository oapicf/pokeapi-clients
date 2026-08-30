namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedItemAttributeSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<ItemAttributeSummary> Results { get; set; }
}


