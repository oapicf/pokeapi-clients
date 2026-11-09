namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GenderDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<GenderPokemonSpecies> PokemonSpeciesDetails { get; set; }
    public List<PokemonSpeciesSummary> RequiredForEvolution { get; set; }
}


