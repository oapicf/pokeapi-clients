namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MoveLearnMethodDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<MoveLearnMethodName> Names { get; set; }
    public List<MoveLearnMethodDescription> Descriptions { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> VersionGroups { get; set; }
}


