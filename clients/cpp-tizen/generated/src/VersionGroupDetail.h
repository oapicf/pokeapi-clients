/*
 * VersionGroupDetail.h
 *
 * 
 */

#ifndef _VersionGroupDetail_H_
#define _VersionGroupDetail_H_


#include <string>
#include "GenerationSummary.h"
#include "MoveLearnMethodSummary.h"
#include "PokedexSummary.h"
#include "RegionSummary.h"
#include "VersionSummary.h"
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

class VersionGroupDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	VersionGroupDetail();
	VersionGroupDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VersionGroupDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get Order for sorting. Almost by date of release, except similar versions are grouped together.
	 */
	int getOrder();

	/*! \brief Set Order for sorting. Almost by date of release, except similar versions are grouped together.
	 */
	void setOrder(int  order);
	/*! \brief Get The generation this version was introduced in.
	 */
	GenerationSummary getGeneration();

	/*! \brief Set The generation this version was introduced in.
	 */
	void setGeneration(GenerationSummary  generation);
	/*! \brief Get A list of methods in which Pokémon can learn moves in this version group.
	 */
	std::list<MoveLearnMethodSummary> getMoveLearnMethods();

	/*! \brief Set A list of methods in which Pokémon can learn moves in this version group.
	 */
	void setMoveLearnMethods(std::list <MoveLearnMethodSummary> move_learn_methods);
	/*! \brief Get A list of Pokédexes introduces in this version group.
	 */
	std::list<PokedexSummary> getPokedexes();

	/*! \brief Set A list of Pokédexes introduces in this version group.
	 */
	void setPokedexes(std::list <PokedexSummary> pokedexes);
	/*! \brief Get A list of regions that can be visited in this version group.
	 */
	std::list<RegionSummary> getRegions();

	/*! \brief Set A list of regions that can be visited in this version group.
	 */
	void setRegions(std::list <RegionSummary> regions);
	/*! \brief Get The versions this version group owns.
	 */
	std::list<VersionSummary> getVersions();

	/*! \brief Set The versions this version group owns.
	 */
	void setVersions(std::list <VersionSummary> versions);

private:
	int id;
	std::string name;
	int order;
	GenerationSummary generation;
	std::list <MoveLearnMethodSummary>move_learn_methods;
	std::list <PokedexSummary>pokedexes;
	std::list <RegionSummary>regions;
	std::list <VersionSummary>versions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VersionGroupDetail_H_ */
