//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_detail_damage_relations.g.dart';

/// TypeDetailDamageRelations
///
/// Properties:
/// * [noDamageTo] 
/// * [halfDamageTo] 
/// * [doubleDamageTo] 
/// * [noDamageFrom] 
/// * [halfDamageFrom] 
/// * [doubleDamageFrom] 
@BuiltValue()
abstract class TypeDetailDamageRelations implements Built<TypeDetailDamageRelations, TypeDetailDamageRelationsBuilder> {
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

  TypeDetailDamageRelations._();

  factory TypeDetailDamageRelations([void updates(TypeDetailDamageRelationsBuilder b)]) = _$TypeDetailDamageRelations;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeDetailDamageRelationsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeDetailDamageRelations> get serializer => _$TypeDetailDamageRelationsSerializer();
}

class _$TypeDetailDamageRelationsSerializer implements PrimitiveSerializer<TypeDetailDamageRelations> {
  @override
  final Iterable<Type> types = const [TypeDetailDamageRelations, _$TypeDetailDamageRelations];

  @override
  final String wireName = r'TypeDetailDamageRelations';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeDetailDamageRelations object, {
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
    TypeDetailDamageRelations object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeDetailDamageRelationsBuilder result,
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
  TypeDetailDamageRelations deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeDetailDamageRelationsBuilder();
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

