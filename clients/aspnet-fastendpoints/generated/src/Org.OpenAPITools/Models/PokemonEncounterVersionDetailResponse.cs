namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonEncounterVersionDetailResponse 
{
    public VersionSummary VarVersion { get; set; }
    public int MaxChance { get; set; }
    public List<PokemonEncounterDetailResponse> EncounterDetails { get; set; }
}


