
/*
 * CharacteristicDescription.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CharacteristicDescription_H_
#define TINY_CPP_CLIENT_CharacteristicDescription_H_


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

class CharacteristicDescription{
public:

    /*! \brief Constructor.
	 */
    CharacteristicDescription();
    CharacteristicDescription(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CharacteristicDescription();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string description{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_CharacteristicDescription_H_ */
