namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PaginatedMoveLearnMethodSummaryList 
{
    public int Count { get; set; }
    public string Next { get; set; }
    public string Previous { get; set; }
    public List<MoveLearnMethodSummary> Results { get; set; }
}


