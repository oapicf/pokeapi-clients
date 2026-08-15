//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/location_area_detail_pokemon_encounters_inner_version_details_inner_encounter_details.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_detail_pokemon_encounters_inner_version_details_inner.g.dart';

/// LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
///
/// Properties:
/// * [version] 
/// * [maxChance] 
/// * [encounterDetails] 
@BuiltValue()
abstract class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner implements Built<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner, LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerBuilder> {
  @BuiltValueField(wireName: r'version')
  AbilityDetailPokemonInnerPokemon get version;

  @BuiltValueField(wireName: r'max_chance')
  int get maxChance;

  @BuiltValueField(wireName: r'encounter_details')
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails get encounterDetails;

  LocationAreaDetailPokemonEncountersInnerVersionDetailsInner._();

  factory LocationAreaDetailPokemonEncountersInnerVersionDetailsInner([void updates(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerBuilder b)]) = _$LocationAreaDetailPokemonEncountersInnerVersionDetailsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> get serializer => _$LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerSerializer();
}

class _$LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerSerializer implements PrimitiveSerializer<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> {
  @override
  final Iterable<Type> types = const [LocationAreaDetailPokemonEncountersInnerVersionDetailsInner, _$LocationAreaDetailPokemonEncountersInnerVersionDetailsInner];

  @override
  final String wireName = r'LocationAreaDetailPokemonEncountersInnerVersionDetailsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'version';
    yield serializers.serialize(
      object.version,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'max_chance';
    yield serializers.serialize(
      object.maxChance,
      specifiedType: const FullType(int),
    );
    yield r'encounter_details';
    yield serializers.serialize(
      object.encounterDetails,
      specifiedType: const FullType(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaDetailPokemonEncountersInnerVersionDetailsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.version.replace(valueDes);
          break;
        case r'max_chance':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.maxChance = valueDes;
          break;
        case r'encounter_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails),
          ) as LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails;
          result.encounterDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaDetailPokemonEncountersInnerVersionDetailsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerBuilder();
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

