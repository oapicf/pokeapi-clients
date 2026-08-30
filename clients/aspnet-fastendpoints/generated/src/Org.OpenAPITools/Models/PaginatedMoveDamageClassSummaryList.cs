namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedMoveDamageClassSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<MoveDamageClassSummary> Results { get; set; }
}


