/*
 * LocationAreaPokemonEncounter.h
 *
 * 
 */

#ifndef _LocationAreaPokemonEncounter_H_
#define _LocationAreaPokemonEncounter_H_


#include <string>
#include "LocationAreaPokemonEncounterVersion.h"
#include "PokemonSummary.h"
#include <list>
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

class LocationAreaPokemonEncounter : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaPokemonEncounter();
	LocationAreaPokemonEncounter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaPokemonEncounter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The Pokémon being encountered.
	 */
	PokemonSummary getPokemon();

	/*! \brief Set The Pokémon being encountered.
	 */
	void setPokemon(PokemonSummary  pokemon);
	/*! \brief Get A list of versions and encounters with Pokémon that might happen in the referenced location area.
	 */
	std::list<LocationAreaPokemonEncounterVersion> getVersionDetails();

	/*! \brief Set A list of versions and encounters with Pokémon that might happen in the referenced location area.
	 */
	void setVersionDetails(std::list <LocationAreaPokemonEncounterVersion> version_details);

private:
	PokemonSummary pokemon;
	std::list <LocationAreaPokemonEncounterVersion>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaPokemonEncounter_H_ */
