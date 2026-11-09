namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class EvolutionVariableDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public string Symbol { get; set; }
    public string DataType { get; set; }
    public string Source { get; set; }
    public VersionGroupSummary VersionGroup { get; set; }
    public List<EvolutionVariableName> Names { get; set; }
    public List<EvolutionVariableDescription> Descriptions { get; set; }
}


