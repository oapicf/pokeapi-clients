namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ItemCategoryDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<ItemSummary> Items { get; set; }
    public List<ItemCategoryName> Names { get; set; }
    public ItemPocketSummary Pocket { get; set; }
}


