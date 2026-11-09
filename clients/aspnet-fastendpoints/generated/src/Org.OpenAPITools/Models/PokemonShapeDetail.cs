namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PokemonShapeDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public List<PokemonShapeAwesomeName> AwesomeNames { get; set; }
    public List<PokemonShapeName> Names { get; set; }
    public List<PokemonSpeciesSummary> PokemonSpecies { get; set; }
}


