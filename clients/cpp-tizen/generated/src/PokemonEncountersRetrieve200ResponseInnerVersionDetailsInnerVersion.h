/*
 * Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version.h
 *
 * 
 */

#ifndef _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_H_
#define _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_H_


#include <string>
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

class Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version : public Object {
public:
	/*! \brief Constructor.
	 */
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version();
	Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string name;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pokemon_encounters_retrieve_200_response_inner_version_details_inner_version_H_ */
