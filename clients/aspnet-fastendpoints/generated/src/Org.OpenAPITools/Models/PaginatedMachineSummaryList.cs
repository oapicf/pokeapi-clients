namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedMachineSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<MachineSummary> Results { get; set; }
}


