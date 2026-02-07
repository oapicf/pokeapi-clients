/*
 * MoveChange.h
 *
 * 
 */

#ifndef _MoveChange_H_
#define _MoveChange_H_


#include <string>
#include "MoveChange_effect_entries_inner.h"
#include "TypeSummary.h"
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

class MoveChange : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveChange();
	MoveChange(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveChange();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getAccuracy();

	/*! \brief Set 
	 */
	void setAccuracy(int  accuracy);
	/*! \brief Get 
	 */
	int getPower();

	/*! \brief Set 
	 */
	void setPower(int  power);
	/*! \brief Get 
	 */
	int getPp();

	/*! \brief Set 
	 */
	void setPp(int  pp);
	/*! \brief Get 
	 */
	int getEffectChance();

	/*! \brief Set 
	 */
	void setEffectChance(int  effect_chance);
	/*! \brief Get 
	 */
	std::list<MoveChange_effect_entries_inner> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list <MoveChange_effect_entries_inner> effect_entries);
	/*! \brief Get 
	 */
	TypeSummary getType();

	/*! \brief Set 
	 */
	void setType(TypeSummary  type);
	/*! \brief Get 
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set 
	 */
	void setVersionGroup(VersionGroupSummary  version_group);

private:
	int accuracy;
	int power;
	int pp;
	int effect_chance;
	std::list <MoveChange_effect_entries_inner>effect_entries;
	TypeSummary type;
	VersionGroupSummary version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveChange_H_ */
