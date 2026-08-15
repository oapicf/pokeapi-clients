//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:openapi/src/model/location_area_detail_pokemon_encounters_inner_version_details_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'location_area_detail_pokemon_encounters_inner.g.dart';

/// LocationAreaDetailPokemonEncountersInner
///
/// Properties:
/// * [pokemon] 
/// * [versionDetails] 
@BuiltValue()
abstract class LocationAreaDetailPokemonEncountersInner implements Built<LocationAreaDetailPokemonEncountersInner, LocationAreaDetailPokemonEncountersInnerBuilder> {
  @BuiltValueField(wireName: r'pokemon')
  AbilityDetailPokemonInnerPokemon get pokemon;

  @BuiltValueField(wireName: r'version_details')
  BuiltList<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner> get versionDetails;

  LocationAreaDetailPokemonEncountersInner._();

  factory LocationAreaDetailPokemonEncountersInner([void updates(LocationAreaDetailPokemonEncountersInnerBuilder b)]) = _$LocationAreaDetailPokemonEncountersInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LocationAreaDetailPokemonEncountersInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LocationAreaDetailPokemonEncountersInner> get serializer => _$LocationAreaDetailPokemonEncountersInnerSerializer();
}

class _$LocationAreaDetailPokemonEncountersInnerSerializer implements PrimitiveSerializer<LocationAreaDetailPokemonEncountersInner> {
  @override
  final Iterable<Type> types = const [LocationAreaDetailPokemonEncountersInner, _$LocationAreaDetailPokemonEncountersInner];

  @override
  final String wireName = r'LocationAreaDetailPokemonEncountersInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LocationAreaDetailPokemonEncountersInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'version_details';
    yield serializers.serialize(
      object.versionDetails,
      specifiedType: const FullType(BuiltList, [FullType(LocationAreaDetailPokemonEncountersInnerVersionDetailsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    LocationAreaDetailPokemonEncountersInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LocationAreaDetailPokemonEncountersInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.pokemon.replace(valueDes);
          break;
        case r'version_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(LocationAreaDetailPokemonEncountersInnerVersionDetailsInner)]),
          ) as BuiltList<LocationAreaDetailPokemonEncountersInnerVersionDetailsInner>;
          result.versionDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  LocationAreaDetailPokemonEncountersInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LocationAreaDetailPokemonEncountersInnerBuilder();
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

