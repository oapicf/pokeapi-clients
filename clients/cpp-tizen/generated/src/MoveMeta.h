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

	/*! \brief Get The status ailment this move inflicts on its target.
	 */
	MoveMetaAilmentSummary getAilment();

	/*! \brief Set The status ailment this move inflicts on its target.
	 */
	void setAilment(MoveMetaAilmentSummary  ailment);
	/*! \brief Get The category of move this move falls under, e.g. damage or ailment.
	 */
	MoveMetaCategorySummary getCategory();

	/*! \brief Set The category of move this move falls under, e.g. damage or ailment.
	 */
	void setCategory(MoveMetaCategorySummary  category);
	/*! \brief Get The minimum number of times this move hits. Null if it always only hits once.
	 */
	int getMinHits();

	/*! \brief Set The minimum number of times this move hits. Null if it always only hits once.
	 */
	void setMinHits(int  min_hits);
	/*! \brief Get The maximum number of times this move hits. Null if it always only hits once.
	 */
	int getMaxHits();

	/*! \brief Set The maximum number of times this move hits. Null if it always only hits once.
	 */
	void setMaxHits(int  max_hits);
	/*! \brief Get The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
	 */
	int getMinTurns();

	/*! \brief Set The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
	 */
	void setMinTurns(int  min_turns);
	/*! \brief Get The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
	 */
	int getMaxTurns();

	/*! \brief Set The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
	 */
	void setMaxTurns(int  max_turns);
	/*! \brief Get HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
	 */
	int getDrain();

	/*! \brief Set HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
	 */
	void setDrain(int  drain);
	/*! \brief Get The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
	 */
	int getHealing();

	/*! \brief Set The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
	 */
	void setHealing(int  healing);
	/*! \brief Get Critical hit rate bonus.
	 */
	int getCritRate();

	/*! \brief Set Critical hit rate bonus.
	 */
	void setCritRate(int  crit_rate);
	/*! \brief Get The likelihood this attack will cause an ailment.
	 */
	int getAilmentChance();

	/*! \brief Set The likelihood this attack will cause an ailment.
	 */
	void setAilmentChance(int  ailment_chance);
	/*! \brief Get The likelihood this attack will cause the target Pokémon to flinch.
	 */
	int getFlinchChance();

	/*! \brief Set The likelihood this attack will cause the target Pokémon to flinch.
	 */
	void setFlinchChance(int  flinch_chance);
	/*! \brief Get The likelihood this attack will cause a stat change in the target Pokémon.
	 */
	int getStatChance();

	/*! \brief Set The likelihood this attack will cause a stat change in the target Pokémon.
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
