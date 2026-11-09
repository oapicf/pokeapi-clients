/*
 * PokemonSpritesOtherDreamWorld.h
 *
 * 
 */

#ifndef _PokemonSpritesOtherDreamWorld_H_
#define _PokemonSpritesOtherDreamWorld_H_


#include <string>
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

class PokemonSpritesOtherDreamWorld : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpritesOtherDreamWorld();
	PokemonSpritesOtherDreamWorld(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpritesOtherDreamWorld();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The URL of the default Pokémon Dream World front image, or null if unavailable.
	 */
	std::string getFrontDefault();

	/*! \brief Set The URL of the default Pokémon Dream World front image, or null if unavailable.
	 */
	void setFrontDefault(std::string  front_default);
	/*! \brief Get The URL of the female Pokémon Dream World front image, or null if unavailable.
	 */
	std::string getFrontFemale();

	/*! \brief Set The URL of the female Pokémon Dream World front image, or null if unavailable.
	 */
	void setFrontFemale(std::string  front_female);

private:
	std::string front_default;
	std::string front_female;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpritesOtherDreamWorld_H_ */
