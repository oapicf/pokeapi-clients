package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PokemonSpritesOtherDreamWorld;
import org.openapitools.model.PokemonSpritesOtherHome;
import org.openapitools.model.PokemonSpritesOtherOfficialArtwork;
import org.openapitools.model.PokemonSpritesOtherShowdown;

@Canonical
class PokemonSpritesOther {
    /* Pokémon Dream World artwork URLs. */
    PokemonSpritesOtherDreamWorld dreamWorld
    /* Pokémon HOME sprite URLs. */
    PokemonSpritesOtherHome home
    /* Pokémon Showdown sprite URLs. */
    PokemonSpritesOtherShowdown showdown
    /* Official Pokémon artwork URLs, including shiny artwork and version-specific variants. */
    PokemonSpritesOtherOfficialArtwork officialArtwork
}
