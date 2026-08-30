namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedTypeSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<TypeSummary> Results { get; set; }
}


