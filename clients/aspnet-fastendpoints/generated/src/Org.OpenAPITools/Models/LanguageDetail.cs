namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LanguageDetail 
{
    public int Id { get; set; }
    public string Name { get; set; }
    public bool Official { get; set; }
    public string Iso639 { get; set; }
    public string Iso3166 { get; set; }
    public List<LanguageName> Names { get; set; }
}


