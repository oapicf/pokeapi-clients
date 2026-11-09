namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonEvolution 
{
    public VersionGroupSummary VersionGroup { get; set; }
    public bool IsDefault { get; set; }
    public ItemSummary Item { get; set; }
    public EvolutionTriggerSummary Trigger { get; set; }
    public int Gender { get; set; }
    public ItemSummary HeldItem { get; set; }
    public PokemonEvolutionKnownMove KnownMove { get; set; }
    public PokemonEvolutionKnownMove KnownMoveType { get; set; }
    public LocationSummary Location { get; set; }
    public int MinLevel { get; set; }
    public int MinHappiness { get; set; }
    public int MinBeauty { get; set; }
    public int MinAffection { get; set; }
    public bool NearSpecialRock { get; set; }
    public bool NeedsMultiplayer { get; set; }
    public bool NeedsOverworldRain { get; set; }
    public PokemonSpeciesSummary PartySpecies { get; set; }
    public TypeSummary PartyType { get; set; }
    public int RelativePhysicalStats { get; set; }
    public string TimeOfDay { get; set; }
    public PokemonSpeciesSummary TradeSpecies { get; set; }
    public bool TurnUpsideDown { get; set; }
    public RegionSummary Region { get; set; }
    public PokemonFormSummary RequiredPokemonForm { get; set; }
    public PokemonFormSummary EvolvedPokemonForm { get; set; }
    public MoveSummary UsedMove { get; set; }
    public int MinMoveCount { get; set; }
    public int MinSteps { get; set; }
    public int MinDamageTaken { get; set; }
    public List<NatureSummary> AllowedNatures { get; set; }
    public EvolutionConditionExpression ConditionExpression { get; set; }
}


