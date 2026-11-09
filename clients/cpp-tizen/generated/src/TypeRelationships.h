/*
 * TypeRelationships.h
 *
 * 
 */

#ifndef _TypeRelationships_H_
#define _TypeRelationships_H_


#include <string>
#include "TypeSummary.h"
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

class TypeRelationships : public Object {
public:
	/*! \brief Constructor.
	 */
	TypeRelationships();
	TypeRelationships(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TypeRelationships();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of types this type has no effect on.
	 */
	std::list<TypeSummary> getNoDamageTo();

	/*! \brief Set A list of types this type has no effect on.
	 */
	void setNoDamageTo(std::list <TypeSummary> no_damage_to);
	/*! \brief Get A list of types this type is not very effect against.
	 */
	std::list<TypeSummary> getHalfDamageTo();

	/*! \brief Set A list of types this type is not very effect against.
	 */
	void setHalfDamageTo(std::list <TypeSummary> half_damage_to);
	/*! \brief Get A list of types this type is very effect against.
	 */
	std::list<TypeSummary> getDoubleDamageTo();

	/*! \brief Set A list of types this type is very effect against.
	 */
	void setDoubleDamageTo(std::list <TypeSummary> double_damage_to);
	/*! \brief Get A list of types that have no effect on this type.
	 */
	std::list<TypeSummary> getNoDamageFrom();

	/*! \brief Set A list of types that have no effect on this type.
	 */
	void setNoDamageFrom(std::list <TypeSummary> no_damage_from);
	/*! \brief Get A list of types that are not very effective against this type.
	 */
	std::list<TypeSummary> getHalfDamageFrom();

	/*! \brief Set A list of types that are not very effective against this type.
	 */
	void setHalfDamageFrom(std::list <TypeSummary> half_damage_from);
	/*! \brief Get A list of types that are very effective against this type.
	 */
	std::list<TypeSummary> getDoubleDamageFrom();

	/*! \brief Set A list of types that are very effective against this type.
	 */
	void setDoubleDamageFrom(std::list <TypeSummary> double_damage_from);

private:
	std::list <TypeSummary>no_damage_to;
	std::list <TypeSummary>half_damage_to;
	std::list <TypeSummary>double_damage_to;
	std::list <TypeSummary>no_damage_from;
	std::list <TypeSummary>half_damage_from;
	std::list <TypeSummary>double_damage_from;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TypeRelationships_H_ */
