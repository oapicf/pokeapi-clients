/*
 * EvolutionTriggerDetail.h
 *
 * 
 */

#ifndef _EvolutionTriggerDetail_H_
#define _EvolutionTriggerDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "EvolutionTriggerName.h"
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

class EvolutionTriggerDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	EvolutionTriggerDetail();
	EvolutionTriggerDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EvolutionTriggerDetail();

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
	std::list<EvolutionTriggerName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <EvolutionTriggerName> names);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list <AbilityDetail_pokemon_inner_pokemon> pokemon_species);

private:
	int id;
	std::string name;
	std::list <EvolutionTriggerName>names;
	std::list <AbilityDetail_pokemon_inner_pokemon>pokemon_species;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EvolutionTriggerDetail_H_ */
