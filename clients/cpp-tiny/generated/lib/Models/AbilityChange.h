
/*
 * AbilityChange.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AbilityChange_H_
#define TINY_CPP_CLIENT_AbilityChange_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityChangeEffectText.h"
#include "VersionGroupSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AbilityChange{
public:

    /*! \brief Constructor.
	 */
    AbilityChange();
    AbilityChange(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AbilityChange();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The version group in which the previous effect of this ability originated.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group in which the previous effect of this ability originated.
	 */
	void setVersionGroup(VersionGroupSummary version_group);
	/*! \brief Get The previous effect of this ability listed in different languages.
	 */
	std::list<AbilityChangeEffectText> getEffectEntries();

	/*! \brief Set The previous effect of this ability listed in different languages.
	 */
	void setEffectEntries(std::list<AbilityChangeEffectText> effect_entries);


    private:
    VersionGroupSummary version_group;
    std::list<AbilityChangeEffectText> effect_entries;
};
}

#endif /* TINY_CPP_CLIENT_AbilityChange_H_ */
