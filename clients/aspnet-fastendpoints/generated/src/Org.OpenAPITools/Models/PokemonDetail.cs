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
    public List<PokemonAbility> Abilities { get; set; }
    public List<PokemonPastAbility> PastAbilities { get; set; }
    public List<PokemonFormSummary> Forms { get; set; }
    public List<PokemonGameIndex> GameIndices { get; set; }
    public List<PokemonHeldItemSummary> HeldItems { get; set; }
    public string LocationAreaEncounters { get; set; }
    public List<PokemonMove> Moves { get; set; }
    public PokemonSpeciesSummary Species { get; set; }
    public PokemonSprites Sprites { get; set; }
    public PokemonCries Cries { get; set; }
    public List<PokemonStat> Stats { get; set; }
    public List<PokemonPastStat> PastStats { get; set; }
    public List<PokemonType> Types { get; set; }
    public List<PokemonPastType> PastTypes { get; set; }
}


