namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonFormDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int Order { get; set; }
    public int FormOrder { get; set; }
    public bool IsDefault { get; set; }
    public bool IsBattleOnly { get; set; }
    public bool IsMega { get; set; }
    public string FormName { get; set; }
    public PokemonSummary Pokemon { get; set; }
    public PokemonFormSprites Sprites { get; set; }
    public VersionGroupSummary VersionGroup { get; set; }
    public List<PokemonFormName> FormNames { get; set; }
    public List<PokemonFormName> Names { get; set; }
    public List<PokemonFormType> Types { get; set; }
    public List<PokemonFormTriggerCondition> TriggerConditions { get; set; }
    public List<PokemonFormFlavorText> FlavorTextEntries { get; set; }
}


