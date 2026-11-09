namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EggGroupDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<EggGroupName> Names { get; set; }
    public List<PokemonSpeciesSummary> PokemonSpecies { get; set; }
}


