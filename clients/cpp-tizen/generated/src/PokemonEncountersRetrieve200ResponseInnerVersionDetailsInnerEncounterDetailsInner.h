/*
 * Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner.h
 *
 * 
 */

#ifndef _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_H_
#define _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_H_


#include <string>
#include "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner.h"
#include "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method.h"
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

class Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner();
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getChance();

	/*! \brief Set 
	 */
	void setChance(long long  chance);
	/*! \brief Get 
	 */
	std::list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner> getConditionValues();

	/*! \brief Set 
	 */
	void setConditionValues(std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner> condition_values);
	/*! \brief Get 
	 */
	long long getMaxLevel();

	/*! \brief Set 
	 */
	void setMaxLevel(long long  max_level);
	/*! \brief Get 
	 */
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method getMethod();

	/*! \brief Set 
	 */
	void setMethod(Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method  method);
	/*! \brief Get 
	 */
	long long getMinLevel();

	/*! \brief Set 
	 */
	void setMinLevel(long long  min_level);

private:
	long long chance;
	std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_condition_values_inner>condition_values;
	long long max_level;
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_method method;
	long long min_level;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner_H_ */
