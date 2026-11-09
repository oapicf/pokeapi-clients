namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonFormSprites 
{
    public string FrontDefault { get; set; }
    public string FrontShiny { get; set; }
    public string FrontFemale { get; set; }
    public string FrontShinyFemale { get; set; }
    public string BackDefault { get; set; }
    public string BackShiny { get; set; }
    public string BackFemale { get; set; }
    public string BackShinyFemale { get; set; }
    public PokemonSpritesOther Other { get; set; }
    public Dictionary<string, Dictionary<string, Object>> Versions { get; set; }
}


