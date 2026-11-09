namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonEncounterResponse 
{
    public LocationAreaSummary LocationArea { get; set; }
    public List<PokemonEncounterVersionDetailResponse> VersionDetails { get; set; }
}


