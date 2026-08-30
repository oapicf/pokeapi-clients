namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ContestTypeDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public BerryFlavorSummary BerryFlavor { get; set; }
    public List<ContestTypeName> Names { get; set; }
}


