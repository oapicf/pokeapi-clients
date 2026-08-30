namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ItemPocketDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<ItemCategorySummary> Categories { get; set; }
    public List<ItemPocketName> Names { get; set; }
}


