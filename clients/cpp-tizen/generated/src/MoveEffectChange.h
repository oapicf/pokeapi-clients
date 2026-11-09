/*
 * MoveEffectChange.h
 *
 * 
 */

#ifndef _MoveEffectChange_H_
#define _MoveEffectChange_H_


#include <string>
#include "MoveEffectChangeEffectText.h"
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

class MoveEffectChange : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveEffectChange();
	MoveEffectChange(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveEffectChange();

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
	std::list<MoveEffectChangeEffectText> getEffectEntries();

	/*! \brief Set The previous effect of this ability listed in different languages.
	 */
	void setEffectEntries(std::list <MoveEffectChangeEffectText> effect_entries);

private:
	VersionGroupSummary version_group;
	std::list <MoveEffectChangeEffectText>effect_entries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveEffectChange_H_ */
