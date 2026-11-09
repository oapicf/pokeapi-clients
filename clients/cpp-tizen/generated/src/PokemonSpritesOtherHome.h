/*
 * PokemonSpritesOtherHome.h
 *
 * 
 */

#ifndef _PokemonSpritesOtherHome_H_
#define _PokemonSpritesOtherHome_H_


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

class PokemonSpritesOtherHome : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpritesOtherHome();
	PokemonSpritesOtherHome(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpritesOtherHome();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The URL of the default Pokémon HOME front image, or null if unavailable.
	 */
	std::string getFrontDefault();

	/*! \brief Set The URL of the default Pokémon HOME front image, or null if unavailable.
	 */
	void setFrontDefault(std::string  front_default);
	/*! \brief Get The URL of the female Pokémon HOME front image, or null if unavailable.
	 */
	std::string getFrontFemale();

	/*! \brief Set The URL of the female Pokémon HOME front image, or null if unavailable.
	 */
	void setFrontFemale(std::string  front_female);
	/*! \brief Get The URL of the shiny Pokémon HOME front image, or null if unavailable.
	 */
	std::string getFrontShiny();

	/*! \brief Set The URL of the shiny Pokémon HOME front image, or null if unavailable.
	 */
	void setFrontShiny(std::string  front_shiny);
	/*! \brief Get The URL of the shiny female Pokémon HOME front image, or null if unavailable.
	 */
	std::string getFrontShinyFemale();

	/*! \brief Set The URL of the shiny female Pokémon HOME front image, or null if unavailable.
	 */
	void setFrontShinyFemale(std::string  front_shiny_female);

private:
	std::string front_default;
	std::string front_female;
	std::string front_shiny;
	std::string front_shiny_female;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpritesOtherHome_H_ */
