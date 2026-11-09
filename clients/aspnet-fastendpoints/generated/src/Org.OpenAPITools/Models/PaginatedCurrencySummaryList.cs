namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedCurrencySummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<CurrencySummary> Results { get; set; }
}


