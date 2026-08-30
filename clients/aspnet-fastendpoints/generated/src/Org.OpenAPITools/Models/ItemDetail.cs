namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ItemDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int Cost { get; set; }
    public int FlingPower { get; set; }
    public ItemFlingEffectSummary FlingEffect { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> Attributes { get; set; }
    public ItemCategorySummary Category { get; set; }
    public List<ItemEffectText> EffectEntries { get; set; }
    public List<ItemFlavorText> FlavorTextEntries { get; set; }
    public List<ItemGameIndex> GameIndices { get; set; }
    public List<ItemName> Names { get; set; }
    public List<ItemDetailHeldByPokemonInner> HeldByPokemon { get; set; }
    public ItemDetailSprites Sprites { get; set; }
    public ItemDetailBabyTriggerFor BabyTriggerFor { get; set; }
    public List<ItemDetailMachinesInner> Machines { get; set; }
}


