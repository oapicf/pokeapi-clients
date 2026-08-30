namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedBerryFirmnessSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<BerryFirmnessSummary> Results { get; set; }
}


