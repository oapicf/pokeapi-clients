namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class SuperContestEffectDetail 
{
    public int Id { get; set; }
    public int Appeal { get; set; }
    public List<SuperContestEffectFlavorText> FlavorTextEntries { get; set; }
    public List<MoveSummary> Moves { get; set; }
}


