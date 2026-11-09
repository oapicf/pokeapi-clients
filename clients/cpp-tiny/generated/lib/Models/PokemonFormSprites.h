
/*
 * PokemonFormSprites.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonFormSprites_H_
#define TINY_CPP_CLIENT_PokemonFormSprites_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include "PokemonSpritesOther.h"
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonFormSprites{
public:

    /*! \brief Constructor.
	 */
    PokemonFormSprites();
    PokemonFormSprites(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonFormSprites();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The default depiction of this Pokémon from the front in battle.
	 */
	std::string getFrontDefault();

	/*! \brief Set The default depiction of this Pokémon from the front in battle.
	 */
	void setFrontDefault(std::string front_default);
	/*! \brief Get The shiny depiction of this Pokémon from the front in battle.
	 */
	std::string getFrontShiny();

	/*! \brief Set The shiny depiction of this Pokémon from the front in battle.
	 */
	void setFrontShiny(std::string front_shiny);
	/*! \brief Get The female depiction of this Pokémon from the front in battle.
	 */
	std::string getFrontFemale();

	/*! \brief Set The female depiction of this Pokémon from the front in battle.
	 */
	void setFrontFemale(std::string front_female);
	/*! \brief Get The shiny female depiction of this Pokémon from the front in battle.
	 */
	std::string getFrontShinyFemale();

	/*! \brief Set The shiny female depiction of this Pokémon from the front in battle.
	 */
	void setFrontShinyFemale(std::string front_shiny_female);
	/*! \brief Get The default depiction of this Pokémon from the back in battle.
	 */
	std::string getBackDefault();

	/*! \brief Set The default depiction of this Pokémon from the back in battle.
	 */
	void setBackDefault(std::string back_default);
	/*! \brief Get The shiny depiction of this Pokémon from the back in battle.
	 */
	std::string getBackShiny();

	/*! \brief Set The shiny depiction of this Pokémon from the back in battle.
	 */
	void setBackShiny(std::string back_shiny);
	/*! \brief Get The female depiction of this Pokémon from the back in battle.
	 */
	std::string getBackFemale();

	/*! \brief Set The female depiction of this Pokémon from the back in battle.
	 */
	void setBackFemale(std::string back_female);
	/*! \brief Get The shiny female depiction of this Pokémon from the back in battle.
	 */
	std::string getBackShinyFemale();

	/*! \brief Set The shiny female depiction of this Pokémon from the back in battle.
	 */
	void setBackShinyFemale(std::string back_shiny_female);
	/*! \brief Get Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
	 */
	PokemonSpritesOther getOther();

	/*! \brief Set Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
	 */
	void setOther(PokemonSpritesOther other);
	/*! \brief Get Sprites grouped by generation and game. Available keys vary by resource.
	 */
	std::map<std::string, std::map<std::string, AnyType>> getVersions();

	/*! \brief Set Sprites grouped by generation and game. Available keys vary by resource.
	 */
	void setVersions(std::map<std::string, std::map<std::string, AnyType>> versions);


    private:
    std::string front_default{};
    std::string front_shiny{};
    std::string front_female{};
    std::string front_shiny_female{};
    std::string back_default{};
    std::string back_shiny{};
    std::string back_female{};
    std::string back_shiny_female{};
    PokemonSpritesOther other;
    std::map<std::string, std::map<std::string, AnyType>> versions;
};
}

#endif /* TINY_CPP_CLIENT_PokemonFormSprites_H_ */
