
/*
 * ItemFlavorText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemFlavorText_H_
#define TINY_CPP_CLIENT_ItemFlavorText_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "LanguageSummary.h"
#include "VersionGroupSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemFlavorText{
public:

    /*! \brief Constructor.
	 */
    ItemFlavorText();
    ItemFlavorText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemFlavorText();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary  language);


    private:
    std::string text{};
    VersionGroupSummary version_group;
    LanguageSummary language;
};
}

#endif /* TINY_CPP_CLIENT_ItemFlavorText_H_ */
