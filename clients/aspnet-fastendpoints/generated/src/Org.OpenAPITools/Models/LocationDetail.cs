namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LocationDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public RegionSummary Region { get; set; }
    public List<LocationName> Names { get; set; }
    public List<LocationGameIndex> GameIndices { get; set; }
    public List<LocationAreaSummary> Areas { get; set; }
}


