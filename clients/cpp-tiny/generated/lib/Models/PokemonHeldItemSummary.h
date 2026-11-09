
/*
 * PokemonHeldItemSummary.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonHeldItemSummary_H_
#define TINY_CPP_CLIENT_PokemonHeldItemSummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ItemSummary.h"
#include "PokemonHeldItemVersion.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonHeldItemSummary{
public:

    /*! \brief Constructor.
	 */
    PokemonHeldItemSummary();
    PokemonHeldItemSummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonHeldItemSummary();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The item the referenced Pokémon holds.
	 */
	ItemSummary getItem();

	/*! \brief Set The item the referenced Pokémon holds.
	 */
	void setItem(ItemSummary item);
	/*! \brief Get The details of the different versions in which the item is held.
	 */
	std::list<PokemonHeldItemVersion> getVersionDetails();

	/*! \brief Set The details of the different versions in which the item is held.
	 */
	void setVersionDetails(std::list<PokemonHeldItemVersion> version_details);


    private:
    ItemSummary item;
    std::list<PokemonHeldItemVersion> version_details;
};
}

#endif /* TINY_CPP_CLIENT_PokemonHeldItemSummary_H_ */
