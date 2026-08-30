
/*
 * MoveFlavorText.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveFlavorText_H_
#define TINY_CPP_CLIENT_MoveFlavorText_H_


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

class MoveFlavorText{
public:

    /*! \brief Constructor.
	 */
    MoveFlavorText();
    MoveFlavorText(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveFlavorText();


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
	void setFlavorText(std::string flavor_text);
	/*! \brief Get 
	 */
	LanguageSummary getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(LanguageSummary language);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary version_group);


    private:
    std::string flavor_text{};
    LanguageSummary language;
    VersionGroupSummary version_group;
};
}

#endif /* TINY_CPP_CLIENT_MoveFlavorText_H_ */
