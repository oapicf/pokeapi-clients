namespace Org.OpenAPITools.Models;


/// <summary>
/// Serializer for the Type resource
/// </summary>
public class TypeDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public TypeDetailDamageRelations DamageRelations { get; set; }
    public List<TypeDetailPastDamageRelationsInner> PastDamageRelations { get; set; }
    public List<TypeGameIndex> GameIndices { get; set; }
    public GenerationSummary Generation { get; set; }
    public MoveDamageClassSummary MoveDamageClass { get; set; }
    public List<AbilityName> Names { get; set; }
    public List<TypeDetailPokemonInner> Pokemon { get; set; }
    public List<MoveSummary> Moves { get; set; }
    public Dictionary<string, Dictionary<string, TypeDetailSpritesValueValue>> Sprites { get; set; }
}


