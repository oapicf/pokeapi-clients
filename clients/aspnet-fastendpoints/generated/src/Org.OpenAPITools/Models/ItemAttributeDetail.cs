namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ItemAttributeDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<ItemAttributeDescription> Descriptions { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> Items { get; set; }
    public List<ItemAttributeName> Names { get; set; }
}


