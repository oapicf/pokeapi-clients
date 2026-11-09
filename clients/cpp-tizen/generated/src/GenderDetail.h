/*
 * GenderDetail.h
 *
 * 
 */

#ifndef _GenderDetail_H_
#define _GenderDetail_H_


#include <string>
#include "GenderPokemonSpecies.h"
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

class GenderDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	GenderDetail();
	GenderDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenderDetail();

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
	/*! \brief Get A list of Pokémon species that can be this gender and how likely it is that they will be.
	 */
	std::list<GenderPokemonSpecies> getPokemonSpeciesDetails();

	/*! \brief Set A list of Pokémon species that can be this gender and how likely it is that they will be.
	 */
	void setPokemonSpeciesDetails(std::list <GenderPokemonSpecies> pokemon_species_details);
	/*! \brief Get A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
	 */
	std::list<PokemonSpeciesSummary> getRequiredForEvolution();

	/*! \brief Set A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
	 */
	void setRequiredForEvolution(std::list <PokemonSpeciesSummary> required_for_evolution);

private:
	int id;
	std::string name;
	std::list <GenderPokemonSpecies>pokemon_species_details;
	std::list <PokemonSpeciesSummary>required_for_evolution;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenderDetail_H_ */
