namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MoveMetaAilmentDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> Moves { get; set; }
    public List<MoveMetaAilmentName> Names { get; set; }
}


