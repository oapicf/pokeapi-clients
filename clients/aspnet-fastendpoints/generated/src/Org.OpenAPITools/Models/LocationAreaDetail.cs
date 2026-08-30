namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LocationAreaDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int GameIndex { get; set; }
    public List<LocationAreaDetailEncounterMethodRatesInner> EncounterMethodRates { get; set; }
    public LocationSummary Location { get; set; }
    public List<LocationAreaName> Names { get; set; }
    public List<LocationAreaDetailPokemonEncountersInner> PokemonEncounters { get; set; }
}


