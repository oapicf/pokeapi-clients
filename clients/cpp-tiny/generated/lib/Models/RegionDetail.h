
/*
 * RegionDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_RegionDetail_H_
#define TINY_CPP_CLIENT_RegionDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "GenerationSummary.h"
#include "LocationSummary.h"
#include "PokedexSummary.h"
#include "RegionName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RegionDetail{
public:

    /*! \brief Constructor.
	 */
    RegionDetail();
    RegionDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~RegionDetail();


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
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<LocationSummary> getLocations();

	/*! \brief Set 
	 */
	void setLocations(std::list<LocationSummary> locations);
	/*! \brief Get 
	 */
	GenerationSummary getMainGeneration();

	/*! \brief Set 
	 */
	void setMainGeneration(GenerationSummary main_generation);
	/*! \brief Get 
	 */
	std::list<RegionName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<RegionName> names);
	/*! \brief Get 
	 */
	std::list<PokedexSummary> getPokedexes();

	/*! \brief Set 
	 */
	void setPokedexes(std::list<PokedexSummary> pokedexes);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getVersionGroups();

	/*! \brief Set 
	 */
	void setVersionGroups(std::list<AbilityDetail_pokemon_inner_pokemon> version_groups);


    private:
    int id{};
    std::string name{};
    std::list<LocationSummary> locations;
    GenerationSummary main_generation;
    std::list<RegionName> names;
    std::list<PokedexSummary> pokedexes;
    std::list<AbilityDetail_pokemon_inner_pokemon> version_groups;
};
}

#endif /* TINY_CPP_CLIENT_RegionDetail_H_ */
