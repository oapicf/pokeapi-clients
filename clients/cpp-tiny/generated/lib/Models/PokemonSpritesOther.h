
/*
 * PokemonSpritesOther.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpritesOther_H_
#define TINY_CPP_CLIENT_PokemonSpritesOther_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonSpritesOtherDreamWorld.h"
#include "PokemonSpritesOtherHome.h"
#include "PokemonSpritesOtherOfficialArtwork.h"
#include "PokemonSpritesOtherShowdown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpritesOther{
public:

    /*! \brief Constructor.
	 */
    PokemonSpritesOther();
    PokemonSpritesOther(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpritesOther();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Pokémon Dream World artwork URLs.
	 */
	PokemonSpritesOtherDreamWorld getDreamWorld();

	/*! \brief Set Pokémon Dream World artwork URLs.
	 */
	void setDreamWorld(PokemonSpritesOtherDreamWorld dream_world);
	/*! \brief Get Pokémon HOME sprite URLs.
	 */
	PokemonSpritesOtherHome getHome();

	/*! \brief Set Pokémon HOME sprite URLs.
	 */
	void setHome(PokemonSpritesOtherHome home);
	/*! \brief Get Pokémon Showdown sprite URLs.
	 */
	PokemonSpritesOtherShowdown getShowdown();

	/*! \brief Set Pokémon Showdown sprite URLs.
	 */
	void setShowdown(PokemonSpritesOtherShowdown showdown);
	/*! \brief Get Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
	 */
	PokemonSpritesOtherOfficialArtwork getOfficialartwork();

	/*! \brief Set Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
	 */
	void setOfficialartwork(PokemonSpritesOtherOfficialArtwork officialartwork);


    private:
    PokemonSpritesOtherDreamWorld dream_world;
    PokemonSpritesOtherHome home;
    PokemonSpritesOtherShowdown showdown;
    PokemonSpritesOtherOfficialArtwork officialartwork;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpritesOther_H_ */
