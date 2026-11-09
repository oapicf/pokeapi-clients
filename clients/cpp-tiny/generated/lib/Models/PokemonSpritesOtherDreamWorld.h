
/*
 * PokemonSpritesOtherDreamWorld.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpritesOtherDreamWorld_H_
#define TINY_CPP_CLIENT_PokemonSpritesOtherDreamWorld_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpritesOtherDreamWorld{
public:

    /*! \brief Constructor.
	 */
    PokemonSpritesOtherDreamWorld();
    PokemonSpritesOtherDreamWorld(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpritesOtherDreamWorld();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The URL of the default Pokémon Dream World front image, or null if unavailable.
	 */
	std::string getFrontDefault();

	/*! \brief Set The URL of the default Pokémon Dream World front image, or null if unavailable.
	 */
	void setFrontDefault(std::string front_default);
	/*! \brief Get The URL of the female Pokémon Dream World front image, or null if unavailable.
	 */
	std::string getFrontFemale();

	/*! \brief Set The URL of the female Pokémon Dream World front image, or null if unavailable.
	 */
	void setFrontFemale(std::string front_female);


    private:
    std::string front_default{};
    std::string front_female{};
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpritesOtherDreamWorld_H_ */
