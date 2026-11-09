namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonSpeciesDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int Order { get; set; }
    public int GenderRate { get; set; }
    public int CaptureRate { get; set; }
    public int BaseHappiness { get; set; }
    public bool IsBaby { get; set; }
    public bool IsLegendary { get; set; }
    public bool IsMythical { get; set; }
    public int HatchCounter { get; set; }
    public bool HasGenderDifferences { get; set; }
    public bool FormsSwitchable { get; set; }
    public GrowthRateSummary GrowthRate { get; set; }
    public List<PokemonDexEntry> PokedexNumbers { get; set; }
    public List<EggGroupSummary> EggGroups { get; set; }
    public PokemonColorSummary Color { get; set; }
    public PokemonShapeSummary Shape { get; set; }
    public PokemonSpeciesSummary EvolvesFromSpecies { get; set; }
    public EvolutionChainSummary EvolutionChain { get; set; }
    public PokemonHabitatSummary Habitat { get; set; }
    public GenerationSummary Generation { get; set; }
    public List<PokemonSpeciesName> Names { get; set; }
    public List<PokemonSpeciesPalParkEncounter> PalParkEncounters { get; set; }
    public List<PokemonSpeciesDescription> FormDescriptions { get; set; }
    public List<PokemonSpeciesFlavorText> FlavorTextEntries { get; set; }
    public List<PokemonSpeciesGenus> Genera { get; set; }
    public List<PokemonSpeciesVariety> Varieties { get; set; }
}


