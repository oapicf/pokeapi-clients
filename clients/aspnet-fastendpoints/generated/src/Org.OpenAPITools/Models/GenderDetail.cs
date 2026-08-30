namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class GenderDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<GenderDetailPokemonSpeciesDetailsInner> PokemonSpeciesDetails { get; set; }
    public List<AbilityDetailPokemonInnerPokemon> RequiredForEvolution { get; set; }
}


