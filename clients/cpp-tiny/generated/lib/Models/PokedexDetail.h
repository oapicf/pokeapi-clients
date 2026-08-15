
/*
 * PokedexDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokedexDetail_H_
#define TINY_CPP_CLIENT_PokedexDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "PokedexDescription.h"
#include "PokedexDetail_pokemon_entries_inner.h"
#include "PokedexName.h"
#include "RegionSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokedexDetail{
public:

    /*! \brief Constructor.
	 */
    PokedexDetail();
    PokedexDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokedexDetail();


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
	bool isIsMainSeries();

	/*! \brief Set 
	 */
	void setIsMainSeries(bool  is_main_series);
	/*! \brief Get 
	 */
	std::list<PokedexDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <PokedexDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<PokedexName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <PokedexName> names);
	/*! \brief Get 
	 */
	std::list<PokedexDetail_pokemon_entries_inner> getPokemonEntries();

	/*! \brief Set 
	 */
	void setPokemonEntries(std::list <PokedexDetail_pokemon_entries_inner> pokemon_entries);
	/*! \brief Get 
	 */
	RegionSummary getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionSummary  region);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getVersionGroups();

	/*! \brief Set 
	 */
	void setVersionGroups(std::list <AbilityDetail_pokemon_inner_pokemon> version_groups);


    private:
    int id{};
    std::string name{};
    bool is_main_series{};
    std::list<PokedexDescription> descriptions;
    std::list<PokedexName> names;
    std::list<PokedexDetail_pokemon_entries_inner> pokemon_entries;
    RegionSummary region;
    std::list<AbilityDetail_pokemon_inner_pokemon> version_groups;
};
}

#endif /* TINY_CPP_CLIENT_PokedexDetail_H_ */
