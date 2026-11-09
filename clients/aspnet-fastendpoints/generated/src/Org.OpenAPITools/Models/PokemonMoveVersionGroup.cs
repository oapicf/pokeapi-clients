namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonMoveVersionGroup 
{
    public int LevelLearnedAt { get; set; }
    public MoveLearnMethodSummary MoveLearnMethod { get; set; }
    public VersionGroupSummary VersionGroup { get; set; }
    public int Order { get; set; }
}


