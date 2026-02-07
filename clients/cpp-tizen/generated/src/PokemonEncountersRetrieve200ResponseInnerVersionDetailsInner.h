/*
 * Pokemon_encounters_retrieve_200_response_inner_version_details_inner.h
 *
 * 
 */

#ifndef _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_H_
#define _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_H_


#include <string>
#include "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner.h"
#include "Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.h"
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

class Pokemon_encounters_retrieve_200_response_inner_version_details_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner();
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pokemon_encounters_retrieve_200_response_inner_version_details_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner> getEncounterDetails();

	/*! \brief Set 
	 */
	void setEncounterDetails(std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner> encounter_details);
	/*! \brief Get 
	 */
	long long getMaxChance();

	/*! \brief Set 
	 */
	void setMaxChance(long long  max_chance);
	/*! \brief Get 
	 */
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version getVersion();

	/*! \brief Set 
	 */
	void setVersion(Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version  version);

private:
	std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner_encounter_details_inner>encounter_details;
	long long max_chance;
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version version;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_H_ */
