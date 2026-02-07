/*
 * MoveMeta.h
 *
 * 
 */

#ifndef _MoveMeta_H_
#define _MoveMeta_H_


#include <string>
#include "MoveMetaAilmentSummary.h"
#include "MoveMetaCategorySummary.h"
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

class MoveMeta : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveMeta();
	MoveMeta(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveMeta();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	MoveMetaAilmentSummary getAilment();

	/*! \brief Set 
	 */
	void setAilment(MoveMetaAilmentSummary  ailment);
	/*! \brief Get 
	 */
	MoveMetaCategorySummary getCategory();

	/*! \brief Set 
	 */
	void setCategory(MoveMetaCategorySummary  category);
	/*! \brief Get 
	 */
	int getMinHits();

	/*! \brief Set 
	 */
	void setMinHits(int  min_hits);
	/*! \brief Get 
	 */
	int getMaxHits();

	/*! \brief Set 
	 */
	void setMaxHits(int  max_hits);
	/*! \brief Get 
	 */
	int getMinTurns();

	/*! \brief Set 
	 */
	void setMinTurns(int  min_turns);
	/*! \brief Get 
	 */
	int getMaxTurns();

	/*! \brief Set 
	 */
	void setMaxTurns(int  max_turns);
	/*! \brief Get 
	 */
	int getDrain();

	/*! \brief Set 
	 */
	void setDrain(int  drain);
	/*! \brief Get 
	 */
	int getHealing();

	/*! \brief Set 
	 */
	void setHealing(int  healing);
	/*! \brief Get 
	 */
	int getCritRate();

	/*! \brief Set 
	 */
	void setCritRate(int  crit_rate);
	/*! \brief Get 
	 */
	int getAilmentChance();

	/*! \brief Set 
	 */
	void setAilmentChance(int  ailment_chance);
	/*! \brief Get 
	 */
	int getFlinchChance();

	/*! \brief Set 
	 */
	void setFlinchChance(int  flinch_chance);
	/*! \brief Get 
	 */
	int getStatChance();

	/*! \brief Set 
	 */
	void setStatChance(int  stat_chance);

private:
	MoveMetaAilmentSummary ailment;
	MoveMetaCategorySummary category;
	int min_hits;
	int max_hits;
	int min_turns;
	int max_turns;
	int drain;
	int healing;
	int crit_rate;
	int ailment_chance;
	int flinch_chance;
	int stat_chance;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveMeta_H_ */
