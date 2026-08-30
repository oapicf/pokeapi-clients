namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MoveMetaCategoryDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<MoveMetaCategoryDescription> Descriptions { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> Moves { get; set; }
}


