
/*
 * PokemonSpeciesVariety.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpeciesVariety_H_
#define TINY_CPP_CLIENT_PokemonSpeciesVariety_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpeciesVariety{
public:

    /*! \brief Constructor.
	 */
    PokemonSpeciesVariety();
    PokemonSpeciesVariety(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpeciesVariety();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Whether this variety is the default variety.
	 */
	bool isIsDefault();

	/*! \brief Set Whether this variety is the default variety.
	 */
	void setIsDefault(bool is_default);
	/*! \brief Get The Pokémon variety.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon variety.
	 */
	void setPokemon(PokemonSummary pokemon);


    private:
    bool is_default{};
    PokemonSummary pokemon;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpeciesVariety_H_ */
