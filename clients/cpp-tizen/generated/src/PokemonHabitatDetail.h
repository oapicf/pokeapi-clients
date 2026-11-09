/*
 * PokemonHabitatDetail.h
 *
 * 
 */

#ifndef _PokemonHabitatDetail_H_
#define _PokemonHabitatDetail_H_


#include <string>
#include "PokemonHabitatName.h"
#include "PokemonSpeciesSummary.h"
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

class PokemonHabitatDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonHabitatDetail();
	PokemonHabitatDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonHabitatDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PokemonHabitatName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <PokemonHabitatName> names);
	/*! \brief Get A list of the Pokémon species that can be found in this habitat.
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set A list of the Pokémon species that can be found in this habitat.
	 */
	void setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species);

private:
	int id;
	std::string name;
	std::list <PokemonHabitatName>names;
	std::list <PokemonSpeciesSummary>pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonHabitatDetail_H_ */
