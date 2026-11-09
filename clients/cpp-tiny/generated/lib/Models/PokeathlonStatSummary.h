
/*
 * PokeathlonStatSummary.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokeathlonStatSummary_H_
#define TINY_CPP_CLIENT_PokeathlonStatSummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokeathlonStatSummary{
public:

    /*! \brief Constructor.
	 */
    PokeathlonStatSummary();
    PokeathlonStatSummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokeathlonStatSummary();


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

#endif /* TINY_CPP_CLIENT_PokeathlonStatSummary_H_ */
