
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
#include "BerrySummary.h"
#include "NatureBattleStylePreference.h"
#include "NatureDetail_pokeathlon_stat_changes_inner.h"
#include "NatureName.h"
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
	StatSummary getDecreasedStat();

	/*! \brief Set 
	 */
	void setDecreasedStat(StatSummary  decreased_stat);
	/*! \brief Get 
	 */
	StatSummary getIncreasedStat();

	/*! \brief Set 
	 */
	void setIncreasedStat(StatSummary  increased_stat);
	/*! \brief Get 
	 */
	BerryFlavorSummary getLikesFlavor();

	/*! \brief Set 
	 */
	void setLikesFlavor(BerryFlavorSummary  likes_flavor);
	/*! \brief Get 
	 */
	BerryFlavorSummary getHatesFlavor();

	/*! \brief Set 
	 */
	void setHatesFlavor(BerryFlavorSummary  hates_flavor);
	/*! \brief Get 
	 */
	std::list<BerrySummary> getBerries();

	/*! \brief Set 
	 */
	void setBerries(std::list <BerrySummary> berries);
	/*! \brief Get 
	 */
	std::list<NatureDetail_pokeathlon_stat_changes_inner> getPokeathlonStatChanges();

	/*! \brief Set 
	 */
	void setPokeathlonStatChanges(std::list <NatureDetail_pokeathlon_stat_changes_inner> pokeathlon_stat_changes);
	/*! \brief Get 
	 */
	std::list<NatureBattleStylePreference> getMoveBattleStylePreferences();

	/*! \brief Set 
	 */
	void setMoveBattleStylePreferences(std::list <NatureBattleStylePreference> move_battle_style_preferences);
	/*! \brief Get 
	 */
	std::list<NatureName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <NatureName> names);


    private:
    int id{};
    std::string name{};
    StatSummary decreased_stat;
    StatSummary increased_stat;
    BerryFlavorSummary likes_flavor;
    BerryFlavorSummary hates_flavor;
    std::list<BerrySummary> berries;
    std::list<NatureDetail_pokeathlon_stat_changes_inner> pokeathlon_stat_changes;
    std::list<NatureBattleStylePreference> move_battle_style_preferences;
    std::list<NatureName> names;
};
}

#endif /* TINY_CPP_CLIENT_NatureDetail_H_ */
