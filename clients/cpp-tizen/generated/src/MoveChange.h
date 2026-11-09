/*
 * MoveChange.h
 *
 * 
 */

#ifndef _MoveChange_H_
#define _MoveChange_H_


#include <string>
#include "MoveEffectEffectText.h"
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

	/*! \brief Get The percent value of how likely this move is to be successful.
	 */
	int getAccuracy();

	/*! \brief Set The percent value of how likely this move is to be successful.
	 */
	void setAccuracy(int  accuracy);
	/*! \brief Get The base power before the listed version group, or null if power did not change.
	 */
	int getPower();

	/*! \brief Set The base power before the listed version group, or null if power did not change.
	 */
	void setPower(int  power);
	/*! \brief Get Power points. The number of times this move can be used.
	 */
	int getPp();

	/*! \brief Set Power points. The number of times this move can be used.
	 */
	void setPp(int  pp);
	/*! \brief Get The percent value of how likely it is this moves effect will take effect.
	 */
	int getEffectChance();

	/*! \brief Set The percent value of how likely it is this moves effect will take effect.
	 */
	void setEffectChance(int  effect_chance);
	/*! \brief Get The effect of this move listed in different languages.
	 */
	std::list<MoveEffectEffectText> getEffectEntries();

	/*! \brief Set The effect of this move listed in different languages.
	 */
	void setEffectEntries(std::list <MoveEffectEffectText> effect_entries);
	/*! \brief Get The elemental type of this move.
	 */
	TypeSummary getType();

	/*! \brief Set The elemental type of this move.
	 */
	void setType(TypeSummary  type);
	/*! \brief Get The version group in which these move stat values were in effect.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group in which these move stat values were in effect.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);

private:
	int accuracy;
	int power;
	int pp;
	int effect_chance;
	std::list <MoveEffectEffectText>effect_entries;
	TypeSummary type;
	VersionGroupSummary version_group;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveChange_H_ */
