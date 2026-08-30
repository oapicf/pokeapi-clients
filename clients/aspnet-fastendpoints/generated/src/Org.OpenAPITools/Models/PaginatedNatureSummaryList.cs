namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedNatureSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<NatureSummary> Results { get; set; }
}


