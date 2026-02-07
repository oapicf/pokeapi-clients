/*
 * NatureBattleStylePreference.h
 *
 * 
 */

#ifndef _NatureBattleStylePreference_H_
#define _NatureBattleStylePreference_H_


#include <string>
#include "MoveBattleStyleSummary.h"
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

class NatureBattleStylePreference : public Object {
public:
	/*! \brief Constructor.
	 */
	NatureBattleStylePreference();
	NatureBattleStylePreference(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NatureBattleStylePreference();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getLowHpPreference();

	/*! \brief Set 
	 */
	void setLowHpPreference(int  low_hp_preference);
	/*! \brief Get 
	 */
	int getHighHpPreference();

	/*! \brief Set 
	 */
	void setHighHpPreference(int  high_hp_preference);
	/*! \brief Get 
	 */
	MoveBattleStyleSummary getMoveBattleStyle();

	/*! \brief Set 
	 */
	void setMoveBattleStyle(MoveBattleStyleSummary  move_battle_style);

private:
	int low_hp_preference;
	int high_hp_preference;
	MoveBattleStyleSummary move_battle_style;
	void __init();
	void __cleanup();

};
}
}

#endif /* _NatureBattleStylePreference_H_ */
