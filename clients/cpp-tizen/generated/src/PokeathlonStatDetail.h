/*
 * PokeathlonStatDetail.h
 *
 * 
 */

#ifndef _PokeathlonStatDetail_H_
#define _PokeathlonStatDetail_H_


#include <string>
#include "PokeathlonStatAffectingNatures.h"
#include "PokeathlonStatName.h"
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

class PokeathlonStatDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	PokeathlonStatDetail();
	PokeathlonStatDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokeathlonStatDetail();

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
	/*! \brief Get A detail of natures which affect this Pokéathlon stat positively or negatively.
	 */
	PokeathlonStatAffectingNatures getAffectingNatures();

	/*! \brief Set A detail of natures which affect this Pokéathlon stat positively or negatively.
	 */
	void setAffectingNatures(PokeathlonStatAffectingNatures  affecting_natures);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PokeathlonStatName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <PokeathlonStatName> names);

private:
	int id;
	std::string name;
	PokeathlonStatAffectingNatures affecting_natures;
	std::list <PokeathlonStatName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokeathlonStatDetail_H_ */
