/*
 * PokeathlonStatDetail.h
 *
 * 
 */

#ifndef _PokeathlonStatDetail_H_
#define _PokeathlonStatDetail_H_


#include <string>
#include "PokeathlonStatDetail_affecting_natures.h"
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
	PokeathlonStatDetail_affecting_natures getAffectingNatures();

	/*! \brief Set 
	 */
	void setAffectingNatures(PokeathlonStatDetail_affecting_natures  affecting_natures);
	/*! \brief Get 
	 */
	std::list<PokeathlonStatName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <PokeathlonStatName> names);

private:
	int id;
	std::string name;
	PokeathlonStatDetail_affecting_natures affecting_natures;
	std::list <PokeathlonStatName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokeathlonStatDetail_H_ */
