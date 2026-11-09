/*
 * PokeapiMetaResponse.h
 *
 * 
 */

#ifndef _PokeapiMetaResponse_H_
#define _PokeapiMetaResponse_H_


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

class PokeapiMetaResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	PokeapiMetaResponse();
	PokeapiMetaResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokeapiMetaResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The deployment time as a Unix timestamp string.
	 */
	std::string getDeployDate();

	/*! \brief Set The deployment time as a Unix timestamp string.
	 */
	void setDeployDate(std::string  deploy_date);
	/*! \brief Get The source commit hash used for this deployment.
	 */
	std::string getHash();

	/*! \brief Set The source commit hash used for this deployment.
	 */
	void setHash(std::string  hash);
	/*! \brief Get The deployment tag, or null if the deployment has no tag.
	 */
	std::string getTag();

	/*! \brief Set The deployment tag, or null if the deployment has no tag.
	 */
	void setTag(std::string  tag);

private:
	std::string deploy_date;
	std::string hash;
	std::string tag;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokeapiMetaResponse_H_ */
