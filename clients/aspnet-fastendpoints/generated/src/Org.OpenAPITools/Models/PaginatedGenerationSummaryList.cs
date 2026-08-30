namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedGenerationSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<GenerationSummary> Results { get; set; }
}


