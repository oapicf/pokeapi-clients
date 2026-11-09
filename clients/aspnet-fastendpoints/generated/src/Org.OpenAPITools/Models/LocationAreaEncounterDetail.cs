namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LocationAreaEncounterDetail 
{
    public int MinLevel { get; set; }
    public int MaxLevel { get; set; }
    public int Chance { get; set; } = 0;
    public EncounterMethodSummary Method { get; set; }
    public List<EncounterConditionValueSummary> ConditionValues { get; set; }
    public EncounterPokemonDetail PokemonDetails { get; set; }
}


