
/*
 * ContestEffectSummary.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ContestEffectSummary_H_
#define TINY_CPP_CLIENT_ContestEffectSummary_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ContestEffectSummary{
public:

    /*! \brief Constructor.
	 */
    ContestEffectSummary();
    ContestEffectSummary(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ContestEffectSummary();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string url);


    private:
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_ContestEffectSummary_H_ */
