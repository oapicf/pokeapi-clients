namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EncounterConditionValueDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public EncounterConditionSummary Condition { get; set; }
    public List<EncounterConditionValueName> Names { get; set; }
}


