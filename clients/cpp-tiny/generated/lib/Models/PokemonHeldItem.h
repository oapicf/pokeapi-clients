
/*
 * PokemonHeldItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonHeldItem_H_
#define TINY_CPP_CLIENT_PokemonHeldItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonHeldItemVersion.h"
#include "PokemonSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonHeldItem{
public:

    /*! \brief Constructor.
	 */
    PokemonHeldItem();
    PokemonHeldItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonHeldItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The Pokémon that holds this item.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon that holds this item.
	 */
	void setPokemon(PokemonSummary pokemon);
	/*! \brief Get The details for the version that this item is held in by the Pokémon.
	 */
	std::list<PokemonHeldItemVersion> getVersionDetails();

	/*! \brief Set The details for the version that this item is held in by the Pokémon.
	 */
	void setVersionDetails(std::list<PokemonHeldItemVersion> version_details);


    private:
    PokemonSummary pokemon;
    std::list<PokemonHeldItemVersion> version_details;
};
}

#endif /* TINY_CPP_CLIENT_PokemonHeldItem_H_ */
