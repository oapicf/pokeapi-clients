/*
 * PokemonEncounterDetailResponse.h
 *
 * 
 */

#ifndef _PokemonEncounterDetailResponse_H_
#define _PokemonEncounterDetailResponse_H_


#include <string>
#include "EncounterConditionValueSummary.h"
#include "EncounterMethodSummary.h"
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

class PokemonEncounterDetailResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonEncounterDetailResponse();
	PokemonEncounterDetailResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonEncounterDetailResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Percent chance that this encounter will occur.
	 */
	int getChance();

	/*! \brief Set Percent chance that this encounter will occur.
	 */
	void setChance(int  chance);
	/*! \brief Get A list of condition values that must be in effect for this encounter to occur.
	 */
	std::list<EncounterConditionValueSummary> getConditionValues();

	/*! \brief Set A list of condition values that must be in effect for this encounter to occur.
	 */
	void setConditionValues(std::list <EncounterConditionValueSummary> condition_values);
	/*! \brief Get The highest level the Pokémon could be encountered at.
	 */
	int getMaxLevel();

	/*! \brief Set The highest level the Pokémon could be encountered at.
	 */
	void setMaxLevel(int  max_level);
	/*! \brief Get The method by which this encounter happens.
	 */
	EncounterMethodSummary getMethod();

	/*! \brief Set The method by which this encounter happens.
	 */
	void setMethod(EncounterMethodSummary  method);
	/*! \brief Get The lowest level the Pokémon could be encountered at.
	 */
	int getMinLevel();

	/*! \brief Set The lowest level the Pokémon could be encountered at.
	 */
	void setMinLevel(int  min_level);

private:
	int chance;
	std::list <EncounterConditionValueSummary>condition_values;
	int max_level;
	EncounterMethodSummary method;
	int min_level;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonEncounterDetailResponse_H_ */
