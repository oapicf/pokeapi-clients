
/*
 * NatureDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_NatureDetail_H_
#define TINY_CPP_CLIENT_NatureDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BerryFlavorSummary.h"
#include "NatureBattleStylePreference.h"
#include "NatureName.h"
#include "NaturePokeathlonStat.h"
#include "StatSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class NatureDetail{
public:

    /*! \brief Constructor.
	 */
    NatureDetail();
    NatureDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NatureDetail();


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
	/*! \brief Get The stat decreased by 10% in Pokémon with this nature.
	 */
	StatSummary getDecreasedStat();

	/*! \brief Set The stat decreased by 10% in Pokémon with this nature.
	 */
	void setDecreasedStat(StatSummary decreased_stat);
	/*! \brief Get The stat increased by 10% in Pokémon with this nature.
	 */
	StatSummary getIncreasedStat();

	/*! \brief Set The stat increased by 10% in Pokémon with this nature.
	 */
	void setIncreasedStat(StatSummary increased_stat);
	/*! \brief Get The flavor liked by Pokémon with this nature.
	 */
	BerryFlavorSummary getLikesFlavor();

	/*! \brief Set The flavor liked by Pokémon with this nature.
	 */
	void setLikesFlavor(BerryFlavorSummary likes_flavor);
	/*! \brief Get The flavor hated by Pokémon with this nature.
	 */
	BerryFlavorSummary getHatesFlavor();

	/*! \brief Set The flavor hated by Pokémon with this nature.
	 */
	void setHatesFlavor(BerryFlavorSummary hates_flavor);
	/*! \brief Get A list of Pokéathlon stats this nature effects and how much it effects them.
	 */
	std::list<NaturePokeathlonStat> getPokeathlonStatChanges();

	/*! \brief Set A list of Pokéathlon stats this nature effects and how much it effects them.
	 */
	void setPokeathlonStatChanges(std::list<NaturePokeathlonStat> pokeathlon_stat_changes);
	/*! \brief Get A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
	 */
	std::list<NatureBattleStylePreference> getMoveBattleStylePreferences();

	/*! \brief Set A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
	 */
	void setMoveBattleStylePreferences(std::list<NatureBattleStylePreference> move_battle_style_preferences);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<NatureName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<NatureName> names);


    private:
    int id{};
    std::string name{};
    StatSummary decreased_stat;
    StatSummary increased_stat;
    BerryFlavorSummary likes_flavor;
    BerryFlavorSummary hates_flavor;
    std::list<NaturePokeathlonStat> pokeathlon_stat_changes;
    std::list<NatureBattleStylePreference> move_battle_style_preferences;
    std::list<NatureName> names;
};
}

#endif /* TINY_CPP_CLIENT_NatureDetail_H_ */
