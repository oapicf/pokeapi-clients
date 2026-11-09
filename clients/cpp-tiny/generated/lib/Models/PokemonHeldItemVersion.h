
/*
 * PokemonHeldItemVersion.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonHeldItemVersion_H_
#define TINY_CPP_CLIENT_PokemonHeldItemVersion_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "VersionSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonHeldItemVersion{
public:

    /*! \brief Constructor.
	 */
    PokemonHeldItemVersion();
    PokemonHeldItemVersion(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonHeldItemVersion();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get How often the item is held.
	 */
	int getRarity();

	/*! \brief Set How often the item is held.
	 */
	void setRarity(int rarity);
	/*! \brief Get The version in which the item is held.
	 */
	VersionSummary getVersion();

	/*! \brief Set The version in which the item is held.
	 */
	void setVersion(VersionSummary version);


    private:
    int rarity{};
    VersionSummary version;
};
}

#endif /* TINY_CPP_CLIENT_PokemonHeldItemVersion_H_ */
