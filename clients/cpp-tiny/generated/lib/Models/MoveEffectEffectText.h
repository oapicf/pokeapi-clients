
/*
 * MoveEffectEffectText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveEffectEffectText_H_
#define TINY_CPP_CLIENT_MoveEffectEffectText_H_


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

class MoveEffectEffectText{
public:

    /*! \brief Constructor.
	 */
    MoveEffectEffectText();
    MoveEffectEffectText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveEffectEffectText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The localized effect text for an API resource in a specific language.
	 */
	std::string getEffect();

	/*! \brief Set The localized effect text for an API resource in a specific language.
	 */
	void setEffect(std::string effect);
	/*! \brief Get The localized effect text in brief.
	 */
	std::string getShortEffect();

	/*! \brief Set The localized effect text in brief.
	 */
	void setShortEffect(std::string short_effect);
	/*! \brief Get The language this effect is in.
	 */
	LanguageSummary getLanguage();

	/*! \brief Set The language this effect is in.
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string effect{};
    std::string short_effect{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_MoveEffectEffectText_H_ */
