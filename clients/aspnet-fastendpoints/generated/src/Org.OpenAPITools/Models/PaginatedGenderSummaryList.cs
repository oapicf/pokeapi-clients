namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedGenderSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<GenderSummary> Results { get; set; }
}


