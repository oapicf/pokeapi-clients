namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CharacteristicDetail 
{
    public int Id { get; set; }
    public int GeneModulo { get; set; }
    public List<int> PossibleValues { get; set; }
    public StatSummary HighestStat { get; set; }
    public List<CharacteristicDescription> Descriptions { get; set; }
}


