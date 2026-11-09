/*
 * PokemonEvolution.h
 *
 * 
 */

#ifndef _PokemonEvolution_H_
#define _PokemonEvolution_H_


#include <string>
#include "EvolutionConditionExpression.h"
#include "EvolutionTriggerSummary.h"
#include "ItemSummary.h"
#include "LocationSummary.h"
#include "MoveSummary.h"
#include "NatureSummary.h"
#include "PokemonEvolution_known_move.h"
#include "PokemonFormSummary.h"
#include "PokemonSpeciesSummary.h"
#include "RegionSummary.h"
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

class PokemonEvolution : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonEvolution();
	PokemonEvolution(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonEvolution();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The version group in which these evolution requirements apply.
	 */
	VersionGroupSummary getVersionGroup();

	/*! \brief Set The version group in which these evolution requirements apply.
	 */
	void setVersionGroup(VersionGroupSummary  version_group);
	/*! \brief Get Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
	 */
	bool getIsDefault();

	/*! \brief Set Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
	 */
	void setIsDefault(bool  is_default);
	/*! \brief Get The item required to cause evolution this into Pokémon species.
	 */
	ItemSummary getItem();

	/*! \brief Set The item required to cause evolution this into Pokémon species.
	 */
	void setItem(ItemSummary  item);
	/*! \brief Get The type of event that triggers evolution into this Pokémon species.
	 */
	EvolutionTriggerSummary getTrigger();

	/*! \brief Set The type of event that triggers evolution into this Pokémon species.
	 */
	void setTrigger(EvolutionTriggerSummary  trigger);
	/*! \brief Get The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
	 */
	int getGender();

	/*! \brief Set The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
	 */
	void setGender(int  gender);
	/*! \brief Get The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
	 */
	ItemSummary getHeldItem();

	/*! \brief Set The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
	 */
	void setHeldItem(ItemSummary  held_item);
	/*! \brief Get 
	 */
	PokemonEvolution_known_move getKnownMove();

	/*! \brief Set 
	 */
	void setKnownMove(PokemonEvolution_known_move  known_move);
	/*! \brief Get 
	 */
	PokemonEvolution_known_move getKnownMoveType();

	/*! \brief Set 
	 */
	void setKnownMoveType(PokemonEvolution_known_move  known_move_type);
	/*! \brief Get The location the evolution must be triggered at.
	 */
	LocationSummary getLocation();

	/*! \brief Set The location the evolution must be triggered at.
	 */
	void setLocation(LocationSummary  location);
	/*! \brief Get The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
	 */
	int getMinLevel();

	/*! \brief Set The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
	 */
	void setMinLevel(int  min_level);
	/*! \brief Get The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
	 */
	int getMinHappiness();

	/*! \brief Set The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
	 */
	void setMinHappiness(int  min_happiness);
	/*! \brief Get The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
	 */
	int getMinBeauty();

	/*! \brief Set The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
	 */
	void setMinBeauty(int  min_beauty);
	/*! \brief Get The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
	 */
	int getMinAffection();

	/*! \brief Set The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
	 */
	void setMinAffection(int  min_affection);
	/*! \brief Get Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
	 */
	bool getNearSpecialRock();

	/*! \brief Set Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
	 */
	void setNearSpecialRock(bool  near_special_rock);
	/*! \brief Get Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
	 */
	bool getNeedsMultiplayer();

	/*! \brief Set Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
	 */
	void setNeedsMultiplayer(bool  needs_multiplayer);
	/*! \brief Get Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
	 */
	bool getNeedsOverworldRain();

	/*! \brief Set Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
	 */
	void setNeedsOverworldRain(bool  needs_overworld_rain);
	/*! \brief Get The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
	 */
	PokemonSpeciesSummary getPartySpecies();

	/*! \brief Set The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
	 */
	void setPartySpecies(PokemonSpeciesSummary  party_species);
	/*! \brief Get The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
	 */
	TypeSummary getPartyType();

	/*! \brief Set The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
	 */
	void setPartyType(TypeSummary  party_type);
	/*! \brief Get The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
	 */
	int getRelativePhysicalStats();

	/*! \brief Set The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
	 */
	void setRelativePhysicalStats(int  relative_physical_stats);
	/*! \brief Get The required time of day. Day or night.
	 */
	std::string getTimeOfDay();

	/*! \brief Set The required time of day. Day or night.
	 */
	void setTimeOfDay(std::string  time_of_day);
	/*! \brief Get Pokémon species for which this one must be traded.
	 */
	PokemonSpeciesSummary getTradeSpecies();

	/*! \brief Set Pokémon species for which this one must be traded.
	 */
	void setTradeSpecies(PokemonSpeciesSummary  trade_species);
	/*! \brief Get Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
	 */
	bool getTurnUpsideDown();

	/*! \brief Set Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
	 */
	void setTurnUpsideDown(bool  turn_upside_down);
	/*! \brief Get The required region in which this evolution can occur.
	 */
	RegionSummary getRegion();

	/*! \brief Set The required region in which this evolution can occur.
	 */
	void setRegion(RegionSummary  region);
	/*! \brief Get The Pokémon form required before evolving, or null if unrestricted.
	 */
	PokemonFormSummary getRequiredPokemonForm();

	/*! \brief Set The Pokémon form required before evolving, or null if unrestricted.
	 */
	void setRequiredPokemonForm(PokemonFormSummary  required_pokemon_form);
	/*! \brief Get The Pokémon form produced by this evolution, or null if unspecified.
	 */
	PokemonFormSummary getEvolvedPokemonForm();

	/*! \brief Set The Pokémon form produced by this evolution, or null if unspecified.
	 */
	void setEvolvedPokemonForm(PokemonFormSummary  evolved_pokemon_form);
	/*! \brief Get The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
	 */
	MoveSummary getUsedMove();

	/*! \brief Set The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
	 */
	void setUsedMove(MoveSummary  used_move);
	/*! \brief Get The minimum number of times a move must be used in order to evolve into this Pokémon species.
	 */
	int getMinMoveCount();

	/*! \brief Set The minimum number of times a move must be used in order to evolve into this Pokémon species.
	 */
	void setMinMoveCount(int  min_move_count);
	/*! \brief Get The minimum number of steps that must be taken in order to evolve into this Pokémon species.
	 */
	int getMinSteps();

	/*! \brief Set The minimum number of steps that must be taken in order to evolve into this Pokémon species.
	 */
	void setMinSteps(int  min_steps);
	/*! \brief Get The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
	 */
	int getMinDamageTaken();

	/*! \brief Set The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
	 */
	void setMinDamageTaken(int  min_damage_taken);
	/*! \brief Get The natures that allow this evolution, or null if unrestricted.
	 */
	std::list<NatureSummary> getAllowedNatures();

	/*! \brief Set The natures that allow this evolution, or null if unrestricted.
	 */
	void setAllowedNatures(std::list <NatureSummary> allowed_natures);
	/*! \brief Get An additional evolution condition expressed in reverse Polish notation, or null if none.
	 */
	EvolutionConditionExpression getConditionExpression();

	/*! \brief Set An additional evolution condition expressed in reverse Polish notation, or null if none.
	 */
	void setConditionExpression(EvolutionConditionExpression  condition_expression);

private:
	VersionGroupSummary version_group;
	bool is_default;
	ItemSummary item;
	EvolutionTriggerSummary trigger;
	int gender;
	ItemSummary held_item;
	PokemonEvolution_known_move known_move;
	PokemonEvolution_known_move known_move_type;
	LocationSummary location;
	int min_level;
	int min_happiness;
	int min_beauty;
	int min_affection;
	bool near_special_rock;
	bool needs_multiplayer;
	bool needs_overworld_rain;
	PokemonSpeciesSummary party_species;
	TypeSummary party_type;
	int relative_physical_stats;
	std::string time_of_day;
	PokemonSpeciesSummary trade_species;
	bool turn_upside_down;
	RegionSummary region;
	PokemonFormSummary required_pokemon_form;
	PokemonFormSummary evolved_pokemon_form;
	MoveSummary used_move;
	int min_move_count;
	int min_steps;
	int min_damage_taken;
	std::list <NatureSummary>allowed_natures;
	EvolutionConditionExpression condition_expression;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonEvolution_H_ */
