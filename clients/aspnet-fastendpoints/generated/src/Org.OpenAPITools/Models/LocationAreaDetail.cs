namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LocationAreaDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int GameIndex { get; set; }
    public List<LocationAreaEncounterRate> EncounterMethodRates { get; set; }
    public LocationSummary Location { get; set; }
    public List<LocationAreaName> Names { get; set; }
    public List<LocationAreaPokemonEncounter> PokemonEncounters { get; set; }
}


