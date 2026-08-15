
/*
 * SuperContestEffectFlavorText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SuperContestEffectFlavorText_H_
#define TINY_CPP_CLIENT_SuperContestEffectFlavorText_H_


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

class SuperContestEffectFlavorText{
public:

    /*! \brief Constructor.
	 */
    SuperContestEffectFlavorText();
    SuperContestEffectFlavorText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SuperContestEffectFlavorText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getFlavorText();

	/*! \brief Set 
	 */
	void setFlavorText(std::string  flavor_text);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);


    private:
    std::string flavor_text{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_SuperContestEffectFlavorText_H_ */
