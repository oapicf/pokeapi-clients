//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_detail_past_damage_relations_inner_damage_relations.g.dart';

/// TypeDetailPastDamageRelationsInnerDamageRelations
///
/// Properties:
/// * [noDamageTo] 
/// * [halfDamageTo] 
/// * [doubleDamageTo] 
/// * [noDamageFrom] 
/// * [halfDamageFrom] 
/// * [doubleDamageFrom] 
@BuiltValue()
abstract class TypeDetailPastDamageRelationsInnerDamageRelations implements Built<TypeDetailPastDamageRelationsInnerDamageRelations, TypeDetailPastDamageRelationsInnerDamageRelationsBuilder> {
  @BuiltValueField(wireName: r'no_damage_to')
  BuiltList<AbilityDetailPokemonInnerPokemon> get noDamageTo;

  @BuiltValueField(wireName: r'half_damage_to')
  BuiltList<AbilityDetailPokemonInnerPokemon> get halfDamageTo;

  @BuiltValueField(wireName: r'double_damage_to')
  BuiltList<AbilityDetailPokemonInnerPokemon> get doubleDamageTo;

  @BuiltValueField(wireName: r'no_damage_from')
  BuiltList<AbilityDetailPokemonInnerPokemon> get noDamageFrom;

  @BuiltValueField(wireName: r'half_damage_from')
  BuiltList<AbilityDetailPokemonInnerPokemon> get halfDamageFrom;

  @BuiltValueField(wireName: r'double_damage_from')
  BuiltList<AbilityDetailPokemonInnerPokemon> get doubleDamageFrom;

  TypeDetailPastDamageRelationsInnerDamageRelations._();

  factory TypeDetailPastDamageRelationsInnerDamageRelations([void updates(TypeDetailPastDamageRelationsInnerDamageRelationsBuilder b)]) = _$TypeDetailPastDamageRelationsInnerDamageRelations;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeDetailPastDamageRelationsInnerDamageRelationsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeDetailPastDamageRelationsInnerDamageRelations> get serializer => _$TypeDetailPastDamageRelationsInnerDamageRelationsSerializer();
}

class _$TypeDetailPastDamageRelationsInnerDamageRelationsSerializer implements PrimitiveSerializer<TypeDetailPastDamageRelationsInnerDamageRelations> {
  @override
  final Iterable<Type> types = const [TypeDetailPastDamageRelationsInnerDamageRelations, _$TypeDetailPastDamageRelationsInnerDamageRelations];

  @override
  final String wireName = r'TypeDetailPastDamageRelationsInnerDamageRelations';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeDetailPastDamageRelationsInnerDamageRelations object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'no_damage_to';
    yield serializers.serialize(
      object.noDamageTo,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'half_damage_to';
    yield serializers.serialize(
      object.halfDamageTo,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'double_damage_to';
    yield serializers.serialize(
      object.doubleDamageTo,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'no_damage_from';
    yield serializers.serialize(
      object.noDamageFrom,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'half_damage_from';
    yield serializers.serialize(
      object.halfDamageFrom,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
    yield r'double_damage_from';
    yield serializers.serialize(
      object.doubleDamageFrom,
      specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeDetailPastDamageRelationsInnerDamageRelations object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeDetailPastDamageRelationsInnerDamageRelationsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'no_damage_to':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.noDamageTo.replace(valueDes);
          break;
        case r'half_damage_to':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.halfDamageTo.replace(valueDes);
          break;
        case r'double_damage_to':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.doubleDamageTo.replace(valueDes);
          break;
        case r'no_damage_from':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.noDamageFrom.replace(valueDes);
          break;
        case r'half_damage_from':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.halfDamageFrom.replace(valueDes);
          break;
        case r'double_damage_from':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AbilityDetailPokemonInnerPokemon)]),
          ) as BuiltList<AbilityDetailPokemonInnerPokemon>;
          result.doubleDamageFrom.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypeDetailPastDamageRelationsInnerDamageRelations deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeDetailPastDamageRelationsInnerDamageRelationsBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

