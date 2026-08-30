namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MoveMeta 
{
    public MoveMetaAilmentSummary Ailment { get; set; }
    public MoveMetaCategorySummary Category { get; set; }
    public int MinHits { get; set; }
    public int MaxHits { get; set; }
    public int MinTurns { get; set; }
    public int MaxTurns { get; set; }
    public int Drain { get; set; }
    public int Healing { get; set; }
    public int CritRate { get; set; }
    public int AilmentChance { get; set; }
    public int FlinchChance { get; set; }
    public int StatChance { get; set; }
}


