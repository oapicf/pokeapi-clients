/*
 * GenderDetail.h
 *
 * 
 */

#ifndef _GenderDetail_H_
#define _GenderDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "GenderDetail_pokemon_species_details_inner.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<GenderDetail_pokemon_species_details_inner> getPokemonSpeciesDetails();

	/*! \brief Set 
	 */
	void setPokemonSpeciesDetails(std::list <GenderDetail_pokemon_species_details_inner> pokemon_species_details);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getRequiredForEvolution();

	/*! \brief Set 
	 */
	void setRequiredForEvolution(std::list <AbilityDetail_pokemon_inner_pokemon> required_for_evolution);

private:
	int id;
	std::string name;
	std::list <GenderDetail_pokemon_species_details_inner>pokemon_species_details;
	std::list <AbilityDetail_pokemon_inner_pokemon>required_for_evolution;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenderDetail_H_ */
