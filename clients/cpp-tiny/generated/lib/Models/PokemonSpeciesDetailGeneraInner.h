
/*
 * PokemonSpeciesDetail_genera_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpeciesDetail_genera_inner_H_
#define TINY_CPP_CLIENT_PokemonSpeciesDetail_genera_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpeciesDetail_genera_inner{
public:

    /*! \brief Constructor.
	 */
    PokemonSpeciesDetail_genera_inner();
    PokemonSpeciesDetail_genera_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpeciesDetail_genera_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getGenus();

	/*! \brief Set 
	 */
	void setGenus(std::string  genus);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(AbilityDetail_pokemon_inner_pokemon  language);


    private:
    std::string genus{};
    AbilityDetail_pokemon_inner_pokemon language;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesDetail_genera_inner_H_ */
