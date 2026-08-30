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
    public PokemonFormDetailSprites Sprites { get; set; }
    public VersionGroupSummary VersionGroup { get; set; }
    public List<PokemonFormDetailFormNamesInner> FormNames { get; set; }
    public List<PokemonFormDetailFormNamesInner> Names { get; set; }
    public List<PokemonDetailTypesInner> Types { get; set; }
}


