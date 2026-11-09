
/*
 * MoveTargetDescription.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveTargetDescription_H_
#define TINY_CPP_CLIENT_MoveTargetDescription_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveTargetDescription{
public:

    /*! \brief Constructor.
	 */
    MoveTargetDescription();
    MoveTargetDescription(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveTargetDescription();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The localized description for an API resource in a specific language.
	 */
	std::string getDescription();

	/*! \brief Set The localized description for an API resource in a specific language.
	 */
	void setDescription(std::string description);
	/*! \brief Get The language this name is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this name is in.
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string description{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_MoveTargetDescription_H_ */
