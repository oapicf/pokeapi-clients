/*
 * MoveDetail.h
 *
 * 
 */

#ifndef _MoveDetail_H_
#define _MoveDetail_H_


#include <string>
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "ContestEffectSummary.h"
#include "ContestTypeSummary.h"
#include "GenerationSummary.h"
#include "MoveChange.h"
#include "MoveChange_effect_entries_inner.h"
#include "MoveDamageClassSummary.h"
#include "MoveDetail_contest_combos.h"
#include "MoveDetail_effect_changes_inner.h"
#include "MoveDetail_machines_inner.h"
#include "MoveDetail_stat_changes_inner.h"
#include "MoveFlavorText.h"
#include "MoveMeta.h"
#include "MoveName.h"
#include "MoveTargetSummary.h"
#include "SuperContestEffectSummary.h"
#include "TypeSummary.h"
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

class MoveDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveDetail();
	MoveDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	int getAccuracy();

	/*! \brief Set 
	 */
	void setAccuracy(int  accuracy);
	/*! \brief Get 
	 */
	int getEffectChance();

	/*! \brief Set 
	 */
	void setEffectChance(int  effect_chance);
	/*! \brief Get 
	 */
	int getPp();

	/*! \brief Set 
	 */
	void setPp(int  pp);
	/*! \brief Get 
	 */
	int getPriority();

	/*! \brief Set 
	 */
	void setPriority(int  priority);
	/*! \brief Get 
	 */
	int getPower();

	/*! \brief Set 
	 */
	void setPower(int  power);
	/*! \brief Get 
	 */
	MoveDetail_contest_combos getContestCombos();

	/*! \brief Set 
	 */
	void setContestCombos(MoveDetail_contest_combos  contest_combos);
	/*! \brief Get 
	 */
	ContestTypeSummary getContestType();

	/*! \brief Set 
	 */
	void setContestType(ContestTypeSummary  contest_type);
	/*! \brief Get 
	 */
	ContestEffectSummary getContestEffect();

	/*! \brief Set 
	 */
	void setContestEffect(ContestEffectSummary  contest_effect);
	/*! \brief Get 
	 */
	MoveDamageClassSummary getDamageClass();

	/*! \brief Set 
	 */
	void setDamageClass(MoveDamageClassSummary  damage_class);
	/*! \brief Get 
	 */
	std::list<MoveChange_effect_entries_inner> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list <MoveChange_effect_entries_inner> effect_entries);
	/*! \brief Get 
	 */
	std::list<MoveDetail_effect_changes_inner> getEffectChanges();

	/*! \brief Set 
	 */
	void setEffectChanges(std::list <MoveDetail_effect_changes_inner> effect_changes);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get 
	 */
	MoveMeta getMeta();

	/*! \brief Set 
	 */
	void setMeta(MoveMeta  meta);
	/*! \brief Get 
	 */
	std::list<MoveName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <MoveName> names);
	/*! \brief Get 
	 */
	std::list<MoveChange> getPastValues();

	/*! \brief Set 
	 */
	void setPastValues(std::list <MoveChange> past_values);
	/*! \brief Get 
	 */
	std::list<MoveDetail_stat_changes_inner> getStatChanges();

	/*! \brief Set 
	 */
	void setStatChanges(std::list <MoveDetail_stat_changes_inner> stat_changes);
	/*! \brief Get 
	 */
	SuperContestEffectSummary getSuperContestEffect();

	/*! \brief Set 
	 */
	void setSuperContestEffect(SuperContestEffectSummary  super_contest_effect);
	/*! \brief Get 
	 */
	MoveTargetSummary getTarget();

	/*! \brief Set 
	 */
	void setTarget(MoveTargetSummary  target);
	/*! \brief Get 
	 */
	TypeSummary getType();

	/*! \brief Set 
	 */
	void setType(TypeSummary  type);
	/*! \brief Get 
	 */
	std::list<MoveDetail_machines_inner> getMachines();

	/*! \brief Set 
	 */
	void setMachines(std::list <MoveDetail_machines_inner> machines);
	/*! \brief Get 
	 */
	std::list<MoveFlavorText> getFlavorTextEntries();

	/*! \brief Set 
	 */
	void setFlavorTextEntries(std::list <MoveFlavorText> flavor_text_entries);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getLearnedByPokemon();

	/*! \brief Set 
	 */
	void setLearnedByPokemon(std::list <AbilityDetail_pokemon_inner_pokemon> learned_by_pokemon);

private:
	int id;
	std::string name;
	int accuracy;
	int effect_chance;
	int pp;
	int priority;
	int power;
	MoveDetail_contest_combos contest_combos;
	ContestTypeSummary contest_type;
	ContestEffectSummary contest_effect;
	MoveDamageClassSummary damage_class;
	std::list <MoveChange_effect_entries_inner>effect_entries;
	std::list <MoveDetail_effect_changes_inner>effect_changes;
	GenerationSummary generation;
	MoveMeta meta;
	std::list <MoveName>names;
	std::list <MoveChange>past_values;
	std::list <MoveDetail_stat_changes_inner>stat_changes;
	SuperContestEffectSummary super_contest_effect;
	MoveTargetSummary target;
	TypeSummary type;
	std::list <MoveDetail_machines_inner>machines;
	std::list <MoveFlavorText>flavor_text_entries;
	std::list <AbilityDetail_pokemon_inner_pokemon>learned_by_pokemon;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveDetail_H_ */
