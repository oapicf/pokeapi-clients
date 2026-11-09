
/*
 * PokemonSpritesOtherHome.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpritesOtherHome_H_
#define TINY_CPP_CLIENT_PokemonSpritesOtherHome_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpritesOtherHome{
public:

    /*! \brief Constructor.
	 */
    PokemonSpritesOtherHome();
    PokemonSpritesOtherHome(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpritesOtherHome();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The URL of the default Pokémon HOME front image, or null if unavailable.
	 */
	std::string getFrontDefault();

	/*! \brief Set The URL of the default Pokémon HOME front image, or null if unavailable.
	 */
	void setFrontDefault(std::string front_default);
	/*! \brief Get The URL of the female Pokémon HOME front image, or null if unavailable.
	 */
	std::string getFrontFemale();

	/*! \brief Set The URL of the female Pokémon HOME front image, or null if unavailable.
	 */
	void setFrontFemale(std::string front_female);
	/*! \brief Get The URL of the shiny Pokémon HOME front image, or null if unavailable.
	 */
	std::string getFrontShiny();

	/*! \brief Set The URL of the shiny Pokémon HOME front image, or null if unavailable.
	 */
	void setFrontShiny(std::string front_shiny);
	/*! \brief Get The URL of the shiny female Pokémon HOME front image, or null if unavailable.
	 */
	std::string getFrontShinyFemale();

	/*! \brief Set The URL of the shiny female Pokémon HOME front image, or null if unavailable.
	 */
	void setFrontShinyFemale(std::string front_shiny_female);


    private:
    std::string front_default{};
    std::string front_female{};
    std::string front_shiny{};
    std::string front_shiny_female{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpritesOtherHome_H_ */
