
package org.openapitools.client.model


case class PokemonShapeDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The \"scientific\" name of this Pokémon shape listed in different languages. */
    _awesomeNames: List[PokemonShapeAwesomeName],
    /* The name of this resource listed in different languages. */
    _names: List[PokemonShapeName],
    /* A list of the Pokémon species that have this shape. */
    _pokemonSpecies: List[PokemonSpeciesSummary]
)
object PokemonShapeDetail {
    def toStringBody(var_id: Object, var_name: Object, var_awesomeNames: Object, var_names: Object, var_pokemonSpecies: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"awesomeNames":$var_awesomeNames,"names":$var_names,"pokemonSpecies":$var_pokemonSpecies
        | }
        """.stripMargin
}
