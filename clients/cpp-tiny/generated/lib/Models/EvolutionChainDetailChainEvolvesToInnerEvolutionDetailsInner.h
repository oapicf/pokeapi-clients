
/*
 * EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_H_
#define TINY_CPP_CLIENT_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.h"
#include "Object.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner{
public:

    /*! \brief Constructor.
	 */
    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner();
    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender getGender();

	/*! \brief Set 
	 */
	void setGender(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender  gender);
	/*! \brief Get 
	 */
	EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender getHeldItem();

	/*! \brief Set 
	 */
	void setHeldItem(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender  held_item);
	/*! \brief Get 
	 */
	EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender getItem();

	/*! \brief Set 
	 */
	void setItem(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender  item);
	/*! \brief Get 
	 */
	Object getKnownMove();

	/*! \brief Set 
	 */
	void setKnownMove(Object  known_move);
	/*! \brief Get 
	 */
	Object getKnownMoveType();

	/*! \brief Set 
	 */
	void setKnownMoveType(Object  known_move_type);
	/*! \brief Get 
	 */
	EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender getLocation();

	/*! \brief Set 
	 */
	void setLocation(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender  location);
	/*! \brief Get 
	 */
	int getMinAffection();

	/*! \brief Set 
	 */
	void setMinAffection(int  min_affection);
	/*! \brief Get 
	 */
	int getMinBeauty();

	/*! \brief Set 
	 */
	void setMinBeauty(int  min_beauty);
	/*! \brief Get 
	 */
	int getMinHappiness();

	/*! \brief Set 
	 */
	void setMinHappiness(int  min_happiness);
	/*! \brief Get 
	 */
	int getMinLevel();

	/*! \brief Set 
	 */
	void setMinLevel(int  min_level);
	/*! \brief Get 
	 */
	bool isNeedsOverworldRain();

	/*! \brief Set 
	 */
	void setNeedsOverworldRain(bool  needs_overworld_rain);
	/*! \brief Get 
	 */
	std::string getPartySpecies();

	/*! \brief Set 
	 */
	void setPartySpecies(std::string  party_species);
	/*! \brief Get 
	 */
	std::string getPartyType();

	/*! \brief Set 
	 */
	void setPartyType(std::string  party_type);
	/*! \brief Get 
	 */
	std::string getRelativePhysicalStats();

	/*! \brief Set 
	 */
	void setRelativePhysicalStats(std::string  relative_physical_stats);
	/*! \brief Get 
	 */
	std::string getTimeOfDay();

	/*! \brief Set 
	 */
	void setTimeOfDay(std::string  time_of_day);
	/*! \brief Get 
	 */
	std::string getTradeSpecies();

	/*! \brief Set 
	 */
	void setTradeSpecies(std::string  trade_species);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getTrigger();

	/*! \brief Set 
	 */
	void setTrigger(AbilityDetail_pokemon_inner_pokemon  trigger);
	/*! \brief Get 
	 */
	bool isTurnUpsideDown();

	/*! \brief Set 
	 */
	void setTurnUpsideDown(bool  turn_upside_down);


    private:
    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender gender;
    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender held_item;
    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender item;
    Object known_move;
    Object known_move_type;
    EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender location;
    int min_affection{};
    int min_beauty{};
    int min_happiness{};
    int min_level{};
    bool needs_overworld_rain{};
    std::string party_species{};
    std::string party_type{};
    std::string relative_physical_stats{};
    std::string time_of_day{};
    std::string trade_species{};
    AbilityDetail_pokemon_inner_pokemon trigger;
    bool turn_upside_down{};
};
}

#endif /* TINY_CPP_CLIENT_EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_H_ */
