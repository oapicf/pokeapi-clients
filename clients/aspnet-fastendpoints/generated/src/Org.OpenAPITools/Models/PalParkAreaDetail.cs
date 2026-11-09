namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PalParkAreaDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<PalParkAreaName> Names { get; set; }
    public List<PalParkEncounter> PokemonEncounters { get; set; }
}


