namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonEncounterDetailResponse 
{
    public int Chance { get; set; }
    public List<EncounterConditionValueSummary> ConditionValues { get; set; }
    public int MaxLevel { get; set; }
    public EncounterMethodSummary Method { get; set; }
    public int MinLevel { get; set; }
}


