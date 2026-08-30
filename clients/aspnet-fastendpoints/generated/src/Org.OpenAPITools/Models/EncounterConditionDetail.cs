namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EncounterConditionDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<EncounterConditionValueSummary> Values { get; set; }
    public List<EncounterConditionName> Names { get; set; }
}


