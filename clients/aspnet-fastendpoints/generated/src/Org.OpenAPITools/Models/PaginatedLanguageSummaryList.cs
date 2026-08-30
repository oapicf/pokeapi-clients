namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedLanguageSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<LanguageSummary> Results { get; set; }
}


