
/*
 * ItemFlingEffectEffectText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemFlingEffectEffectText_H_
#define TINY_CPP_CLIENT_ItemFlingEffectEffectText_H_


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

class ItemFlingEffectEffectText{
public:

    /*! \brief Constructor.
	 */
    ItemFlingEffectEffectText();
    ItemFlingEffectEffectText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemFlingEffectEffectText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEffect();

	/*! \brief Set 
	 */
	void setEffect(std::string effect);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary language);


    private:
    std::string effect{};
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_ItemFlingEffectEffectText_H_ */
