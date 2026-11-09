/*
 * PokemonSpritesOther.h
 *
 * 
 */

#ifndef _PokemonSpritesOther_H_
#define _PokemonSpritesOther_H_


#include <string>
#include "PokemonSpritesOtherDreamWorld.h"
#include "PokemonSpritesOtherHome.h"
#include "PokemonSpritesOtherOfficialArtwork.h"
#include "PokemonSpritesOtherShowdown.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpritesOther : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpritesOther();
	PokemonSpritesOther(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpritesOther();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pokémon Dream World artwork URLs.
	 */
	PokemonSpritesOtherDreamWorld getDreamWorld();

	/*! \brief Set Pokémon Dream World artwork URLs.
	 */
	void setDreamWorld(PokemonSpritesOtherDreamWorld  dream_world);
	/*! \brief Get Pokémon HOME sprite URLs.
	 */
	PokemonSpritesOtherHome getHome();

	/*! \brief Set Pokémon HOME sprite URLs.
	 */
	void setHome(PokemonSpritesOtherHome  home);
	/*! \brief Get Pokémon Showdown sprite URLs.
	 */
	PokemonSpritesOtherShowdown getShowdown();

	/*! \brief Set Pokémon Showdown sprite URLs.
	 */
	void setShowdown(PokemonSpritesOtherShowdown  showdown);
	/*! \brief Get Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
	 */
	PokemonSpritesOtherOfficialArtwork getOfficialartwork();

	/*! \brief Set Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
	 */
	void setOfficialartwork(PokemonSpritesOtherOfficialArtwork  officialartwork);

private:
	PokemonSpritesOtherDreamWorld dream_world;
	PokemonSpritesOtherHome home;
	PokemonSpritesOtherShowdown showdown;
	PokemonSpritesOtherOfficialArtwork officialartwork;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpritesOther_H_ */
