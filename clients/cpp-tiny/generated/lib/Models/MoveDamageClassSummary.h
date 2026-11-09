
/*
 * MoveDamageClassSummary.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveDamageClassSummary_H_
#define TINY_CPP_CLIENT_MoveDamageClassSummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveDamageClassSummary{
public:

    /*! \brief Constructor.
	 */
    MoveDamageClassSummary();
    MoveDamageClassSummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveDamageClassSummary();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the referenced resource.
	 */
	std::string getName();

	/*! \brief Set The name of the referenced resource.
	 */
	void setName(std::string name);
	/*! \brief Get The URL of the referenced resource.
	 */
	std::string getUrl();

	/*! \brief Set The URL of the referenced resource.
	 */
	void setUrl(std::string url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_MoveDamageClassSummary_H_ */
