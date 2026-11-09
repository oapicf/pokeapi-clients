
/*
 * MoveDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveDetail_H_
#define TINY_CPP_CLIENT_MoveDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ContestEffectSummary.h"
#include "ContestTypeSummary.h"
#include "GenerationSummary.h"
#include "ItemMachine.h"
#include "MoveChange.h"
#include "MoveCombos.h"
#include "MoveDamageClassSummary.h"
#include "MoveEffectChange.h"
#include "MoveEffectEffectText.h"
#include "MoveFlavorText.h"
#include "MoveMeta.h"
#include "MoveMetaStatChange.h"
#include "MoveName.h"
#include "MoveTargetSummary.h"
#include "PokemonSummary.h"
#include "SuperContestEffectSummary.h"
#include "TypeSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveDetail{
public:

    /*! \brief Constructor.
	 */
    MoveDetail();
    MoveDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get The percent value of how likely this move is to be successful.
	 */
	int getAccuracy();

	/*! \brief Set The percent value of how likely this move is to be successful.
	 */
	void setAccuracy(int accuracy);
	/*! \brief Get The percent value of how likely it is this moves effect will happen.
	 */
	int getEffectChance();

	/*! \brief Set The percent value of how likely it is this moves effect will happen.
	 */
	void setEffectChance(int effect_chance);
	/*! \brief Get Power points. The number of times this move can be used.
	 */
	int getPp();

	/*! \brief Set Power points. The number of times this move can be used.
	 */
	void setPp(int pp);
	/*! \brief Get A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
	 */
	int getPriority();

	/*! \brief Set A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
	 */
	void setPriority(int priority);
	/*! \brief Get The base power of this move, or null if it has no fixed base power.
	 */
	int getPower();

	/*! \brief Set The base power of this move, or null if it has no fixed base power.
	 */
	void setPower(int power);
	/*! \brief Get A detail of normal and super contest combos that require this move.
	 */
	MoveCombos getContestCombos();

	/*! \brief Set A detail of normal and super contest combos that require this move.
	 */
	void setContestCombos(MoveCombos contest_combos);
	/*! \brief Get The type of appeal this move gives a Pokémon when used in a contest.
	 */
	ContestTypeSummary getContestType();

	/*! \brief Set The type of appeal this move gives a Pokémon when used in a contest.
	 */
	void setContestType(ContestTypeSummary contest_type);
	/*! \brief Get The effect the move has when used in a contest.
	 */
	ContestEffectSummary getContestEffect();

	/*! \brief Set The effect the move has when used in a contest.
	 */
	void setContestEffect(ContestEffectSummary contest_effect);
	/*! \brief Get The type of damage the move inflicts on the target, e.g. physical.
	 */
	MoveDamageClassSummary getDamageClass();

	/*! \brief Set The type of damage the move inflicts on the target, e.g. physical.
	 */
	void setDamageClass(MoveDamageClassSummary damage_class);
	/*! \brief Get The effect of this move listed in different languages.
	 */
	std::list<MoveEffectEffectText> getEffectEntries();

	/*! \brief Set The effect of this move listed in different languages.
	 */
	void setEffectEntries(std::list<MoveEffectEffectText> effect_entries);
	/*! \brief Get The list of previous effects this move has had across version groups of the games.
	 */
	std::list<MoveEffectChange> getEffectChanges();

	/*! \brief Set The list of previous effects this move has had across version groups of the games.
	 */
	void setEffectChanges(std::list<MoveEffectChange> effect_changes);
	/*! \brief Get The generation in which this move was introduced.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The generation in which this move was introduced.
	 */
	void setGeneration(GenerationSummary generation);
	/*! \brief Get Metadata about this move
	 */
	MoveMeta getMeta();

	/*! \brief Set Metadata about this move
	 */
	void setMeta(MoveMeta meta);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<MoveName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<MoveName> names);
	/*! \brief Get A list of move resource value changes across version groups of the game.
	 */
	std::list<MoveChange> getPastValues();

	/*! \brief Set A list of move resource value changes across version groups of the game.
	 */
	void setPastValues(std::list<MoveChange> past_values);
	/*! \brief Get A list of stats this moves effects and how much it effects them.
	 */
	std::list<MoveMetaStatChange> getStatChanges();

	/*! \brief Set A list of stats this moves effects and how much it effects them.
	 */
	void setStatChanges(std::list<MoveMetaStatChange> stat_changes);
	/*! \brief Get The effect the move has when used in a super contest.
	 */
	SuperContestEffectSummary getSuperContestEffect();

	/*! \brief Set The effect the move has when used in a super contest.
	 */
	void setSuperContestEffect(SuperContestEffectSummary super_contest_effect);
	/*! \brief Get The type of target that will receive the effects of the attack.
	 */
	MoveTargetSummary getTarget();

	/*! \brief Set The type of target that will receive the effects of the attack.
	 */
	void setTarget(MoveTargetSummary target);
	/*! \brief Get The elemental type of this move.
	 */
	TypeSummary getType();

	/*! \brief Set The elemental type of this move.
	 */
	void setType(TypeSummary type);
	/*! \brief Get A list of the machines that teach this move.
	 */
	std::list<ItemMachine> getMachines();

	/*! \brief Set A list of the machines that teach this move.
	 */
	void setMachines(std::list<ItemMachine> machines);
	/*! \brief Get The flavor text of this move listed in different languages.
	 */
	std::list<MoveFlavorText> getFlavorTextEntries();

	/*! \brief Set The flavor text of this move listed in different languages.
	 */
	void setFlavorTextEntries(std::list<MoveFlavorText> flavor_text_entries);
	/*! \brief Get List of Pokemon that can learn the move
	 */
	std::list<PokemonSummary> getLearnedByPokemon();

	/*! \brief Set List of Pokemon that can learn the move
	 */
	void setLearnedByPokemon(std::list<PokemonSummary> learned_by_pokemon);


    private:
    int id{};
    std::string name{};
    int accuracy{};
    int effect_chance{};
    int pp{};
    int priority{};
    int power{};
    MoveCombos contest_combos;
    ContestTypeSummary contest_type;
    ContestEffectSummary contest_effect;
    MoveDamageClassSummary damage_class;
    std::list<MoveEffectEffectText> effect_entries;
    std::list<MoveEffectChange> effect_changes;
    GenerationSummary generation;
    MoveMeta meta;
    std::list<MoveName> names;
    std::list<MoveChange> past_values;
    std::list<MoveMetaStatChange> stat_changes;
    SuperContestEffectSummary super_contest_effect;
    MoveTargetSummary target;
    TypeSummary type;
    std::list<ItemMachine> machines;
    std::list<MoveFlavorText> flavor_text_entries;
    std::list<PokemonSummary> learned_by_pokemon;
};
}

#endif /* TINY_CPP_CLIENT_MoveDetail_H_ */
