
/*
 * PokeapiMetaResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokeapiMetaResponse_H_
#define TINY_CPP_CLIENT_PokeapiMetaResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokeapiMetaResponse{
public:

    /*! \brief Constructor.
	 */
    PokeapiMetaResponse();
    PokeapiMetaResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokeapiMetaResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The deployment time as a Unix timestamp string.
	 */
	std::string getDeployDate();

	/*! \brief Set The deployment time as a Unix timestamp string.
	 */
	void setDeployDate(std::string deploy_date);
	/*! \brief Get The source commit hash used for this deployment.
	 */
	std::string getHash();

	/*! \brief Set The source commit hash used for this deployment.
	 */
	void setHash(std::string hash);
	/*! \brief Get The deployment tag, or null if the deployment has no tag.
	 */
	std::string getTag();

	/*! \brief Set The deployment tag, or null if the deployment has no tag.
	 */
	void setTag(std::string tag);


    private:
    std::string deploy_date{};
    std::string hash{};
    std::string tag{};
};
}

#endif /* TINY_CPP_CLIENT_PokeapiMetaResponse_H_ */
