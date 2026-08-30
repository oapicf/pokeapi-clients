namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class StatDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public int GameIndex { get; set; }
    public bool IsBattleOnly { get; set; }
    public StatDetailAffectingMoves AffectingMoves { get; set; }
    public StatDetailAffectingNatures AffectingNatures { get; set; }
    public List<CharacteristicSummary> Characteristics { get; set; }
    public MoveDamageClassSummary MoveDamageClass { get; set; }
    public List<StatName> Names { get; set; }
}


