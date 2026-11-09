
/*
 * GenerationDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GenerationDetail_H_
#define TINY_CPP_CLIENT_GenerationDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilitySummary.h"
#include "GenerationName.h"
#include "MoveSummary.h"
#include "PokemonSpeciesSummary.h"
#include "RegionSummary.h"
#include "TypeSummary.h"
#include "VersionGroupSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GenerationDetail{
public:

    /*! \brief Constructor.
	 */
    GenerationDetail();
    GenerationDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerationDetail();


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
	/*! \brief Get A list of abilities that were introduced in this generation.
	 */
	std::list<AbilitySummary> getAbilities();

	/*! \brief Set A list of abilities that were introduced in this generation.
	 */
	void setAbilities(std::list<AbilitySummary> abilities);
	/*! \brief Get The main region travelled in this generation.
	 */
	RegionSummary getMainRegion();

	/*! \brief Set The main region travelled in this generation.
	 */
	void setMainRegion(RegionSummary main_region);
	/*! \brief Get A list of moves that were introduced in this generation.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that were introduced in this generation.
	 */
	void setMoves(std::list<MoveSummary> moves);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<GenerationName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<GenerationName> names);
	/*! \brief Get A list of Pokémon species that were introduced in this generation.
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set A list of Pokémon species that were introduced in this generation.
	 */
	void setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species);
	/*! \brief Get A list of types that were introduced in this generation.
	 */
	std::list<TypeSummary> getTypes();

	/*! \brief Set A list of types that were introduced in this generation.
	 */
	void setTypes(std::list<TypeSummary> types);
	/*! \brief Get A list of version groups that were introduced in this generation.
	 */
	std::list<VersionGroupSummary> getVersionGroups();

	/*! \brief Set A list of version groups that were introduced in this generation.
	 */
	void setVersionGroups(std::list<VersionGroupSummary> version_groups);


    private:
    int id{};
    std::string name{};
    std::list<AbilitySummary> abilities;
    RegionSummary main_region;
    std::list<MoveSummary> moves;
    std::list<GenerationName> names;
    std::list<PokemonSpeciesSummary> pokemon_species;
    std::list<TypeSummary> types;
    std::list<VersionGroupSummary> version_groups;
};
}

#endif /* TINY_CPP_CLIENT_GenerationDetail_H_ */
