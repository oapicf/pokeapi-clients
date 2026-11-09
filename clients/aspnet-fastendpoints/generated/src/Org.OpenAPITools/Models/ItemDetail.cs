namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ItemDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int FlingPower { get; set; }
    public ItemFlingEffectSummary FlingEffect { get; set; }
    public List<ItemAttributeSummary> Attributes { get; set; }
    public ItemCategorySummary Category { get; set; }
    public List<ItemEffectText> EffectEntries { get; set; }
    public List<ItemFlavorText> FlavorTextEntries { get; set; }
    public List<ItemGameIndex> GameIndices { get; set; }
    public List<ItemPrice> Prices { get; set; }
    public List<ItemName> Names { get; set; }
    public List<PokemonHeldItem> HeldByPokemon { get; set; }
    public ItemSprites Sprites { get; set; }
    public EvolutionChainSummary BabyTriggerFor { get; set; }
    public List<ItemMachine> Machines { get; set; }
}


