namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MoveChange 
{
    public int Accuracy { get; set; }
    public int Power { get; set; }
    public int Pp { get; set; }
    public int EffectChance { get; set; }
    public List<MoveChangeEffectEntriesInner> EffectEntries { get; set; }
    public TypeSummary Type { get; set; }
    public VersionGroupSummary VersionGroup { get; set; }
}


