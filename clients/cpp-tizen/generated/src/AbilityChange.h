/*
 * AbilityChange.h
 *
 * 
 */

#ifndef _AbilityChange_H_
#define _AbilityChange_H_


#include <string>
#include "AbilityChangeEffectText.h"
#include "VersionGroupSummary.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AbilityChange : public Object {
public:
	/*! \brief Constructor.
	 */
	AbilityChange();
	AbilityChange(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AbilityChange();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The version group in which the previous effect of this ability originated.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group in which the previous effect of this ability originated.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get The previous effect of this ability listed in different languages.
	 */
	std::list<AbilityChangeEffectText> getEffectEntries();

	/*! \brief Set The previous effect of this ability listed in different languages.
	 */
	void setEffectEntries(std::list <AbilityChangeEffectText> effect_entries);

private:
	VersionGroupSummary version_group;
	std::list <AbilityChangeEffectText>effect_entries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AbilityChange_H_ */
