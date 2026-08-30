namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GrowthRateDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Formula { get; set; }
    public List<GrowthRateDescription> Descriptions { get; set; }
    public List<Experience> Levels { get; set; }
    public List<PokemonSpeciesSummary> PokemonSpecies { get; set; }
}


