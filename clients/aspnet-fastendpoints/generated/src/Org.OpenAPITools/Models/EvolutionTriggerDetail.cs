namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EvolutionTriggerDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<EvolutionTriggerName> Names { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> PokemonSpecies { get; set; }
}


