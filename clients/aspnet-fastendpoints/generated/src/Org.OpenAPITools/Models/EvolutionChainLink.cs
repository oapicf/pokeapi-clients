namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EvolutionChainLink 
{
    public bool IsBaby { get; set; }
    public PokemonSpeciesSummary Species { get; set; }
    public List<PokemonEvolution> EvolutionDetails { get; set; }
    public List<EvolutionChainLink> EvolvesTo { get; set; }
}


