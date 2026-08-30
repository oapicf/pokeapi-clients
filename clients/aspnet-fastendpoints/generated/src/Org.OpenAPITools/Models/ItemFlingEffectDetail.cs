namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ItemFlingEffectDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<ItemFlingEffectEffectText> EffectEntries { get; set; }
    public List<ItemSummary> Items { get; set; }
}


