/*
 * LocationAreaEncounterDetail.h
 *
 * 
 */

#ifndef _LocationAreaEncounterDetail_H_
#define _LocationAreaEncounterDetail_H_


#include <string>
#include "EncounterConditionValueSummary.h"
#include "EncounterMethodSummary.h"
#include "EncounterPokemonDetail.h"
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

class LocationAreaEncounterDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	LocationAreaEncounterDetail();
	LocationAreaEncounterDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LocationAreaEncounterDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The lowest level the Pokémon could be encountered at.
	 */
	int getMinLevel();

	/*! \brief Set The lowest level the Pokémon could be encountered at.
	 */
	void setMinLevel(int  min_level);
	/*! \brief Get The highest level the Pokémon could be encountered at.
	 */
	int getMaxLevel();

	/*! \brief Set The highest level the Pokémon could be encountered at.
	 */
	void setMaxLevel(int  max_level);
	/*! \brief Get Percent chance that this encounter will occur.
	 */
	int getChance();

	/*! \brief Set Percent chance that this encounter will occur.
	 */
	void setChance(int  chance);
	/*! \brief Get The method by which this encounter happens.
	 */
	EncounterMethodSummary getMethod();

	/*! \brief Set The method by which this encounter happens.
	 */
	void setMethod(EncounterMethodSummary  method);
	/*! \brief Get A list of condition values that must be in effect for this encounter to occur.
	 */
	std::list<EncounterConditionValueSummary> getConditionValues();

	/*! \brief Set A list of condition values that must be in effect for this encounter to occur.
	 */
	void setConditionValues(std::list <EncounterConditionValueSummary> condition_values);
	/*! \brief Get Additional properties of the encountered Pokémon, or null if unspecified.
	 */
	EncounterPokemonDetail getPokemonDetails();

	/*! \brief Set Additional properties of the encountered Pokémon, or null if unspecified.
	 */
	void setPokemonDetails(EncounterPokemonDetail  pokemon_details);

private:
	int min_level;
	int max_level;
	int chance;
	EncounterMethodSummary method;
	std::list <EncounterConditionValueSummary>condition_values;
	EncounterPokemonDetail pokemon_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LocationAreaEncounterDetail_H_ */
