
/*
 * LocationAreaPokemonEncounter.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LocationAreaPokemonEncounter_H_
#define TINY_CPP_CLIENT_LocationAreaPokemonEncounter_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LocationAreaPokemonEncounterVersion.h"
#include "PokemonSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LocationAreaPokemonEncounter{
public:

    /*! \brief Constructor.
	 */
    LocationAreaPokemonEncounter();
    LocationAreaPokemonEncounter(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LocationAreaPokemonEncounter();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The Pokémon being encountered.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon being encountered.
	 */
	void setPokemon(PokemonSummary pokemon);
	/*! \brief Get A list of versions and encounters with Pokémon that might happen in the referenced location area.
	 */
	std::list<LocationAreaPokemonEncounterVersion> getVersionDetails();

	/*! \brief Set A list of versions and encounters with Pokémon that might happen in the referenced location area.
	 */
	void setVersionDetails(std::list<LocationAreaPokemonEncounterVersion> version_details);


    private:
    PokemonSummary pokemon;
    std::list<LocationAreaPokemonEncounterVersion> version_details;
};
}

#endif /* TINY_CPP_CLIENT_LocationAreaPokemonEncounter_H_ */
