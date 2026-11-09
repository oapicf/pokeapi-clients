namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokeathlonStatDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public PokeathlonStatAffectingNatures AffectingNatures { get; set; }
    public List<PokeathlonStatName> Names { get; set; }
}


