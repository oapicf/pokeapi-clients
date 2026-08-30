namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int BaseExperience { get; set; }
    public int Height { get; set; }
    public bool IsDefault { get; set; }
    public int Order { get; set; }
    public int Weight { get; set; }
    public List<PokemonDetailAbilitiesInner> Abilities { get; set; }
    public List<PokemonDetailPastAbilitiesInner> PastAbilities { get; set; }
    public List<PokemonFormSummary> Forms { get; set; }
    public List<PokemonGameIndex> GameIndices { get; set; }
    public PokemonDetailHeldItems HeldItems { get; set; }
    public string LocationAreaEncounters { get; set; }
    public List<PokemonDetailMovesInner> Moves { get; set; }
    public PokemonSpeciesSummary Species { get; set; }
    public PokemonDetailSprites Sprites { get; set; }
    public PokemonDetailCries Cries { get; set; }
    public List<PokemonStat> Stats { get; set; }
    public List<PokemonDetailTypesInner> Types { get; set; }
    public List<PokemonDetailPastTypesInner> PastTypes { get; set; }
}


