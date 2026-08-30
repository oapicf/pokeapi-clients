namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BerryFlavorDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<BerryFlavorDetailBerriesInner> Berries { get; set; }
    public ContestTypeSummary ContestType { get; set; }
    public List<BerryFlavorName> Names { get; set; }
}


