namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BerryFirmnessDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<BerrySummary> Berries { get; set; }
    public List<BerryFirmnessName> Names { get; set; }
}


