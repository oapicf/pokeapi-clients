//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details.g.dart';

/// LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
///
/// Properties:
/// * [minLevel] 
/// * [maxLevel] 
/// * [conditionValues] 
/// * [chance] 
/// * [method] 
@BuiltValue()
abstract class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails implements Built<LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails, LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsBuilder> {
  @BuiltValueField(wireName: r'min_level')
  int get minLevel;

  @BuiltValueField(wireName: r'max_level')
  int get maxLevel;

  @BuiltValueField(wireName: r'condition_values')
  AbilityDetailPokemonInnerPokemon? get conditionValues;

  @BuiltValueField(wireName: r'chance')
  int get chance;

  @BuiltValueField(wireName: r'method')
  AbilityDetailPokemonInnerPokemon get method;

  LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails._();

  factory LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails([void updates(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsBuilder b)]) = _$LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails> get serializer => _$LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsSerializer();
}

class _$LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsSerializer implements PrimitiveSerializer<LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails> {
  @override
  final Iterable<Type> types = const [LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails, _$LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails];

  @override
  final String wireName = r'LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'min_level';
    yield serializers.serialize(
      object.minLevel,
      specifiedType: const FullType(int),
    );
    yield r'max_level';
    yield serializers.serialize(
      object.maxLevel,
      specifiedType: const FullType(int),
    );
    if (object.conditionValues != null) {
      yield r'condition_values';
      yield serializers.serialize(
        object.conditionValues,
        specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
      );
    }
    yield r'chance';
    yield serializers.serialize(
      object.chance,
      specifiedType: const FullType(int),
    );
    yield r'method';
    yield serializers.serialize(
      object.method,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'min_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.minLevel = valueDes;
          break;
        case r'max_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxLevel = valueDes;
          break;
        case r'condition_values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.conditionValues.replace(valueDes);
          break;
        case r'chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.chance = valueDes;
          break;
        case r'method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.method.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsBuilder();
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

