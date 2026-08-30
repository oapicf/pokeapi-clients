namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ContestEffectDetail 
{
    public int Id { get; set; }
    public int Appeal { get; set; }
    public int Jam { get; set; }
    public List<ContestEffectEffectText> EffectEntries { get; set; }
    public List<ContestEffectFlavorText> FlavorTextEntries { get; set; }
}


