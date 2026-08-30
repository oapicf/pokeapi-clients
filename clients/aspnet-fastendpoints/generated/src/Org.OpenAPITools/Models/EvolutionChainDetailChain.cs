namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EvolutionChainDetailChain 
{
    public List<Object> EvolutionDetails { get; set; }
    public List<EvolutionChainDetailChainEvolvesToInner> EvolvesTo { get; set; }
    public bool IsBaby { get; set; }
    public AbilityDetailPokemonInnerPokemon Species { get; set; }
}


