/*
 * Pokemon_encounters_retrieve_200_response_inner.h
 *
 * 
 */

#ifndef _Pokemon_encounters_retrieve_200_response_inner_H_
#define _Pokemon_encounters_retrieve_200_response_inner_H_


#include <string>
#include "Pokemon_encounters_retrieve_200_response_inner_location_area.h"
#include "Pokemon_encounters_retrieve_200_response_inner_version_details_inner.h"
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

class Pokemon_encounters_retrieve_200_response_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Pokemon_encounters_retrieve_200_response_inner();
	Pokemon_encounters_retrieve_200_response_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pokemon_encounters_retrieve_200_response_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	Pokemon_encounters_retrieve_200_response_inner_location_area getLocationArea();

	/*! \brief Set 
	 */
	void setLocationArea(Pokemon_encounters_retrieve_200_response_inner_location_area  location_area);
	/*! \brief Get 
	 */
	std::list<Pokemon_encounters_retrieve_200_response_inner_version_details_inner> getVersionDetails();

	/*! \brief Set 
	 */
	void setVersionDetails(std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner> version_details);

private:
	Pokemon_encounters_retrieve_200_response_inner_location_area location_area;
	std::list <Pokemon_encounters_retrieve_200_response_inner_version_details_inner>version_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pokemon_encounters_retrieve_200_response_inner_H_ */
